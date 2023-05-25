package edu.cetys.cinap.icc.algorithms.heap;

import java.util.ArrayList;

import edu.cetys.cinap.icc.algorithms.exceptions.HeapUnderflowException;


public abstract class AbstractHeap implements Heap{

	/**
	 * The array that represents the heap elements. 
	 */
	protected ArrayList<Number>  heap;
	
	
	/**
	 * Class constructor
	 */
	public AbstractHeap(ArrayList<Number> T){
		heap = new ArrayList<Number>(T);
	}
	

	/*
	 * (non-Javadoc)
	 * @see edu.cetys.cinap.icc.algorithms.heap.Heap#build()
	 */
	public void build() {
		int size = heap.size()-1;
		for(int i = (int) Math.floor(size/2); i>=0; i--){
			heapify(i);
		}
	}
		
	
	/**
	* The left child 
	* 
	* @param the index of the parent node
	* @return the index of the left child node
	*/
	protected int left(int i){
		return (i * 2) + 1;
	}
	

	/**
	* The right child 
	* 
	* @param the index of the parent node
	* @return the index of the right child node
	*/
	protected int right(int i) {
		return (i * 2) + 2;
	} 
	
	
	/**
	* The left child 
	* 
	* @param the index of the parent node
	* @return the index of the left child
	*/
	protected int parent(int i){
		return (int) Math.floor(i/2);
	}

	
	/*
	 * (non-Javadoc)
	 * @see edu.cetys.cinap.icc.algorithms.heap.Heap#length()
	 */
	public int size(){
		return heap.size();
	}

	
	/*
	 * (non-Javadoc)
	 * @see edu.cetys.cinap.icc.algorithms.heap.Heap#get()
	 */
	public Number get(){
		return heap.get(0);
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see edu.cetys.cinap.icc.algorithms.heap.Heap#remove()
	 */
	public Number extract() throws HeapUnderflowException {
		
		int s = heap.size()-1;
		if(s < 0)
			throw new HeapUnderflowException("Attempting to extract an element while the heap is empty");
		Number value = heap.get(0);
		swap(0,s);
		heap.remove(s);
		heapify(0);
		
		return value;
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see edu.cetys.cinap.icc.algorithms.heap.Heap#remove()
	 */
	protected abstract void heapify(int i); 
	
	
	
	/*
	 * (non-Javadoc)
	 * @see edu.cetys.cinap.icc.algorithms.heap.Heap#build()
	 */
	protected void swap(int i, int j) {
		Number tmp = heap.get(i);
		heap.set(i, heap.get(j));
		heap.set(j, tmp);
	}
	
}
