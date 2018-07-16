package Array_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_array {
	public static void main(String[] args) {

		Integer[] array = { 1, 2, 3, 4, 5 };

		List<Integer> r = new ArrayList<>();
		r.addAll(Arrays.asList(array));

		System.out.println("Before reversing " + "" + r);
		
		Collections.reverse(r);

		System.out.println("After reversing " + "" + r);
	}
}
