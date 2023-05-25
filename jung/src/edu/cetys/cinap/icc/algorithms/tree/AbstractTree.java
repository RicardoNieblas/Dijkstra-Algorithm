package edu.cetys.cinap.icc.algorithms.tree;


public abstract class AbstractTree<T> implements Tree<T>{

	Node<T> root;
	int size;
		
	
	public AbstractTree() {
		root = null;
		size = 0;
	}
	
	public abstract void insert(T element);
	
	
	public abstract void delete(T element);
	
	
	public Node<T> search(T element) {
		Node<T> x = this.root;
				
		while( x != null && !x.get().equals(element)){
			if(element.hashCode() < x.key())
				x = x.left();
			else
				x = x.right();
		}
		
		return x;
	}
	
	
	public int size(){
		return size;
	}
	
	
	protected Node<T> succesor(Node<T> x) {
		if( x.right() != null )
			return minimum(x.right());
		Node<T> y = x.parent();
		while(y!=null && x == y.right()) {
			x = y;
			y = y.parent();
		}
		return y;
	}
	
	private Node<T> minimum(Node<T> x) {
		while( x.left() != null )
			x = x.left();
		return x;
	}
	
	@SuppressWarnings("unused")
	private Node<T> maximum(Node<T> x) {
		while( x.right() != null )
			x = x.right();
		return x;
	}
}
