package Object;

public class Creation {

	public void x() {

		System.err.println("Method called");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

		Creation c = new Creation();  //By new Operator
		
		
		//Creation c = (Creation)Class.forName("Object.Creation").newInstance();  By using Class.ForName
		
		
		//Creation c2 = (Creation)c.clone(); By cloning

		c.x();
	}

}
