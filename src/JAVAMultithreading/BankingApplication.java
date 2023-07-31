package JAVAMultithreading;

import java.util.Scanner;

class Balance {
	
	public void balance(int balance)
	{
		System.out.println(" Account Balance:"+balance);
		BankingApplication.balancee=balance;
	}
}

class Withdraw 
{
	
public int withdraw(int balance,int amount)
{if(balance>amount)
	{balance=balance-amount;
	System.out.println("transaction done");
return balance;}
else
	{System.out.println("low account balance");
return balance;}
}


}

class Deposits
{
	public int deposit(int balance,int amount)
	{
		balance=balance+amount;
		System.out.println("balance updated");
		return balance;
	}}


public class BankingApplication extends Thread {
	static int balancee;
public void run() {
	int balance=new Deposits().deposit(balancee,1000);
	balance=new Withdraw().withdraw(balance, 2000);
	new Balance().balance(balance);
	
}
public static void main(String...ar)throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter balance");
	 balancee=sc.nextInt();
BankingApplication th=new BankingApplication();
BankingApplication th1=new BankingApplication();
th.start();
th.join();
th1.start();

}}
