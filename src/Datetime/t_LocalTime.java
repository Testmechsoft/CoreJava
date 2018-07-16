package Datetime;

import java.time.LocalDate;
import java.time.LocalTime;

public class t_LocalTime {

	public void print() {

		LocalTime time = LocalTime.now();
		System.out.println("Time is  " +time);

	}

	public static void main(String[] args) {
		t_LocalTime obj = new t_LocalTime();
		obj.print();

	}

}
