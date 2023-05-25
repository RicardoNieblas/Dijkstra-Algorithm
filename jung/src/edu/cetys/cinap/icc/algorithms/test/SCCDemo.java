package edu.cetys.cinap.icc.algorithms.test;

import edu.cetys.cinap.icc.algorithms.set.StronglyConnectedComponents;
import edu.uci.ics.jung.graph.DirectedSparseGraph;

public class SCCDemo {

	/**
	 * SCC Test class main 
	 * 
	 * @param args
	 */
	public static void main(String args[] )  {
		SCCDemo sccObj = new SCCDemo();
		sccObj.computeSCC();
	}
	
	/**
	 * Computes the Strongly Connected Components of a Directed Acyclic Graph
	 */
	public void computeSCC(){
		
		// Gets an instance of the Strongly Connected Component Labeler
		StronglyConnectedComponents<String,String> SCClabeler = new StronglyConnectedComponents<String,String>();
		
		// Gets a static DAG
		DirectedSparseGraph<String, String> g = (new SampleGraph()).getDirectedStaticDAG();
		
		// Labels the DAG (computes the SCC)
		SCClabeler.label(g);
		
		// Displays the SCC. 
		System.out.println(SCClabeler.getComponents());
	}
		
}


