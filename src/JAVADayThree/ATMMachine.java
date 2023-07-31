package JAVADayThree;

import java.util.Scanner;

class InvalidInputException extends Exception {
	public InvalidInputException(String str) {
		super(str);
	}
}

public class ATMMachine {
	public static void main(String... ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter account balance and amount to be withdrawn");
		long account = sc.nextLong();
		long withdraw = sc.nextLong();
		try {
			invalid(withdraw, account);
		} catch (InvalidInputException ex) {
			System.out.println("exception occured" + ex);
		}
	}

	static void invalid(long withdraw, long account) throws InvalidInputException {
		{
			if ((withdraw <= account) || (withdraw <= 0)) {
				throw new InvalidInputException("transaction failed");
			} else
				System.out.println("transction processed");
		}
	}
}
