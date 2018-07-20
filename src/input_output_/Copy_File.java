package input_output_;

import java.io.File;

import org.openqa.selenium.io.FileHandler;

public class Copy_File {

	static {

		try {

			FileHandler.copy(new File("C:\\Users\\Siddhartha\\Desktop\\Src\\weeklyreport.txt"),
					new File("C:\\Users\\Siddhartha\\Desktop\\Dest\\t2.txt"));

		} catch (Exception e) {

		}

	}

	public static void main(String[] args) {

//		try {
//
//			FileHandler.copy(new File("C:\\Src"), new File("C:\\Dest"), ".txt");
//
//			System.out.println("Copied");
//
//		} catch (Exception e) {
//
//		}

	}

}
