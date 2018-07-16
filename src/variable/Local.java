package variable;

/*    Declaration - Inside  method
 *    Scope- Inside  method
 *    Memory - During method start and end after method ends  
 *    Can not  have default values        
 */

public class Local {

	public Local() {

	}

	public void print() {
		int a = 10;
		boolean b = true;
		double c = 20.0;

		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
	}

	public static void main(String[] args) {

		Local I = new Local();
		I.print();

	}

}
