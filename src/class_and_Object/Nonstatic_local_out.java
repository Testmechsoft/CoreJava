package class_and_Object;


//A class i.e. created inside a method is called local inner class in java
public class Nonstatic_local_out {

	private int data = 30;

	void display() {

		class Local {

			void msg() {System.out.println(data);}
		}
			
			Local l = new Local();
			l.msg();
		}
	
	public static void main(String args[]) {
	Nonstatic_local_out out = new Nonstatic_local_out();
	out.display();

	}

	}



