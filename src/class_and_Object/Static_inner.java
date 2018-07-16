package class_and_Object;

//A static class i.e. created inside a class is called static nested class in java. It cannot access non-static data members and methods. 

public class Static_inner {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {

		Static_inner.Inner obj = new Static_inner.Inner();
		obj.msg();
	}
}
