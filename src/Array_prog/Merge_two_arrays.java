package Array_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_two_arrays {

	public static void main(String[] args) {

		String a[] = { "A", "E", "I" };
		String b[] = { "O", "U" };

		List<String> list = new ArrayList<String>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));

		System.out.println(list);
	}

}
