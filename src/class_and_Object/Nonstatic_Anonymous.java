package class_and_Object;

//A class that have no name is known as anonymous inner class in java. It should be used if you have to override method of class or interface. 

abstract class AnonymousInner {
	public abstract void mymethod();
}

public class Nonstatic_Anonymous {

	public static void main(String args[]) {
		AnonymousInner inner = new AnonymousInner() {
			public void mymethod() {
				System.out.println("This is an example of anonymous inner class");
			}
		};

		inner.mymethod();
	}
}
