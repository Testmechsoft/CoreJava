package String_prog;

public class Reverse_string {

	public static void main(String[] args) {

		String str = "abcdef";

		String b = new StringBuilder(str).reverse().toString();

		System.out.println(b);

		String input = "tutorialspoint";
		char[] try1 = input.toCharArray();
		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);

	}

}
