package Datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class t_LocalDatetime {

	public void print() {

		LocalDateTime ltime = LocalDateTime.now();
		System.out.println("Date time before formatting is  " + ltime);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-mm-yy HH:mm:ss");
		System.out.println("Date time after formatting is  " + f);
		

	}

	public static void main(String[] args) {
		t_LocalDatetime obj = new t_LocalDatetime();
		obj.print();

	}

}
