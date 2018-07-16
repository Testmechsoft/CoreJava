package class_and_Object;

//A class created within class and outside method.

public class Nonstatic_member_outer {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String[] args) {

		Nonstatic_member_outer out = new Nonstatic_member_outer();
		Inner in = out.new Inner();
		in.msg();

	}

}
