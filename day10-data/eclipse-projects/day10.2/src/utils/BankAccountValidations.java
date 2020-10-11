package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.core.AcType;
import com.app.core.BankAccount;
import static com.app.core.AcType.*;

import custom_excs.BankAccountHandlingException;

public class BankAccountValidations {
	public static final double MIN_BALANCE;
	public static SimpleDateFormat sdf;
	public static Date beginDate, endDate;
	// static init block
	static {
		MIN_BALANCE = 1000;
		sdf = new SimpleDateFormat("dd-MM-yyyy");
		try {
			beginDate = sdf.parse("1-4-2020");
			endDate = sdf.parse("31-3-2021");
		} catch (ParseException e) {
			System.out.println("exc in static init block " + e);
		}
	}

	// add a static method for validating min bal
	public static double validateBalance(double balance) throws BankAccountHandlingException {
		if (balance < MIN_BALANCE)
			throw new BankAccountHandlingException("Insufficient Funds!!!!!");
		return balance;
	}

	// add a static method for parsing n validating creation date
	public static Date parseValidateCreationDate(String date) throws ParseException, BankAccountHandlingException {
		Date d1 = sdf.parse(date);
		// parsing success
		if (d1.before(beginDate) || d1.after(endDate))
			throw new BankAccountHandlingException("Invalid creation date!!!!!");
		// validation success
		return d1;
	}

	// add public static method to validate account no
	public static BankAccount validateBankAccountNo(int acctNo, BankAccount[] bankAccts)
			throws BankAccountHandlingException {
		for (BankAccount a : bankAccts)
			if (a != null)
				if (a.getAcctNo() == acctNo)
					return a;
		throw new BankAccountHandlingException("Invalid Account Number!!!!!");

	}
	//add public static method to parse n validate acct type
	public static AcType parseValidateAcctType(String accType)
	{
		return valueOf(accType);
	}

}
