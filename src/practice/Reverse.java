package practice;

public class Reverse {

	public static void main(String[] args) {

		String s = "siddhartha";

		StringBuffer str = new StringBuffer(s);

		// System.out.println(str.reverse()); using method

		char[] ch = s.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {

			System.out.print(ch[i]);

		}

	}

}
