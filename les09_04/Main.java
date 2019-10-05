package les09_04;

import java.util.ArrayList;
import java.util.List;

/*
 * Счета. Клиент может иметь несколько счетов в банке. 
 Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {
	public static void main(String[] args) {

		List<Account> accounts = new ArrayList<Account>();

		accounts.add(new Account(255, 25));
		accounts.add(new Account(30, -5));

		Client client = new Client("1", accounts);
		
	}

	public static void printAccounts(Client client) {
		for (Account ac : client.getAccountList()) {
			System.out.println(ac.toString());
		}
	}
}
