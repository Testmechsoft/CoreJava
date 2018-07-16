package Conversion;

public class Convert {

	public static void main(String[] args) {
		String s = "2000";
		int u = 65;

		System.out.println("/********************** ***String***************************/");

		int i = Integer.parseInt(s);
		System.out.println("String to int value is " + "-----" + i);

		long l = Long.parseLong(s);
		System.out.println("String to long value is " + "-----" + l);

		float f = Float.parseFloat(s);
		System.out.println("String to float value is " + "-----" + f);

		double d = Double.parseDouble(s);
		System.out.println("String to double value is " + "-----" + d);

		char c = s.charAt(0);
		System.out.println("String to character value is " + "-----" + c);

		Object o = s;
		System.out.println("String to object value is " + "-----" + o);

		boolean b = Boolean.parseBoolean(s);
		System.out.println("String to boolean value is " + "-----" + b);

		System.out.println("/********************** ***int***************************/");

		String str = String.valueOf(u);
		System.out.println("int to string value is " + "-----" + str);

		long lr = Long.valueOf(u);
		System.out.println("long to int value is " + "-----" + lr);

		double dr = Double.valueOf(u);
		System.out.println("double to int value is " + "-----" + dr);

		char cr = (char) u;
		System.out.println("char to string value is " + "-----" + cr);
		
		

	}

}
