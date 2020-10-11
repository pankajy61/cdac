package maps;
import static utils.CollectionUtils.*;

import java.util.Map;

import com.app.core.BankAccount;

public class TestAccountMap {

	public static void main(String[] args) throws Exception{
		Map<Integer, BankAccount> acctMap = populateSampleMap(populateSampleData());
		//display Map : toString
		System.out.println(acctMap);

	}

}
