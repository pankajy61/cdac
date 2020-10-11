package custom_comp;

import java.util.Comparator;

import com.app.core.BankAccount;

public class BankAccountDateBalanceComparator implements Comparator<BankAccount> {
	// T --type of the objs to be compared : BankAccount
	@Override
	public int compare(BankAccount a1, BankAccount a2) {
		System.out.println("in compare : date n bal ");
		// date : invokes LocalDate's compareTo : N.O
		int ret = a1.getCreationDate().compareTo(a2.getCreationDate());
		if (ret == 0)
			return ((Double) a1.getBalance()).compareTo(a2.getBalance());// explicit type required to give hint to javac
																			// n then javac will perform auto boxing for
																			// the argument
		return ret;
	}

}
