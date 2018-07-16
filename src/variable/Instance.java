package variable;

/*    Declaration - Inside the class but outside the method
 *    Scope- inside class, method , constructor etc
 *    Memory - During object creation   
 *    Can have default values        
 */

public class Instance {

	int a;
	boolean b;
	double c;

	public Instance() {
		System.out.println(a);
		System.out.println(c);

	}

	public void print() {
		System.out.println(b);
	}

	public static void main(String[] args) {

		Instance I = new Instance();
		I.print();

	}

}
