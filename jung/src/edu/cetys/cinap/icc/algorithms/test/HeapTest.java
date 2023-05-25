package edu.cetys.cinap.icc.algorithms.test;

import java.util.ArrayList;

import edu.cetys.cinap.icc.algorithms.heap.Heap;
// import edu.cetys.cinap.icc.algorithms.heap.MaxHeap;
import edu.cetys.cinap.icc.algorithms.heap.MinHeap;

public class HeapTest {

	
	
	
	public static void main(String args[]) {
				
		ArrayList<Number> data = new ArrayList<Number>();
		data.add(16);
		data.add(14);
		data.add(10);
		data.add(8);
		data.add(7);
		data.add(9);
		data.add(3);
		data.add(2);
		data.add(4);
		data.add(1);
		
		/*data.add(1);
		data.add(4);
		data.add(2);
		data.add(3);
		data.add(9);
		data.add(7);
		data.add(8);
		data.add(10);
		data.add(14);
		data.add(16);*/
		
		System.out.println("0 : " + data.get(0));
		System.out.println("1 : " + data.get(1));
		System.out.println("2 : " + data.get(2));
		System.out.println("3 : " + data.get(3));
		System.out.println("4 : " + data.get(4));
		System.out.println("5 : " + data.get(5));
		System.out.println("6 : " + data.get(6));
		System.out.println("7 : " + data.get(7));
		System.out.println("8 : " + data.get(8));
		System.out.println("9 : " + data.get(9));

		
		//Heap heap = new MaxHeap(data);
		Heap heap = new MinHeap(data);
		heap.build();
		try{
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		System.out.println(heap.extract());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
}
