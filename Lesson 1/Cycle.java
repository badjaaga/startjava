public class Cycle {  
	public static void main(String[] args) {		
		for(int i = 0; i <= 20; i++) {
			System.out.print(" " + i );	 
		}

		System.out.println();

		int a = 6;
		while(a >= -6) {
			System.out.print(" " + a);
			a -= 2;
		}
		
		System.out.println();

		int b = 10;
		int sum = 0;
		do {
			if(b % 2 != 0) {
		 		sum += b;
		 	}
		 	b++;
		} while (b <= 20);
			
		System.out.println(sum);
	}
}