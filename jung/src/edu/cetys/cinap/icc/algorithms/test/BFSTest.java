package edu.cetys.cinap.icc.algorithms.test;

import edu.uci.ics.jung.graph.Hypergraph;
import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;
import edu.uci.ics.jung.graph.decorators.EdgeLabel;

import java.util.HashSet;

import edu.uci.ics.jung.algorithms.shortestpath.BFSDistanceLabeler;

public class BFSTest {
	
	public void ejecuta() {
		SampleGraph g = new SampleGraph();
		
		
		Hypergraph<String, EdgeLabel<Number>> graph = g.getUndirectedStaticDAG();
		 
		 System.out.print("Los vertices del grafo son: ");
		 for(String v : graph.getVertices())
			 System.out.print(v + " ");
		 
		 
		
		 HashSet<String> s = new HashSet<String>();
		 s.add("A");
		 BFSDistanceLabeler<String,EdgeLabel<Number>> labeler = new BFSDistanceLabeler<String,EdgeLabel<Number>>();
		 labeler.labelDistances(graph, s);
		 
		 System.out.println("\n");
		 System.out.println("Los vertices del arbol construido por BSF son: ");
		 for(String v : labeler.getVerticesInOrderVisited()) {
			 int dist = labeler.getDistance(graph, v);
			 System.out.println("Distabcia a " + v + " es " + dist);
		 }

		 
	}
	
	public static void main(String args[]) {
		BFSTest bfs = new BFSTest();
		bfs.ejecuta();
	}

}
