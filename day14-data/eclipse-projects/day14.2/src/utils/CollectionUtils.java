package utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static utils.BankAccountValidations.*;

import com.app.core.BankAccount;

import custom_excs.BankAccountHandlingException;

public class CollectionUtils {
//add a static method to ret populated list of accounts
	public static ArrayList<BankAccount> populateSampleData() throws BankAccountHandlingException {
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(new BankAccount(101, "Madhura", parseValidateAcctType("SAVING"), 10000,
				parseValidateCreationDate("2020-04-02")));
		list.add(new BankAccount(10, "Rama", parseValidateAcctType("CURRENT"), 19800,
				parseValidateCreationDate("2020-07-23")));
		list.add(new BankAccount(56, "Sameer", parseValidateAcctType("FD"), 10000,
				parseValidateCreationDate("2020-04-13")));
		list.add(new BankAccount(25, "Madhura", parseValidateAcctType("LOAN"), 6000,
				parseValidateCreationDate("2020-05-13")));
		return list;
	}

	// add a method to convert (copy of refs) ArrayList --HashSet
	public static HashSet<BankAccount> populateSet(List<BankAccount> list) {
		return new HashSet<>(list);
	}
}
