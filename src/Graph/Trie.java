package Graph;

import java.util.ArrayList;

class Node {
	char a;
	ArrayList<Node> next;

	public Node(char a) {
		this.a = a;
		next = new ArrayList<Node>();
	}

	public boolean contains(char ch){

		for(Node n: next){
			if(n.a == ch){
				return true;
			}
		}
		return false;
	}

	public Node get(char ch) {
		for(Node n: next) {
			if(n.a==ch) {
				return n;
			}
		}
		return null;	
	}
}

public class Trie {
	Node root = new Node((char)0);
	Node temp;
	public Trie(ArrayList<String> list) {
		for(String s: list) {
			temp = root;		 
			for(int i=0;i<s.length();i++) {
				if(temp.contains(s.charAt(i))==false) // Lower case stuff
				{
					temp.next.add(new Node(s.charAt(i)));
				}
				temp = temp.get(s.charAt(i));
			}
			temp.next.add(new Node('$'));
		}		
	}

	public void printList() {
		printList(root, "");
	}

	public void printList(Node node, String soFar) {

		int i=0;
		if((node.contains('$')==true)){
			System.out.println(soFar);
		}
		for(Node n: node.next) {
			String s = soFar + n.a;
			printList(n, s);
		}

	}


}


