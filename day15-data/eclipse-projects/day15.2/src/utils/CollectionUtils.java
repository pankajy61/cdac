package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import static utils.BankAccountValidations.*;

import com.app.core.BankAccount;

import custom_excs.BankAccountHandlingException;

public class CollectionUtils {
//add a static method to ret populated list of accounts
	public static ArrayList<BankAccount> populateSampleData() throws BankAccountHandlingException {
		ArrayList<BankAccount> list = new ArrayList<>();
		list.add(new BankAccount(101, "Madhura", parseValidateAcctType("SAVING"), 10000,
				parseValidateCreationDate("2020-05-13")));
		list.add(new BankAccount(10, "Rama", parseValidateAcctType("CURRENT"), 19800,
				parseValidateCreationDate("2020-07-23")));
		list.add(new BankAccount(56, "Sameer", parseValidateAcctType("FD"), 10000,
				parseValidateCreationDate("2020-04-15")));
		list.add(new BankAccount(25, "Madhura", parseValidateAcctType("LOAN"), 6000,
				parseValidateCreationDate("2020-05-13")));
		list.add(new BankAccount(34, "Shekhar", parseValidateAcctType("SAVING"), 10000,
				parseValidateCreationDate("2020-04-13")));
		list.add(new BankAccount(45, "Raj", parseValidateAcctType("SAVING"), 6000,
				parseValidateCreationDate("2020-05-13")));
		list.add(new BankAccount(100, "Riya", parseValidateAcctType("CURRENT"), 7200,
				parseValidateCreationDate("2020-05-14")));
		list.add(new BankAccount(75, "Anish", parseValidateAcctType("SAVING"), 60000,
				parseValidateCreationDate("2020-05-13")));
		return list;
	}

	// add a method to convert (copy of refs) ArrayList --HashSet
	public static HashSet<BankAccount> populateSet(List<BankAccount> list) {
		return new HashSet<>(list);
	}

	// add a method to ret a populated Map to user.
	public static Map<Integer, BankAccount> populateMap() throws BankAccountHandlingException {
		HashMap<Integer, BankAccount> hm = new HashMap<>();// capa=16 ; L.F .75
		System.out.println("old val ref "+hm.put(101, new BankAccount(101, "Madhura", parseValidateAcctType("SAVING"), 10000,
				parseValidateCreationDate("2020-05-13"))));
		System.out.println("old val ref "+hm.put(101, new BankAccount(101, "Rama", parseValidateAcctType("SAVING"), 17000,
				parseValidateCreationDate("2020-06-14"))));
		System.out.println(hm.size());//1
		return hm;

	}
	// add a method to ret a populated Map to user.
		public static Map<Integer, BankAccount> populateSampleMap(ArrayList<BankAccount> list) throws BankAccountHandlingException {
			HashMap<Integer, BankAccount> hm = new HashMap<>();// capa=16 ; L.F .75
			//populate HM from existing AL sample data
			for(BankAccount a : list)
				System.out.println(hm.put(a.getAcctNo(), a));
			return hm;

		}
}
