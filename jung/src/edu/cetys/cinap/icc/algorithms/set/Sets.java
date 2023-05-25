package edu.cetys.cinap.icc.algorithms.set;

import java.util.HashMap;
import java.util.Map;

public abstract class Sets<V> {
	/**
	 * The set of parents
	 */
	Map<V,V> set;
	
	
	/**
	 * The rank 
	 */
	Map<V,Number> rank;
	
	
	/**
	 * The number of sets
	 */
	int n = 0;
	
	
	/**
	 * Class constructor
	 */
	public Sets(){
		set = new HashMap<V,V>();
		rank = new HashMap<V,Number>();
		n = 0;
	}
	
	
	/**
	 * Creates a disjoint set
	 * @param v
	 */
	public void makeSet(V v){
		set.put(v, v);
		rank.put(v, 0);
		n++;
	}
	

	/**
	 * Unifies two sets
	 * 
	 * @param x, an element of a set
	 * @param y, an element of a set
	 */
	public void union(V x, V y) {
		link(findSet(x), findSet(y));
	}
	
	
	/**
	 * Given an element of a set, it searches for the
	 * element that represents the set.
	 * 
	 * @param x, an element of the set
	 * 
	 * @return a set representative
	 */
	public V findSet(V x){
		V y = set.get(x);
		if( x != y )
			set.put(y, findSet(y));
		return set.get(y);
	}
	
	
	/**
	 * Merges two sets
	 * 
	 * @param x, an element of a set
	 * @param y, an element of a set
	*/
	private void link(V x, V y) {
		if( rank.get(x).intValue() > rank.get(y).intValue())
			set.put(y, x);
		else {
			set.put(x, y);
			if( rank.get(x).intValue() == rank.get(y).intValue()) 
				rank.put(y, rank.get(y).intValue() + 1);
		}
		n--;
	}


	/**
	 * Gets the number of sets
	 *
	 * @return the number of sets
	 */
	public int getNumberOfSets() {
		return this.n;
	}
	
	
	/**
	 * Returns the sets
	 * 
	 * @return
	 */
	public Map<V,V> getSets(){
		return this.set;
	}
	
	/**
	 * Returns the ranks of the representative of v
	 * 
	 * @param v, a vertex in a set
	 * @return an integer value
	 */
	public Number getRank(V v) {
		return rank.get(findSet(v));
	}
}
