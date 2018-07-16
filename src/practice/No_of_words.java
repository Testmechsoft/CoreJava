package practice;

import java.util.Scanner;

public class No_of_words {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the text :");

		String s = sc.nextLine();

		String[] words = s.trim().split("");

		System.out.println(words.length);

	}

}
