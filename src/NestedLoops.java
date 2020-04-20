
public class NestedLoops {

	public static void main(String[] args) {
		
		/*
		 * while loop --> 3 times
		 * for loop ----> 4 times
		 * do-while loop ---> 5 times
		 * 3 * 4 * 5 = 60 times total runs
		 */
		
		int i = 0;
		int count = 0;
		
		while(i < 3) {		
			for(int j = 0; j < 4; j++) {	
				
				int k = 0;
				do {					
					System.out.println("i---> " + i + " j---> " + j + " k---> " + k);
					k++;
					count++;
				} while(k < 5);
							
			}
			
			i++;		
		}
		System.out.println("Total count is: " + count);
	}

}
