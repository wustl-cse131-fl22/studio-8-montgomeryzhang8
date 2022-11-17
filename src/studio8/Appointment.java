package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	/**
	 * 
	 * @param date the date of the appointment
	 * @param time the time of the appointment
	 */
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	/**
	 * Returns the time and date of the appointment as a string
	 */
	public String toString() {
		return date.toString() + " " + time.toString();
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	
	
	
}
