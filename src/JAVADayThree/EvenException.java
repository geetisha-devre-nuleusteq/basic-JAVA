package JAVADayThree;
import java.util.Scanner;

class InvalidException extends Exception {
	public InvalidException(String str) {
		super(str);
	}}
public class EvenException {
	



	
	
		public static void main(String... ar) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number to check its divisiblity with 2");
			int num = sc.nextInt();
			
			try {
				invalid(num);
			} catch (InvalidException ex) {
				System.out.println("invalid"+ex);
			}
		}
		

		static void invalid(int num) throws InvalidException {
			
				if (num%2!=0)  {
					throw new InvalidException("number is not even");
				} else
					System.out.println("number is even");
			
		
	}
}


