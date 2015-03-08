package Graph;

import java.util.ArrayList;

public class TrieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> s = new ArrayList<String>();
		
		s.add("mat");
		s.add("appy");
		
		s.add("appe");
		s.add("apple");
		s.add("app");

		

		Trie trie = new Trie(s);
		
		trie.printList();

	}

}
