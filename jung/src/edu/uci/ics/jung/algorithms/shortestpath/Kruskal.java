/*
 * JUNG -- Java Universal Network/Graph Framework 
 *
 * Copyright (c) 2003-2013 by 
 * CICESE Research Center, Computer Science Department and 
 * CETYS University, Center for Applied Engineering, Mexico
 *  
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License. 
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the
 *
 *   Free Software Foundation, Inc.,
 *   51 Franklin St, Fifth Floor,
 *   Boston, MA 02110, USA
 */
package edu.uci.ics.jung.algorithms.shortestpath;

import java.util.Collections;
import java.util.LinkedList;

import edu.cetys.cinap.icc.algorithms.set.DisjointSets;
import edu.cetys.cinap.icc.algorithms.set.EdgeComparator;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.UndirectedSparseMultigraph;
import edu.uci.ics.jung.graph.decorators.EdgeLabel;
import edu.uci.ics.jung.graph.util.Pair;


/**
 * Kruskal algorithm is a greedy algorithm in graph theory that finds a Minimum Spanning Tree (MST) for 
 * a connected weighted graph. That is it finds a subset of edges that forms a tree that includes
 * all vertices, where the total weight of all edges in the tree is minimized.
 * 
 * The asymptotic order of Kruskal is O( E Log(V) ). Edges are sorted using QuickSort. The algorithm
 * also uses disjoint-sets to build the MST. The commutative cost of the disjoint operations used by Kruskal
 * is O(E t(V) ), with t(V) is a very slowly growing function. 
 *   
 * References:
 * <ul>
 * 	<li> Joseph. B. Kruskal: On the Shortest Spanning Subtree of a Graph and the Traveling Salesman Problem. 
 *      In: Proceedings of the American Mathematical Society, Vol 7, No. 1 (Feb, 1956), pp. 48–50. </li>
 * 	<li> Thomas H. Cormen, Clifford Stein, Ronald L. Rivest, and Charles E. Leiserson. 2001. 
 *      Introduction to Algorithms (2nd ed.). McGraw-Hill Higher Education. pp. 567-573. </li>
 * </ul>
 *      
 * @author </a>href="mailto:ahiralesc@gmail.com">Adan Hirales Carbajal</a>
 *         (last edited by $Author$)
 * @param <V> the vertex type 
 * @param <E> the edge type. Edge type must implement EdgeLabel
 * @see EdgeLabel 
 * @version %I% %G%
 */
public class Kruskal <V,E> {
	
	/**
	 * The minimum spanning tree
	 */
	private LinkedList<E> A;
	
	
	/**
	 *  The disjoint set labeler
	 */
	private DisjointSets<V> set;
	
	
	/**
	 * The MST cost 
	 */
	private double cost;
	
	
	/**
	 * Class constructor
	 */
	public Kruskal() {
		A = new LinkedList<E>();
		set = new DisjointSets<V>();
		cost = 0;
	}
	
	
	/**
	 * Builds a minimum spanning three of a weighted undirected DAG
	 * 
	 * @param g
	 */
	public void label(UndirectedSparseMultigraph<V,E> g) {
	
		for(V v : g.getVertices())
			set.makeSet(v);
		
		// Sort the edges increasing order
		LinkedList<E> ordEdges = new LinkedList<E>(g.getEdges());
		Collections.sort(ordEdges, new EdgeComparator<E>());
		
		for(E e : ordEdges){
			Pair<V> p = ((Graph<V,E>)g).getEndpoints(e); {
				 V v = p.getFirst();
				 V u = p.getSecond();
				 if( set.findSet(v) != set.findSet(u)) {
					 A.add(e);
					 set.union(v, u);
					 cost += ((Number)((EdgeLabel<?>)e).getLabel()).doubleValue();
					 
				 }
			 }
		}	
	}

	
	/**
	 * Gets a minimum spanning tree
	 * 
	 * @return the minimum spanning tree
	 */
	public LinkedList<E> getSpanningTree(){
		return this.A;
	}
	
	
	/**
	 * Returns the MST cost
	 * 
	 * @return a double value with the cost of the MST
	 */
	public double getMSTCost() {
		return cost;
	}
}
