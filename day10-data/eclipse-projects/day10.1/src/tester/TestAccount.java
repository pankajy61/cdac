package tester;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.app.core.BankAccount;

import static utils.BankAccountValidations.validateBalance;

public class TestAccount {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))//i/f : AutoCloseable : close
		{
			System.out.println("Enter bank account details acctNo customerName acctType balance creationDate");
		    //accept i/ps : validate
			int acctNo=sc.nextInt();
			String name=sc.next();
			String type=sc.next();
			double validatedBalance=validateBalance(sc.nextDouble());
			//date ????????????????? string ---> Date
			//SDF 
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date creationDate=sdf.parse(sc.next());
			//create bank account
			BankAccount acct=new BankAccount(acctNo, name, type, validatedBalance, creationDate);
			System.out.println("A/C created : summary "+acct);
			
			
					
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
