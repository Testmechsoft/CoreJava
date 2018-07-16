package Test;

public class Palliandrome {

	public void check_Paliandrome(String value) {

		Boolean ispaliandrome = value.equalsIgnoreCase(new StringBuffer(value).reverse().toString());

		if (!ispaliandrome) {
			
			
			System.out.println(value + ":" + "Is not paliandrome");
			
			
			
		} else {
			System.out.println(value + ":" + "Is  paliandrome");
		}

	}

	public static void main(String[] args) {

		Palliandrome p = new Palliandrome();
		p.check_Paliandrome("TEST");

	}

}
