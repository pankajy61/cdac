package custom_comp;

import java.util.Comparator;

import com.app.core.BankAccount;

public class BankAccountDateTypeComparator implements Comparator<BankAccount> {

	@Override
	public int compare(BankAccount o1, BankAccount o2) {
		System.out.println("in compare : date n type");
		// date based
		int retVal=o1.getCreationDate().compareTo(o2.getCreationDate());//LocalDate's compareTo
		if(retVal == 0)
		{
		    int ret2Val=o1.getAcctType().compareTo(o2.getAcctType()); //Enum's compareTo
			/*
			 * if(ret2Val == 0) return ((Integer)o1.getAcctNo()).compareTo(o2.getAcctNo());
			 */	    return ret2Val;
		}
		return retVal;
	}

}
