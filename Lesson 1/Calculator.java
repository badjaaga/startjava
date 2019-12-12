 public class Calculator{
 	public static void main(String[] args) {
 		int a = 6;
 		int b = 4;
 		String mathSign = "%";
 		if(a <= 0 || b <=0) {
 			System.out.println("Numbers should be higher than 0");
 		} else {
 			if(mathSign == "+") {
 				System.out.println("Result: " + (a+b));
 			} else if(mathSign == "-") {
 				System.out.println("Result: " + (a-b));
 			} else if(mathSign == "*") {
 				System.out.println("Result: " + (a*b));
 			} else if(mathSign == "/") {
 				System.out.println("Result: " + (a/b));
 			} else if(mathSign == "^") {
 				int result = a;
 				for(int i = 1; i < b; i++) {
 					result *= a;
 				}
 				System.out.println("Result: " + result);
 			} else if(mathSign == "%") {
 				System.out.println("Result: " + (a%b));
 			} else {
 				System.out.println("Unknown sign.");
 			}
 		}
 	}
 }