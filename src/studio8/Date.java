package studio8;

import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holidayOrNot;

	/**
	 * 
	 * @param month The month of the date
	 * @param day the day of the date
	 * @param year the year of the date
	 * @param holidayOrNot whether the date is a holiday or not
	 */
	public Date (int month, int day, int year, boolean holidayOrNot) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.holidayOrNot = holidayOrNot;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHolidayOrNot() {
		return holidayOrNot;
	}

	public void setHolidayOrNot(boolean holidayOrNot) {
		this.holidayOrNot = holidayOrNot;
	}

	/**
	 * Returns the date as a string
	 */
	public String toString() {
		return month + "/" + day + "/" + year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date date = new Date(11, 17, 2022, false);
		Date date2 = new Date(11, 18, 2022, true);
		System.out.println(date.toString());
		System.out.println(date2.toString());
		
		if(date.equals(date2)) {
			System.out.println("hi");
		}

	}
}
