package utils;

import java.util.ArrayList;
import static utils.BankAccountValidations.*;

import com.app.core.BankAccount;

import custom_excs.BankAccountHandlingException;

public class CollectionUtils {
//add a static method to ret populated list of accounts
	public static ArrayList<BankAccount> populateSampleData() throws BankAccountHandlingException {
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(new BankAccount(101, "Madhura", parseValidateAcctType("SAVING"), 10000,
				parseValidateCreationDate("2020-07-23")));
		list.add(new BankAccount(10, "Rama", parseValidateAcctType("CURRENT"), 9800,
				parseValidateCreationDate("2020-06-02")));
		list.add(new BankAccount(56, "Sameer", parseValidateAcctType("FD"), 100000,
				parseValidateCreationDate("2020-07-23")));
		list.add(new BankAccount(25, "Madhura", parseValidateAcctType("CURRENT"), 6000,
				parseValidateCreationDate("2020-05-13")));
		return list;
	}
}
