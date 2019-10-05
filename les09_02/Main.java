package les09_02;

import les09_02.Wheel.Diameter;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Main {
	// private static final Diameter = null;

	public static void main(String[] args) {
		Car car = new Car();

		print(car);

	}

	public static void print(Car car) {
		System.out.println("Model " + car.getModel());
	}
}
