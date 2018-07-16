package variable;

public class Test extends Static {

	public void test1() {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

	public static void main(String[] args) {

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		Test x = new Test();
		x.test1();
		
		
	}

}
