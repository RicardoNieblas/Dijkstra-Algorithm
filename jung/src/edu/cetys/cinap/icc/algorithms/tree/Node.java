package edu.cetys.cinap.icc.algorithms.tree;


public class Node<T> {

	private Node<T> parent;
	
	private Node<T> left;
	
	private Node<T> right;
	
	private RBTColor color;
	
	private T payLoad;
	
	private int key;
	
	Node(T payLoad) {
		this.key = payLoad.hashCode();
		this.payLoad = payLoad;
	}
	
	public Node<T> left() {
		return left;
	}
	
	public Node<T> right() {
		return right;
	}
	
	public Node<T> parent() {
		return parent;
	}
	
	public RBTColor color() {
		return color;
	}
	
	public T get() {
		return payLoad;
	}
	
	public int key() {
		return key;
	}
	
	public void setLeft(Node<T> n) {
		this.left = n;
	}
	
	public void setRight(Node<T> n) {
		this.right = n;
	}
	
	public void setParent(Node<T> n) {
		this.parent = n;
	}
	
	public void setColor(RBTColor color) {
		this.color = color;
	}

}
