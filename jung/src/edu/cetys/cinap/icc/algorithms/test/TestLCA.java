package edu.cetys.cinap.icc.algorithms.test;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import edu.cetys.cinap.icc.algorithms.labelling.Level;
import edu.cetys.cinap.icc.algorithms.lca.AvrgDistance;
import edu.uci.ics.jung.graph.DirectedSparseGraph;


public class TestLCA {

	public static void main(String args[]){
		SampleGraph grapgGen = new SampleGraph();
		DirectedSparseGraph<String, String> g = grapgGen.getDirectedStaticDAGT2();
		
		Level<String,String> labeler = new Level<String,String>();
		labeler.label(g);
		//TreePartition<String,String> heuristic = new TreePartition<String,String>();
				
		
		
		AvrgDistance<String,String> heuristic = new AvrgDistance<String,String>(g,"A");
		
		Set<String> A = new HashSet<String>();
		A.add("L");
		A.add("K");
		A.add("G");
		A.add("M");
		A.add("N");
		A.add("O");
		A.add("P");
		A.add("Q");
		A.add("J");
		A.add("F");
		

	/*	heuristic.compute(g, A);
		System.out.println("F average distance : " + heuristic.getAvrgDistance("F"));
		System.out.println("L average distance : " + heuristic.getAvrgDistance("L"));
		System.out.println("K average distance : " + heuristic.getAvrgDistance("K"));
		System.out.println("G average distance : " + heuristic.getAvrgDistance("G"));
		System.out.println("O average distance : " + heuristic.getAvrgDistance("O"));
		System.out.println("M average distance : " + heuristic.getAvrgDistance("M"));
		System.out.println("N average distance : " + heuristic.getAvrgDistance("N"));
		System.out.println("P average distance : " + heuristic.getAvrgDistance("P"));
		System.out.println("Q average distance : " + heuristic.getAvrgDistance("Q"));
		System.out.println("J average distance : " + heuristic.getAvrgDistance("J")); */
		
		heuristic.computeNormalized(g, A);
		System.out.println("F average distance : " + heuristic.getAvrgDistance("F"));
		System.out.println("L average distance : " + heuristic.getAvrgDistance("L"));
		System.out.println("K average distance : " + heuristic.getAvrgDistance("K"));
		System.out.println("G average distance : " + heuristic.getAvrgDistance("G"));
		System.out.println("O average distance : " + heuristic.getAvrgDistance("O"));
		System.out.println("M average distance : " + heuristic.getAvrgDistance("M"));
		System.out.println("N average distance : " + heuristic.getAvrgDistance("N"));
		System.out.println("P average distance : " + heuristic.getAvrgDistance("P"));
		System.out.println("Q average distance : " + heuristic.getAvrgDistance("Q"));
		System.out.println("J average distance : " + heuristic.getAvrgDistance("J"));
		
		/*System.out.println("The LCA between A and M is : " + heuristic.lca(g, "A", "M"));
		System.out.println("The LCA between E and G is : " + heuristic.lca(g, "E", "K"));
		System.out.println("The LCA between J and K is : " + heuristic.lca(g, "J", "K"));
		System.out.println("The LCA between H and M is : " + heuristic.lca(g, "H", "M"));
		*/
		
		/*Integer one = new Integer(1);
		int id1 = one.hashCode();
		int id2 = one.hashCode();
		if(id1 == id2)
			System.out.println("Yep");
		else
			System.out.println("Nope");
		*/
	}
}
