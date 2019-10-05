package les09_04;

/*
 * Счета. Клиент может иметь несколько счетов в банке. 
 Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class ClientLogic {

	public static int sumAccounts(Client client) {
		int sum = 0;

		for (Account ac : client.getAccountList()) {
			sum = sum + ac.getBalance();
		}
		return sum;
	}

	public static int sumPositiveAccounts(Client client) {
		int sum = 0;

		for (Account ac : client.getAccountList()) {
			if (ac.getBalance() > 0) {
				sum = sum + ac.getBalance();
			}
		}
		return sum;
	}

	public static int sumNegativeAccounts(Client client) {
		int sum = 0;

		for (Account ac : client.getAccountList()) {
			if (ac.getBalance() < 0) {
				sum = sum + ac.getBalance();
			}
		}
		return sum;
	}
}
