package Array_prog;

import java.util.Arrays;

public class Sort_array {

	public static void main(String[] args) {

		int[] array = { -10, 0, -5, 10, 78, 26 };

		System.out.println("Before sorting:");

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

		Arrays.sort(array);

		System.out.println("After sorting:");

		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);

		}

	}
}
