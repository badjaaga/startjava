public class MyFirstGame {
	public static void main(String... args) {
		int randomNumber = 69;
		int proposedNumber = 51;
		
		while (proposedNumber != randomNumber) {
			if (proposedNumber < randomNumber) {
				System.out.println("Proposed number is less than random number.");
				proposedNumber++;
			} else {
				System.out.println("Proposed number is higher than random number.");
				proposedNumber--;
			}
		} 
		System.out.println("Well done! You won!");
	}
}