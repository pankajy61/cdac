package tester;

import static utils.CollectionUtils.*;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

import com.app.core.BankAccount;

import custom_comp.BankAccountDateTypeComparator;

public class TestBankAccountSet {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get a populated HS n display the same.
			HashSet<BankAccount> acctSet = populateSet(populateSampleData());
			
			//display for-each
			System.out.println("Bank Accounts : HS");
			for(BankAccount a : acctSet)
				System.out.println(a);
			//Display bank account info sorted as per acct nos.(Natural ordering)
			//TreeSet(Collection<E> collection)
			TreeSet<BankAccount> acctSet2=new TreeSet<>(acctSet);
			System.out.println("Sorted Bank Accounts  as per acct no : TS1");
			for(BankAccount a : acctSet2)
				System.out.println(a);
			//Display bank account info sorted as per creation date , type (Custom ordering)
			//TreeSet(Comparator<E> comp)
			TreeSet<BankAccount> acctSet3=new TreeSet<>(new BankAccountDateTypeComparator());
			System.out.println(acctSet3);//empty set
			acctSet3.addAll(acctSet);
			System.out.println("Sorted Bank Accounts  as per acct date n type  : TS2");
			for(BankAccount a : acctSet3)
				System.out.println(a);
	
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
