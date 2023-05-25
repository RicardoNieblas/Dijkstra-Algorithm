package edu.cetys.cinap.icc.algorithms.heap;

/**
 * MaxHeap  
 */

import java.util.ArrayList;


public class MaxHeap extends AbstractHeap {

	
	public MaxHeap(ArrayList<Number> T){
		super(T);
	}
	

	protected void heapify(int i) {
		int largest = -1;
		int size = heap.size()-1;
		
		int l = left(i);
		int r = right(i);
		
		if(l <= size && heap.get(l).doubleValue() > heap.get(i).doubleValue() )
			largest = l; 
		else
			largest = i;

		if(r <= size && heap.get(r).doubleValue() > heap.get(largest).doubleValue() )
			largest = r; 
		
		if( largest != i) {
			swap(i,largest);
			heapify(largest);
		}
	}
	
}
