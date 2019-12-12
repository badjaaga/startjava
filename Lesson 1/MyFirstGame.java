public class MyFirstGame {
	public static void main(String... args){
		int randomNumber = 51;
		int proposedNumber = 45;
		while (randomNumber != proposedNumber) {
			if (randomNumber > proposedNumber) {
				System.out.println("Proposed number is less than random number.");
			} else {
				System.out.println("Proposed number is higher than random number.");
			}
			proposedNumber++;
		} 
		System.out.println("Well done! You won!");
	}
}