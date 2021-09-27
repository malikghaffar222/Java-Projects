import java.util.ArrayList;

public class Publisher {
	protected String name, code;
	protected ArrayList<ScientificBook> scientificBookList;
	protected ArrayList<LiteratureBook> literatureBookList;

	public Publisher() {
	}

	public void addScientificBook(ScientificBook b) {
		scientificBookList.add(b);
	}

	public void addLiteratureBook(LiteratureBook b) {
		literatureBookList.add(b);
	}

}
