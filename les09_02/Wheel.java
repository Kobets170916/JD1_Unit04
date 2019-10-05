package les09_02;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Wheel { // класс Колесо
	private Diameter diameter; // диаметр колеса

	public Wheel(Diameter diameter) {
		this.diameter = diameter;
	}

	public Diameter getDiameter() {
		return diameter;
	}

	public void setDiameter(Diameter diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + "]";
	}

	public void changeWheel() {
		this.diameter = Diameter.A;
	}

	enum Diameter {
		A, B;
	}

}
