package edu.cetys.cinap.icc.algorithms.tree;

import edu.uci.ics.jung.graph.OrderedKAryTree;

@SuppressWarnings("serial")
public final class QuadTree<V> extends OrderedKAryTree<V,Number>{


	// Helper class
	public class Tuple {
		
		/*public Entity entity;
		
		public Rectangle node;
		
		public Tuple(QNode node, Entity entity) {
			this.node = node;
			this.entity = entity;
		}*/
	}
	
	private final static int order = 4;
	
	
	public QuadTree(int order) {
		super(order);
	}

	/**
     * Creates a Region Quad Tree. Location (minx, miny) and (maxx, maxy) correspond
     * to the lower left and upper right points of the rectangle partition. 
     *
     * @param {double} minX Minimum x-value that can be held in tree.
     * @param {double} minY Minimum y-value that can be held in tree.
     * @param {double} maxX Maximum x-value that can be held in tree.
     * @param {double} maxY Maximum y-value that can be held in tree.
     */
	public QuadTree(double minx, double miny, double maxx, double maxy, double threshold){
		this(order);
	//	super.root = new Tuple()
	}
	
	
	/**
     * Returns the quad tree root. 
     *
     * @return {QuadNode} The root node.
     */
	public V getRoot(){
		return super.root;
	}
	
	
	
	
}
