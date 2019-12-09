public class ConditionalStatement {
	public static void main(String[] args) {

		int age = 30;
		if(age > 20) {
			System.out.println("You are lucky");
		}

		boolean isMale = true;
		if(isMale) {
			System.out.println("Congratulations!");
		}
		
		if(!isMale) {
			System.out.println("Are you sure?");
		}

		double height = 1.90;
		if(height < 1.80) {
			System.out.println("Congratulations!");
		} else {
			System.out.println("Are you sure?");
		}

		char firstLetterOfName = 'M';
		if(firstLetterOfName == 'M') {
			System.out.println("The first letter of your name is M");
		} else if(firstLetterOfTheName == 'I'){
			System.out.println("The first letter of your name is N");
		} else {
			System.out.println("The first letter of your name is not M and not N");
		}
	}
}