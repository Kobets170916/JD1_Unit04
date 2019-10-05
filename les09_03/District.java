package les09_03;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class District {

	private String name; // Область
	private City districtCenter; // областные центры
	private double area; // площадь

	public District(String name, City districtCenter, double area) {
		this.name = name;
		this.districtCenter = districtCenter;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
