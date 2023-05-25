package edu.cetys.cinap.icc.algorithms.heap;

import java.util.ArrayList;


/**
 * MinHeap  
 */

public class MinHeap extends AbstractHeap {

	public MinHeap(ArrayList<Number> T) {
		super(T);
	}

	
	protected void heapify(int i) {
		int smallest = -1;
		int size = heap.size()-1;
		
		int l = left(i);
		int r = right(i);
		
		if(l <= size && heap.get(l).doubleValue() < heap.get(i).doubleValue() )
			smallest = l; 
		else
			smallest = i;

		if(r <= size && heap.get(r).doubleValue() < heap.get(smallest).doubleValue() )
			smallest = r; 
		
		if( smallest != i) {
			swap(i,smallest);
			heapify(smallest);
		}
	}
	
	
}
