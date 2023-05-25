package edu.cetys.cinap.icc.algorithms.heap;

import edu.cetys.cinap.icc.algorithms.exceptions.HeapUnderflowException;

/**
 * The heap data structure is an array of objects that is arrange in a binary tree data structure. 
 * Each node corresponds to an element of the heap. The tree is completely filled on all levels except 
 * possibly at the lowest level.
 * 
 * Elements are inserted from left to right. Two types of heaps are distinguished MaxHeap and MinHeap. 
 * 
 * Heap operators runtime is O(log n)
 * 
 * @see "Cormen, T. H.; Stein, C.; Rivest, R. L. & Leiserson, C. E. Introduction to Algorithms McGraw-Hill Higher Education, 2001. Chp 6. pp. 127-137"
 * 
 * @author <a href="mailto:ahiralesc@gmail.com">Adan Hirales Carbajal</a>
 *         (last edited by $Author$)
 * @version $Version$, $Date$
 * 
 */
public interface Heap {
	
	
	/**
	 * Builds the heap
	 * 
	 */
	public void build();

	
	/**
	 * Removes the root of the heap
	 * 
	 * @return the element in the root of the tree
	 * 
	 * @throws HeapUnderflowException
	 */
	public Number extract() throws HeapUnderflowException;
	
	
	/**
	 * Returns the element at the root of the heap
	 * 
	 * @return the element at the root
	 */
	public Number get();
	
	
	/**
	 * Returns the size of the heap
	 * 
	 * @return the size of the heap
	 */
	public int size();
}
