package edu.cetys.cinap.icc.algorithms.test;

import org.apache.commons.collections15.Factory;
import edu.uci.ics.jung.algorithms.generators.random.EppsteinPowerLawGenerator;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.graph.decorators.EdgeLabel;


public class SampleGraph {

	/**
	 * Builds a static DAG
	 * 
	 * @return
	 */
	public UndirectedSparseMultigraph<String, EdgeLabel<Number>> getUndirectedStaticDAG() {
		
		UndirectedSparseMultigraph<String,EdgeLabel<Number>> g = new UndirectedSparseMultigraph<String,EdgeLabel<Number>>();
		
		g.addVertex("A");		
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");	
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
			
		/* For some strange reason, JUNG does not allow to edges to have the same label.
		 * The work around for the problem is the following:
		 * 
		 */
		
		g.addEdge(new EdgeLabel<Number>(4),"A","B",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(8),"A","C",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(8),"B","D",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(11),"B","E",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(2),"C","F",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(4),"C","G",EdgeType.UNDIRECTED); 
		g.addEdge(new EdgeLabel<Number>(7),"C","D",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(9),"D","E",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(14),"D","F",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(10),"E","F",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(2),"F","G",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(6),"G","I",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(1),"G","H",EdgeType.UNDIRECTED);
		g.addEdge(new EdgeLabel<Number>(7),"I","H",EdgeType.UNDIRECTED);

		return g;
	}
	
	
	
	public DirectedSparseGraph<String, String> getDirectedStaticDAG() {
		DirectedSparseGraph<String, String> g = new DirectedSparseGraph<String, String>();
					
		g.addVertex("A");		
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");	
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		g.addVertex("H");
		g.addVertex("I");	
		g.addVertex("J");
		g.addVertex("K");
		g.addVertex("L"); 
		/*g.addVertex("M");*/
					
		g.addEdge("1","B","A",EdgeType.DIRECTED);
		g.addEdge("2","B","E",EdgeType.DIRECTED);
		g.addEdge("3","C","B",EdgeType.DIRECTED);
		g.addEdge("4","C","F",EdgeType.DIRECTED);
		g.addEdge("5","D","B",EdgeType.DIRECTED);
		g.addEdge("6","E","B",EdgeType.DIRECTED);
		g.addEdge("7","F","C",EdgeType.DIRECTED);
		g.addEdge("8","G","E",EdgeType.DIRECTED);
		g.addEdge("9","G","I",EdgeType.DIRECTED);
		g.addEdge("10","H","G",EdgeType.DIRECTED);
		g.addEdge("11","H","F",EdgeType.DIRECTED);
		g.addEdge("12","I","J",EdgeType.DIRECTED);
		g.addEdge("13","J","G",EdgeType.DIRECTED);
		g.addEdge("14","J","L",EdgeType.DIRECTED);
		g.addEdge("15","K","H",EdgeType.DIRECTED);
		g.addEdge("16","L","K",EdgeType.DIRECTED);
		
		return g;
	}
	
	
	
	public DirectedSparseGraph<String, String> getDirectedStaticDAGT1() {
		DirectedSparseGraph<String, String> g = new DirectedSparseGraph<String, String>();
					
		g.addVertex("A");		
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");	
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		g.addVertex("H");
		g.addVertex("I");	
					
		g.addEdge("1","A","B",EdgeType.DIRECTED);
		g.addEdge("2","A","C",EdgeType.DIRECTED);
		g.addEdge("3","B","D",EdgeType.DIRECTED);
		g.addEdge("4","C","E",EdgeType.DIRECTED);
		g.addEdge("5","C","H",EdgeType.DIRECTED);
		g.addEdge("6","C","I",EdgeType.DIRECTED);
		g.addEdge("7","C","F",EdgeType.DIRECTED);
		g.addEdge("8","C","G",EdgeType.DIRECTED);
		
		
		return g;
	}
	
	
	
	public DirectedSparseGraph<String, String> getDirectedStaticDAGT2() {
		DirectedSparseGraph<String, String> g = new DirectedSparseGraph<String, String>();
					
		g.addVertex("A");		
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");	
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		g.addVertex("H");
		g.addVertex("I");
		g.addVertex("J");
		g.addVertex("K");
		g.addVertex("L");
		g.addVertex("M");
		g.addVertex("N");
		g.addVertex("O");
		g.addVertex("P");
		g.addVertex("Q");
		
		
		g.addEdge("1","A","B",EdgeType.DIRECTED);
		g.addEdge("2","A","C",EdgeType.DIRECTED);
		g.addEdge("3","A","D",EdgeType.DIRECTED);
		g.addEdge("4","B","E",EdgeType.DIRECTED);
		g.addEdge("5","B","F",EdgeType.DIRECTED);
		g.addEdge("6","C","G",EdgeType.DIRECTED);
		g.addEdge("7","D","H",EdgeType.DIRECTED);
		g.addEdge("8","D","I",EdgeType.DIRECTED);
		g.addEdge("9","D","J",EdgeType.DIRECTED);
		g.addEdge("10","E","L",EdgeType.DIRECTED);
		g.addEdge("11","E","K",EdgeType.DIRECTED);
		g.addEdge("12","H","M",EdgeType.DIRECTED);
		g.addEdge("13","H","N",EdgeType.DIRECTED);
		g.addEdge("14","H","O",EdgeType.DIRECTED);
		g.addEdge("15","I","P",EdgeType.DIRECTED);
		g.addEdge("16","I","Q",EdgeType.DIRECTED);
				
		
		return g;
	}
	
	
	
	/**
	 * The factory for creating Graphs
	 * 
	 */
	static class GraphFactory implements Factory<Graph<String, Number>> {
		public Graph<String,Number> create() {
			return new SparseMultigraph<String,Number>();
		}
	}
	
	
	/**
	 * The vertex factory
	 */
	static class VertexFactory implements Factory<String> {
		char a = 'a';
		
		public String create() {
			return Character.toString(a++);
		}
	}
	
	
	/**
	 * The edge factory
	 */
	static class EdgeFactory implements Factory<Number> {
		int count;
		public Number create() {
			return count++;
		}
	}
	
	
	/**
	 * Creates a random graph
	 * 
	 * @return
	 */
	public Graph<String,Number> getRamdomDAG() {
		Graph<String,Number> g = new EppsteinPowerLawGenerator<String,Number>( new GraphFactory(),
								 new VertexFactory(), new EdgeFactory(), 5, 10, 50).create();
		return g;
	}
	
}
