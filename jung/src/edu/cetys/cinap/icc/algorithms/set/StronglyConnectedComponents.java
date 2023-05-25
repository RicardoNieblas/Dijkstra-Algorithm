package edu.cetys.cinap.icc.algorithms.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import edu.uci.ics.jung.algorithms.shortestpath.DFSDistanceLabeler;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.Hypergraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.util.Pair;


public class StronglyConnectedComponents<V,E> extends DFSDistanceLabeler<V,E>{
	
	/**
	 * Disjoint sets. Once the second call to DFS is conducted,
	 * Disjoint sets is called to categorize vertices into SCC
	 * sets 
	 */
	 private DisjointSets<V> ds;
	
	 
	 /**
	  * Class constructor
	  */
	 public StronglyConnectedComponents() {
		 ds = new DisjointSets<V>();
	 }
	
	 
	/**
	 * Labels the strongly connected components of the DAG
	 * 
	 * @param g, a directed acyclic graph
	 */
	public void label(Hypergraph<V,E> g) {
		
		labelDistances(g);									// Label the DAG
		List<V> ol = new LinkedList<V>(getVerticesOrdByFinishTime());
		System.out.println(ol);
		Hypergraph<V,E> tg = this.getTranspose(g);			// Transpose the DAG
		
		super.labelDistances(tg, ol);						// Label the transpose DAG
		makeSets(super.getPredecessors(), new LinkedList<V>(super.getVerticesOrdByFinishTime()));
	}
	
	
	/**
	 * Gets the SCCC. First column in the matrix contains the DAG vertices.
	 * Second column, the label of the component to which the vertices belong.
	 * For example:
	 * 	A | A
	 *  B | A
	 *  C | C
	 *  D | C
	 *  
	 *  Indicates that there are two components A and C. Elements in component A
	 *  are {A,B}. Elements in component C are {C,D}
	 * 
	 * @return a Map<V,V> with the SCC components
	 */
	public Map<V,V> getComponents() {
		return ds.getSets();
	}
	
	
	/**
	  * Gets the DAG transpose
	  * 
	  * @param g, a directed acyclic graph
	  * 
	  * @return the transpose graph
	 */
	 private Hypergraph<V,E> getTranspose(Hypergraph<V,E> g){
		
		 Graph<V,E> tg = new DirectedSparseMultigraph<V,E>(); 
		 for(V v : g.getVertices())
			 tg.addVertex(v);
		
		 for(E e : g.getEdges()){
			 Pair<V> p = ((Graph<V,E>)g).getEndpoints(e);
			 tg.addEdge(e, p.getSecond(), p.getFirst(), EdgeType.DIRECTED);
		}
		
		return tg;
	 }
	 
	 
	 /**
	  * Uses the DisjointSets data structure to build the SCC in O(V) time
	  * 
	  * @param the predecessor matrix produced by DFSDistancelabeler
	  */
	 private void makeSets(Map<V,V> pi, List<V> ol) {
		 for(V v : pi.keySet())
			 ds.makeSet(v);
			
		 for(V v : ol) {
			 V u = pi.get(v);
			 if(u != null)
				 if (ds.findSet(u) != ds.findSet(v))
					 ds.union(u, v);
		 }
	}
}
