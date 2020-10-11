package tester;

import static utils.CollectionUtils.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import com.app.core.BankAccount;

import custom_comp.BankAccountDateTypeComparator;

public class TestAnoInnerClass {

	public static void main(String[] args) throws Exception {
		ArrayList<BankAccount> list = populateSampleData();
		// Display bank account info sorted as per creation date , type (Custom
		// ordering) using ano inner class
		TreeSet<BankAccount> ts = new TreeSet<>(new Comparator<BankAccount>() {

			@Override
			public int compare(BankAccount o1, BankAccount o2) {
				System.out.println("in compare ano inner  : date n type");
				// date based
				int retVal = o1.getCreationDate().compareTo(o2.getCreationDate());// LocalDate's compareTo
				if (retVal == 0) {
					int ret2Val = o1.getAcctType().compareTo(o2.getAcctType());
					// Enum's compareTo
					/*
					 * if(ret2Val == 0) return ((Integer)o1.getAcctNo()).compareTo(o2.getAcctNo());
					 */ return ret2Val;
				}
				return retVal;
			}

		});
		ts.addAll(list);
		for(BankAccount a : ts)
			System.out.println(a);
		
	}

}
