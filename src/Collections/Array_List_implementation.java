package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_implementation {

	public static void main(String[] args) {

		Array_list_example a1 = new Array_list_example(10,"siddhartha", 29);
		Array_list_example a2 = new Array_list_example(11,"sid", 39);
		Array_list_example a3 = new Array_list_example(12,"sidd", 49);

		ArrayList<Array_list_example> list = new ArrayList<Array_list_example>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		Iterator  i =  list.iterator();
		
		while (i.hasNext()){
			
			Array_list_example al =(Array_list_example)i.next();
			
			System.out.println(al.roll+" "+al.name+" "+al.age);
		}

	}

}
