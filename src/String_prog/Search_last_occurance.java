package String_prog;

public class Search_last_occurance {

	public static void main(String[] args) {

		String strOrig = "Hello world ,Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");

		if (lastIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Last occurrence of Hello is at index " + lastIndex);
		}
	}

}