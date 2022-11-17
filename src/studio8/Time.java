package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean format;
	
	/**
	 * 
	 * @param hour the hour of the time
	 * @param minute the minute of the time
	 * @param format whether the format is 12-hour or 24-hour
	 */
	public Time(int hour, int minute, boolean format) {
		this.minute = minute;
		this.format = format;
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public boolean isFormat() {
		return format;
	}

	public void setFormat(boolean format) {
		this.format = format;
	}

	/**
	 * Returns the time as a string
	 */
	public String toString() {
		if(format) {
			if(hour > 12) {
				hour-=12;
				return hour + ":" + minute + " PM";
			}
			else {
				return hour + ":" + minute + " AM";
			}
		}
		else {
			return hour + ":" + minute;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		
		Time time = new Time(13, 30, true);
		Time time2 = new Time(13, 31, true);

		System.out.println(time.toString());
		System.out.println(time2.toString());

    	if(time.equals(time2)) {
    		System.out.println("hi");
    	}
    	
    	HashSet<Time> set = new HashSet<Time>();
    	set.add(time);
    	set.add(time2);
    	
    	System.out.println(set);
    	
    }

}