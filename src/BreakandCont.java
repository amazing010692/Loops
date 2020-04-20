
public class BreakandCont {
	
	public void go() {
		
		System.out.println("First");

		System.out.println("Last");
		
	}

	public static void main(String[] args) {
		
		for(int i = 0; i <10; i++) {
			
			if(i >= 5 && i <= 7) 
				continue;
				System.out.println(i);
			
		}
		
		System.out.println("Outside the loop");

	}

}
