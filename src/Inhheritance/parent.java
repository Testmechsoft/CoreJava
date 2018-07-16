package Inhheritance;

public class parent {
	
	
	int x =10; // variable

	parent() {// constructor
		
		super();

		System.out.println("Parent constructor");
	}

	{// Instance block

		System.out.println("Parent instance block");

	}

	static {// static block

		System.out.println("Parent static block");

	}

	public void m1() {//method
		
	
		System.out.println("Parent"+x);
	};

}
