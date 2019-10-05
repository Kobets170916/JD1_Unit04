package les09_03;

import java.util.List;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */
public class Region {

	private String name;
	private City regionCenter;
	private List<District> districtList;

	public Region(String name, City regionCenter, List<District> districtList) {
		this.name = name;
		this.regionCenter = regionCenter;
		List<District> checkedList = new List<District>();
		for (District d : districtList) {
			boolean unic = true;
			for (District checkedD : checkedList) {
				if (d.equals(checkedD)) {
					unic = false;
					break;
				}
			}
		}
	}
}
