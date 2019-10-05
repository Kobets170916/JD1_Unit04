package les09_02;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Car { // класс Автомобиль
	private String model; // маркa
	private Engine engine; // двигатель
	private Wheel wheel; // колесо

	public Car(String model, Engine engine, Wheel wheel) {
		super();
		this.model = model;
		this.engine = engine;
		this.wheel = wheel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", engine=" + engine + ", wheel=" + wheel + "]";
	}

}
