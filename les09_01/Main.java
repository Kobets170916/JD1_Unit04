package les09_01;

import java.util.List;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
консоль текст, заголовок текста.
 */

public class Main {
	public static void main(String[] args) {
		Sentence sentence = new Sentence();
		sentence.addWord(new Word("Создали объект класса Текст,"));
		sentence.addWord(new Word("используя"));
		sentence.addWord(new Word("классы"));
		sentence.addWord(new Word("Предложение,"));
		sentence.addWord(new Word("Слово."));
		
		Sentence title = new Sentence();
		title.addWord(new Word("Заголовок текста"));

		Text myText = new Text();
		myText.addTitle(title);
		myText.addSent(sentence);

		print(myText.getTitle());
		System.out.println();
		print(myText.getText());
	}

	public static void print(List<Sentence> text) {
		for (Sentence sen : text) {
			List<Word> new1 = sen.getSentence();
			for (Word w : new1) {
				System.out.print(w.getWord());
			}
		}
	}
}