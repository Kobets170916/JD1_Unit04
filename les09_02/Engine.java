package les09_02;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.
 */
public class Engine { // класс Двигатель, Методы заправляться
	private View view; // вид двигателя
	private double volume; // объем двигателя

	public Engine(View view, double volume) {
		super();
		this.view = view;
		this.volume = volume;

	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Engine [view=" + view + ", volume =" + volume + "]";
	}

	public void Diesel() {

		this.view = View.max;
	}
}

enum View {
	min, max;
}
