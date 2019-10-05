package les09_04;

import java.util.ArrayList;
import java.util.List;

/*
 * Счета. Клиент может иметь несколько счетов в банке. 
 Учитывать возможность блокировки/разблокировки счета.
 Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
 Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Client {
	private String name;

	private List<Account> accountList;

	public Client() {
		name = new String();
		accountList = new ArrayList<Account>();
	}

	public Client(String name, String forname, List<Account> accountList) {
		this.name = name;
		this.accountList = accountList;
	}

	public Client(String string, List<Account> accounts) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountList == null) ? 0 : accountList.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (accountList == null) {
			if (other.accountList != null)
				return false;
		} else if (!accountList.equals(other.accountList))
			return false;

		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
