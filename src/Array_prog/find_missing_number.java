package Array_prog;

public class find_missing_number {
	
	

	public static void main(String[] args) {

		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 9 };

		

		int size = numbers.length;
		size=size-1;
		
		int expected = size*(size+1)/2;
		
	

		
		int Actual=0;
		int missing1 =0;
		for (int i = 0; i <size; i++) {

			Actual += numbers[i] ;	
			 missing1 = Actual-expected;
			

		} 
		
	
		
		System.out.println("missing number is : "+""+missing1);
	}

}
