package tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.app.core.BankAccount;

import static utils.BankAccountValidations.*;

public class TestAccount2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))//i/f : AutoCloseable : close
		{
			System.out.println("Enter bank account details acctNo customerName acctType balance creationDate(day-mon-yr)");
		  
			//validate i/ps n create bank account
			BankAccount acct=new BankAccount(sc.nextInt(), sc.next(), sc.next(), 
					validateBalance(sc.nextDouble()),parseValidateCreationDate(sc.next()));
			System.out.println("A/C created : summary "+acct);
			
			
					
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
