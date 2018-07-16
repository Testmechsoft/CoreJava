package Conversion;

public class String_to_int {

	public static void main(String[] args) {
		
		String s ="200";
		
		int i = Integer.parseInt(s);
		
		Integer x = Integer.valueOf(s);
		
		System.out.println(i+100);
		
		System.out.println(x+100);

	}

}
