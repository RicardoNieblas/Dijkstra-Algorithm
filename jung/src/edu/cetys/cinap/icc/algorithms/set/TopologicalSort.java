package edu.cetys.cinap.icc.algorithms.set;

import edu.uci.ics.jung.algorithms.shortestpath.DFSDistanceLabeler;
import edu.uci.ics.jung.graph.Hypergraph;

public class TopologicalSort<V,E> extends DFSDistanceLabeler<V,E> {

	public void sort(Hypergraph<V,E> g) {
		super.labelDistances(g);
	}
	
}
