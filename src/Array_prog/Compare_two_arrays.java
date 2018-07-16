package Array_prog;

import java.util.Arrays;

public class Compare_two_arrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };

		int[] arr2 = { 1, 2, 3, 4, 5, 6 };

		int[] arr3 = { 1, 2, 3, 4, 5 };

		System.out.println("comparing 1 & 2" + " :"+Arrays.equals(arr1, arr2));

		System.out.println("comparing 1 & 3" +" :"+ Arrays.equals(arr1, arr3));

		System.out.println("comparing 2 & 3" + " :"+Arrays.equals(arr2, arr3));

	}

}
