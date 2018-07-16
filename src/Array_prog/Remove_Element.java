package Array_prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Remove_Element {

	public static void main(String[] args) {

		String a[] = { "A", "E", "I", "O", "U" };

		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(a));
	

		list.remove(3);

		System.out.println(list);

	}

}
