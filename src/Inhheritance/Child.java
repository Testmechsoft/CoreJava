package Inhheritance;

public class Child extends parent {
	
	
	int x =20; // variable

	Child() {

		System.out.println("child constructor");

	}

	{// Instance block

		System.out.println("child instance block");

	}

	static {// static block

		System.out.println("child static block");

	}

	public void m1() {
		
		super.m1();

		System.out.println("child"+x);
	};

	public static void main(String[] args) {

		new Child().m1();

	}

}
