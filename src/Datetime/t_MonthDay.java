package Datetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class t_MonthDay {

	public void print() {

		MonthDay m = MonthDay.now();
		LocalDate l = m.atYear(2006);
		System.out.println("Monthday is  " + l);

	}

	public static void main(String[] args) {

		t_MonthDay obj = new t_MonthDay();
		obj.print();

	}

}
