package les09_01;

import java.util.ArrayList;
import java.util.List;

/* Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */

public class Sentence {
private List<Word> sentence;
	
	public Sentence() {
		sentence = new ArrayList<Word>();
	}

	public List<Word> getSentence() {
		return sentence;
	}

	public void setSentense(List<Word> sentence) {
		this.sentence = sentence;
	}
	
	public void addWord(Word new_word) {
		sentence.add(new_word);
	}

	@Override
	public String toString() {
		return "Sentense [sentense=" + sentence + "]";
	}
}