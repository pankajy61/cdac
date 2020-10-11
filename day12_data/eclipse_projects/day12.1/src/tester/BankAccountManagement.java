package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.core.AcType;
import com.app.core.BankAccount;

import custom_excs.BankAccountHandlingException;

import static utils.BankAccountValidations.*;
import static utils.CollectionUtils.*;

public class BankAccountManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			// create empty AL to store acct info
			ArrayList<BankAccount> accounts = populateSampleData();
			while (!exit) {
				System.out.println("1 . Create A/c 2. Display all accts 3. Check for existence 4. Get A/C Summary\n"
						+ "5 : Funds Transfer 6 : Cllose A/C 7. Search by Ac Type 8. Sort A/cs as per acct no 100.Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // create new acct
						System.out.println("Enter a/c info : accNO name type balance creationDate");
						BankAccount newAcct = new BankAccount(sc.nextInt(), sc.next(),
								parseValidateAcctType(sc.next().toUpperCase()), validateBalance(sc.nextDouble()),
								parseValidateCreationDate(sc.next()));
						accounts.add(newAcct);
						System.out.println("Acct created ....");

						break;
					case 2: // display all : for each
						for (BankAccount a : accounts)
							System.out.println(a);
						break;
					case 3: // check if a/c exists
						System.out.println("Enter acct no");
						int acctNo = sc.nextInt();
						BankAccount ref = new BankAccount(acctNo);
						System.out.println(accounts.contains(ref) ? "Exists" : "Doesn't Exist");
						break;
					case 4: // get a/c summary
						System.out.println("Enter acct no for checking a/c summary");
						ref = new BankAccount(sc.nextInt());// equivalent to boxing

						// indexOf --index of 1st n only occurrence
						// get (index) --BankAccount
						int index = accounts.indexOf(ref);
						if (index == -1)
							throw new BankAccountHandlingException("Invalid Account no !!!!!");
						System.out.println("Summary : " + accounts.get(index));

						break;
					case 5:
						System.out.println("Enter src acc no , dest acc no n amount");
						BankAccount src = validateBankAccountNo(sc.nextInt(), accounts);
						BankAccount dest = validateBankAccountNo(sc.nextInt(), accounts);
						src.fundsTransfer(dest, sc.nextDouble());
						break;
					case 6://Close a/c : public boolean remove(Object o)
						System.out.println("Enter acct no for closing");
						boolean removed=accounts.remove(new BankAccount(sc.nextInt()));
						if(!removed)
							throw new BankAccountHandlingException("Invalid A/C NO : Can't close");
						System.out.println("A/C Closed....");
						
						break;
					case 7:
						System.out.println("Enter a/c type ");
						String acType=sc.next();
						System.out.println("Phone nos of Customers having A/C Type : "+acType);
						AcType type=parseValidateAcctType(acType);
						for(BankAccount a : accounts)
							if(a.getAcctType().equals(type))
								System.out.println(a.getCustomerInfo().getPhoneNo());
						break;
					case 8 : //sort a/cs as per acct nos.(asc)
					//	Collections.sort(accounts);
						break;
						
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry...");
				}
				// to clear pending tokens from sc's buffer
				sc.nextLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
