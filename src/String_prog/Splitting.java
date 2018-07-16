package String_prog;

public class Splitting {

	public static void main(String[] args) {

		String s = "siddhartha   panda";

		String[] words = s.split("\\s");

		for (String w : words) {

			System.out.println(w);

		}

	}
}
