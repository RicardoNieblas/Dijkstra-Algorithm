package edu.cetys.cinap.icc.algorithms.tree;

public interface Tree<T> {

		public void insert(T element);
		
		public void delete(T element);
		
		public Node<T> search(T element);
		
		public int size();
			
}
