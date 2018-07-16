package String_prog;

public class stringcompare {

	public static void main(String[] args) {
	
		String str ="Hello world";
		String str1 ="Hello world";
		
		Object obj = str;
		
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str1.equals(obj));
		System.out.println(str1.compareTo(str));
		
		

	}

}
