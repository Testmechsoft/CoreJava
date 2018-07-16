package Datetime;

import java.time.LocalDate;

public class t_LocalDate {

	public void print() {

		LocalDate date = LocalDate.now();
		System.out.println("Date is  " + date);

	}

	public static void main(String args[]) throws InterruptedException {

		t_LocalDate obj = new t_LocalDate();
		obj.print();
	}

}
