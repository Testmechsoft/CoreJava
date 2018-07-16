package variable;

/*    Declaration - Inside the class but outside the method with static keyword
 *    Scope- inside class, method , constructor etc
 *    Memory - During .class load
 *    Can have default values        
 */

public class Static {

	static int a = 10;
	static boolean b = false;
	static double c = 10.23;

	public void print() {
		
		System.out.println(b);
	}

	static void test() {

		System.out.println(Static.a);
		System.out.println(c);

	}

	public static void main(String[] args) {

		Static I = new Static();
		test();
	}

}
