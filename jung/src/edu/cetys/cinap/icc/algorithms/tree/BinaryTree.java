package edu.cetys.cinap.icc.algorithms.tree;

public class BinaryTree<T> extends AbstractTree<T>{

//	@Override
	public void insert(T element) {
		Node<T> z = new Node<T>(element);
		
		Node<T> y = null;
		Node<T> x = root;
		
		while( x != null) {
			y = x;
			
			if( z.key() < x.key() )
				x = x.left();
			else
				x = x.right();
		} // End while
		z.setParent(y);
		
		if( y == null)
			root = z;
		else
			if( z.key() < y.key() )
				y.setLeft(z);
			else
				y.setRight(z);
		size++;
	}

	@Override
	public void delete(T element) {
		// TODO Auto-generated method stub
		
	}

	/*
	
	@Override
	public void delete(T z) {
		Node<T> z = search(element);
		Node<T> y = null;
		
		y = (z.left() == null || z.right() == null)? z : succesor(z);
		Node<T> x = (y.left() != null)? y.left() : y.right();
		
		if(x != null)
			x.setParent(y.parent());
		if(y.parent() == null)
			super.root = x;
		else if(y == y.parent().left())
				y.parent().setLeft(x);
			else
				y.parent().setRight(x);
			
		
		
	}*/

}
