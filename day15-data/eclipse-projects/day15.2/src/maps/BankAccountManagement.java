package maps;

import java.util.Map;
import java.util.Scanner;

import com.app.core.BankAccount;

import static utils.BankAccountValidations.parseValidateAcctType;
import static utils.BankAccountValidations.parseValidateCreationDate;
import static utils.CollectionUtils.*;
import static utils.BankAccountValidations.*;

public class BankAccountManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Integer, BankAccount> acctMap = populateSampleMap(populateSampleData());
			boolean exit = false;
			while (!exit) {
				System.out.println("Menu 1 . Open Account 2. Display all accounts 10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter a/c details a/c no name type balance date");
						int acctNo = sc.nextInt();
						System.out.println(
								acctMap.putIfAbsent(acctNo, new BankAccount(acctNo, sc.next(), parseValidateAcctType(sc.next()),
										validateBalance(sc.nextDouble()), parseValidateCreationDate(sc.next()))));

						break;
					case 2:
						System.out.println(acctMap);
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry");
				}
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
