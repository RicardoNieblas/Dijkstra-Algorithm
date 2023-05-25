package edu.cetys.cinap.icc.algorithms.test;

import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.collections15.Factory;
import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;
import edu.uci.ics.jung.io.PajekNetReader;

public class WS_CETYS {

	// Singleton used to label edges
	static class EdgeFactory implements Factory<Number> {
		int count;
		public Number create() {
			return count++;
		}
	}
	
	private void graphProperties(UndirectedSparseMultigraph<Number,Number> graph,
			PajekNetReader<UndirectedSparseMultigraph<Number, Number>, Number, Number> gmlr) {
		
		// Display the graph properties
		System.out.println("Vertex count : " + graph.getVertexCount());
		System.out.println("Edge count : " + graph.getEdgeCount());
		
		// Two ways of printing the DAG vertex set 
		System.out.println("Strategy 1 to display the vertex set");
		for(Number v : graph.getVertices())
			System.out.println(v);
		
		System.out.println("Strategy 2 to display the vertex set");
		for(Iterator<Number> it = graph.getVertices().iterator(); it.hasNext();) {
			Number id = it.next();
			String label = gmlr.getVertexLabeller().transform(id);
			System.out.println(label);
		}
		
		// Two ways of printing the DAG edge set
		System.out.println("Strategy 1 to display the edge set");
		for(Number e : graph.getEdges())
			System.out.println(e);
		
			
		System.out.println("Strategy 2 to display the edge set");
		for(Number v : graph.getVertices() )
			for(Number e : graph.getIncidentEdges(v))
				//System.out.println("(" + v +"," + e +")");
				System.out.println("(" + gmlr.getVertexLabeller().transform(v) +"," + gmlr.getVertexLabeller().transform(e)+")");
	}
	
	private void loadUndirected(String fileName) {
		
		/* Plantilla de grafo generico no denso. El primer argumento de la plantilla representa el tipo de datos 
		   de los vertices. El segundo argumento el tipo de datos de las aristas. La platilla es polimorfica. */
		UndirectedSparseMultigraph<Number,Number> graph = null;
		// Plantilla de lector de grafos
		PajekNetReader<UndirectedSparseMultigraph<Number, Number>, Number, Number> gmlr = null;
		
		System.out.println("Loading the graph");
		try {
			// Se crea una instancia de un lector de grafos no-dirigidos.
			gmlr = new PajekNetReader<UndirectedSparseMultigraph<Number,Number>, Number, Number>(new EdgeFactory());
			// Se crea la instancia del grafo no dirigido
			graph = new UndirectedSparseMultigraph<Number,Number>();	
			// Se carga el grafo de persistencia
			gmlr.load(fileName, graph);

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Finished loading the graph");
	
		this.graphProperties(graph, gmlr);
	}
	
	
	public static void main(String args[]){
		// Creación de una instancia del parser
		WS_CETYS ws = new WS_CETYS();
		
		// Cargado de un grafo estático
		ws.loadUndirected("C:\\Users\\ahiralesc\\Mysrc\\java_codes\\jung\\src\\datasets\\grafo_4.net");
	}
}
