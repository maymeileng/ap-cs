package week16;

import javax.xml.soap.Node;

public class BST<T extends Comparable<T>> {
	private Integer datum;
	private BST<Integer> left;   
	private BST<Integer> right; 
	private Node root;
	private boolean leaf;
	
	public BST(Integer datum) {
		this.datum = datum;
	}
	
	public Integer getDatum() {
		return datum;
	}
	
	public BST<Integer> getLeft() {
		return left;
	}
	
	public BST<Integer> getRight() {
		return right;
	}
	
	//prints data
	public void printTree() {
		System.out.print(datum.toString());
	}
	
	//turns integer into string
	public String toString() {
		return this.toString();
	}
	
	//returns depth of the tree
	public int depth() {		
		int retval = 1;
		if(leaf == true) return retval;
		//use recursion to reach the bottom of the tree
		retval = max(left.depth(), right.depth());
		return retval+1;
	}
	
	//helper method that returns the maximum int
	public static int max(int num1, int num2) {
		if(num1 < num2) {
			return num2;
		} else {
			return num1;
		}
	}
	
	//uses recursion to insert data into the tree
	public void insert(Integer datum) {
		root = insert(root, datum);
	}
	
	private Node insert(Node current, Integer datum) {
		if(current == null) {
			return current;
		} else {
			return current;
		}
	}

}
