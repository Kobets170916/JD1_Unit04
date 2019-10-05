package les09_01;

import java.util.ArrayList;
import java.util.List;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */
public class Text {
	private List<Sentence> text;
	private List<Sentence> title;

	public Text() {
		text = new ArrayList<Sentence>();
		title = new ArrayList<Sentence>();
	}

	public List<Sentence> getText() {
		return text;
	}

	public List<Sentence> getTitle() {
		return title;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public void setTitle(List<Sentence> title) {
		this.title = title;
	}

	public void addTitle(Sentence title) {
		this.title.add(title);
	}

	public void addSent(Sentence sent) {
		this.text.add(sent);
	}

	@Override
	public String toString() {
		return "Text [title=" + title + ", text=" + text + "]";
	}
}