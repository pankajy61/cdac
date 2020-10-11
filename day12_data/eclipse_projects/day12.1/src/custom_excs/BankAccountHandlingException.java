package custom_excs;


@SuppressWarnings("serial")
public class BankAccountHandlingException extends Exception {
	public BankAccountHandlingException(String mesg) {
		super(mesg);
	}
}
