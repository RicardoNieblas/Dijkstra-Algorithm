package edu.cetys.cinap.icc.algorithms.test;

import java.util.Iterator;
import java.util.LinkedList;

import edu.uci.ics.jung.algorithms.shortestpath.Kruskal;
import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;
import edu.uci.ics.jung.graph.decorators.EdgeLabel;
import edu.uci.ics.jung.graph.util.Pair;

public class KruskalDemo {
	
	
	public static void main( String args[]) {
		KruskalDemo testObj = new KruskalDemo();
		testObj.computeKruskal();
	}
	
	
	public void computeKruskal() {
		//getUndirectedStaticDAG
		// Gets a static DAG
		UndirectedSparseMultigraph<String, EdgeLabel<Number>> g = (new SampleGraph()).getUndirectedStaticDAG();
	
		// Gets the Kruskal labeler
		Kruskal<String,EdgeLabel<Number>> labeller = new Kruskal<String,EdgeLabel<Number>>();
		
		// Labels the DAG
		labeller.label(g);
		
		LinkedList<EdgeLabel<Number>> l = labeller.getSpanningTree();
		
		for(Iterator<EdgeLabel<Number>> it = l.iterator(); it.hasNext();){
			
			EdgeLabel<Number> e = it.next();
			Pair<String> p = g.getEndpoints(e); 
			String v = p.getFirst();
			String u = p.getSecond();
			System.out.println("[" + v + "," + u + "]" + " edge value " +  e.getLabel());
		}
		
		System.out.println("Cost " + labeller.getMSTCost());		
	}
}
