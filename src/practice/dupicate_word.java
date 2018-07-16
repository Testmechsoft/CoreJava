package practice;

import java.util.ArrayList;
import java.util.List;

public class dupicate_word {

	public static void main(String[] args) {

		String[] words = { "test", "all", "test", "abc", "all" };

		List<String> dupicate = new ArrayList<>();
		List<String> nondupicate = new ArrayList<>();

		for (String check : words) {

			if (!nondupicate.contains(check)) {

				nondupicate.add(check);
			}

			else {

				dupicate.add(check);

			}

		}

		System.out.println("Duplicate value :" + dupicate.toString());
	}

}
