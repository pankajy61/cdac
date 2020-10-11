package utils;

import static com.app.core.AcType.valueOf;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.AcType;
import com.app.core.BankAccount;
import static java.time.LocalDate.*;
import custom_excs.BankAccountHandlingException;

public class BankAccountValidations {
	public static final double MIN_BALANCE;

	public static LocalDate beginDate, endDate;
	// static init block
	static {
		MIN_BALANCE = 1000;
		// def date format : yyyy-MM-dd
		beginDate = parse("2020-01-04");
		endDate = parse("2021-03-31");

	}

	// add a static method for validating min bal
	public static double validateBalance(double balance) throws BankAccountHandlingException {
		if (balance < MIN_BALANCE)
			throw new BankAccountHandlingException("Insufficient Funds!!!!!");
		return balance;
	}

	// add a static method for parsing n validating creation date
	public static LocalDate parseValidateCreationDate(String date) throws BankAccountHandlingException {
		LocalDate d1 = parse(date);
		// parsing success
		if (d1.isBefore(beginDate) || d1.isAfter(endDate))
			throw new BankAccountHandlingException("Invalid creation date!!!!!");
		// validation success
		return d1;
	}

	// add public static method to validate account no
	public static BankAccount validateBankAccountNo(int acctNo, ArrayList<BankAccount> list)
			throws BankAccountHandlingException {
		int index = list.indexOf(new BankAccount(acctNo));// boxing
		if (index == -1)
			throw new BankAccountHandlingException("Invalid Account Number!!!!!");
		return list.get(index);

	}

	// add public static method to parse n validate acct type
	public static AcType parseValidateAcctType(String accType) {
		return valueOf(accType);
	}

}
