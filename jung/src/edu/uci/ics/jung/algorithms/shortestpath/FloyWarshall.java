package edu.uci.ics.jung.algorithms.shortestpath;

import java.util.Map;

import cern.colt.matrix.impl.SparseDoubleMatrix2D;
import edu.uci.ics.jung.algorithms.matrix.GraphMatrixOperations;
import edu.uci.ics.jung.graph.DirectedSparseMultigraph;
import edu.uci.ics.jung.graph.Graph;
import edu.cetys.cinap.icc.algorithms.exceptions.GraphTypeException;;

public class FloyWarshall<V,E>{
	
	private  SparseDoubleMatrix2D D;
	
	public FloyWarshall(Graph<V,E> graph, Map<E,Number> nev) throws GraphTypeException{
		if(!( graph instanceof DirectedSparseMultigraph))
			throw new GraphTypeException("Type error: only directed graphs acepted");
	
		try{
			D = GraphMatrixOperations.graphToMatrix(graph, nev);
		}catch( Exception e) {
			e.printStackTrace();
		}
	} 
	
	public SparseDoubleMatrix2D getDistances(){
		return this.D;
	}
}
