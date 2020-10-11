package tester;

import static utils.BankAccountValidations.*;

import java.util.Scanner;

import com.app.core.BankAccount;
import com.app.core.KYC;

import custom_excs.BankAccountHandlingException;

public class TestAccount3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in))// i/f : AutoCloseable : close
		{
			boolean exit = false;
			int counter = 0;
			// array of refs : to hold BankAccount info
			System.out.println("Enter Max capacity of a Bank");
			BankAccount[] accts = new BankAccount[sc.nextInt()];
			while (!exit) {
				System.out.println("Menu 1. Create Account  2. Display All 3. Link KYC Info 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter bank account details acctNo customerName acctType balance creationDate(day-mon-yr)");

						// validate i/ps n create bank account
						BankAccount acct = new BankAccount(sc.nextInt(), sc.next(),
								parseValidateAcctType(sc.next().toUpperCase()),
								validateBalance(sc.nextDouble()), parseValidateCreationDate(sc.next()));
						// validation success : now add the acct ref. in the array
						accts[counter++] = acct;

						System.out.println("A/C created ");

						break;
					case 2: // display all accts
						System.out.println("All A/Cs Summary");
						for (BankAccount a : accts)
							if (a != null)
								System.out.println(a);
						break;
					case 3: // link KYC info
						System.out.println("Enter acct no , KYC info : email  city adharCard phoneNo");
						// validate account no (get account ref from acct no)
						int acctNo = sc.nextInt();
						/*
						 * boolean found = false; for (BankAccount a : accts) if (a != null) if
						 * (a.getAcctNo() == acctNo) { // link KYC a.linkCustomerInfo(new KYC(sc.next(),
						 * sc.next(), sc.next(), sc.next())); found = true;
						 * 
						 * } if(!found) throw new
						 * BankAccountHandlingException("Invalid A/C No : Linking KYC Failed!!!!!");
						 */
						BankAccount validAccount = validateBankAccountNo(acctNo, accts);
						KYC x=new KYC(sc.next(), sc.next(), sc.next(), sc.next());
						//validAccount.linkCustomerInfo(new KYC(sc.next(), sc.next(), sc.next(), sc.next()));
						validAccount.linkCustomerInfo(x);
						break;
					case 4: // withdraw : acct no , amount
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error occurred " + e);
					System.out.println("Pls retry....");
				}

				// to clear off any pending tokens from scanner's buffer
				sc.nextLine();

			}

		}

	}

}
