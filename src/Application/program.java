package Application;


import java.util.InputMismatchException;
import java.util.Scanner;
import Model.Entities.Account;
import Model.Exceptions.DomainException;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		try {
			System.out.println("Enter account data:");
			System.out.print("Number:");
			int number = sc.nextInt();
			System.out.print("Holder");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Inicial Balance:");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit:");
			double limit = sc.nextDouble();
			Account acc = new Account(number, holder, balance, limit);
			
			System.out.print("Enter amount for withdraw:");
			double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);
			
			System.out.print(acc);		
		}
		
		catch (InputMismatchException e) {
			System.out.print("Input error");
	
		}
		catch (DomainException e) {
			System.out.print("withdraw error:" + e.getMessage());
					
		}
		sc.close();
	}			
}




