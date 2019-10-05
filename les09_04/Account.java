package les09_04;

/*
 * Счета. Клиент может иметь несколько счетов в банке. 
 Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account {
	private int number;
	private int balance;
	private boolean block;

	public Account() {
		number = 0;
		balance = 0;
		block = false;
	}

	public Account(int number, int balance) {
		this.number = number;
		this.balance = balance;
		block = false;
	}
}
