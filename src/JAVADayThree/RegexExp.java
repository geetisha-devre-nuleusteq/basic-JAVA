package JAVADayThree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Password extends Exception {
	public  Password(String str) {
		super(str);
	}
}

public class RegexExp {

	static void invalidP(String pwd,Boolean output)throws Password
	{if (output.equals(false)) {throw new Password("invalid password");
		
		
		
	}
	else 
		System.out.println("welcome");}
	public static void main(String... ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password");
		String pwd = sc.next();
		String str = "(?=.*[0-9])+(?=.*[a-z])+(?=.*[A-Z])+(?=.*[@#$%^&-+=()])+(?=\\S+$)+.{8,20}$";
		Pattern pr = Pattern.compile(str);
		if (pwd == null) {
			System.out.println("null password");
		}
		Matcher m = pr.matcher(pwd);
		Boolean output=m.matches();
		try {invalidP(pwd,output);}
		catch(Password p)
		{System.out.println("invalid password format");}
		
		

	}

}
