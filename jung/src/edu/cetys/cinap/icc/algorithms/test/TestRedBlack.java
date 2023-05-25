package edu.cetys.cinap.icc.algorithms.test;

import edu.cetys.cinap.icc.algorithms.tree.BinaryTree;
import edu.cetys.cinap.icc.algorithms.tree.Tree;

public class TestRedBlack {

	public static void main(String args[]) {
		Tree<Number> tree = new BinaryTree<Number>();
		
		tree.insert(new Integer("1"));
		tree.insert(new Integer("2"));
		tree.insert(new Integer("3"));
	}
}
