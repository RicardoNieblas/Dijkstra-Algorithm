package edu.cetys.cinap.icc.algorithms.set;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.Hypergraph;
import edu.uci.ics.jung.graph.util.Pair;

public class ConnectedComponents<V,E> extends DisjointSets<V>{
	
	private boolean initialized;
	
	public ConnectedComponents() {
		super();
		this.initialized = false;
	}

	
	public void connectComponents(Hypergraph<V,E> g) {
		for(V v : g.getVertices())
			makeSet(v);
		
		for(E e : g.getEdges()) {
			Pair<V> p = ((Graph<V,E>)g).getEndpoints(e);
			V u = p.getFirst();
			V v = p.getSecond();
			if( super.findSet(u) != super.findSet(v))
				super.union(u, v);
		}
		
		this.initialized = true;
	}
	
	
	public boolean inSameComponent(V v, V u) throws Exception {
		if(initialized) {
			if(findSet(u) == findSet(v)) 
				return true;
			return false;
		} throw new Exception("Initialization Exception: Prepare the sets first by calling connectedComponents");		
	}
}
