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
package edu.cetys.cinap.icc.algorithms.set;

import java.util.Comparator;
import edu.uci.ics.jung.graph.decorators.EdgeLabel;

/** 
 * Sorts the edges in nondecreasing order of edge labels
 * 
 * @author Adan Hirales Carbajal
 * @param <E> of type EdgeLabel
 * @see EdgeLabel
 */

@SuppressWarnings("rawtypes")
public class EdgeComparator<E> implements Comparator<E>{
		
		public int compare(E el1, E el2) {
			double n1, n2;
			
			
			Object e1 = ((EdgeLabel) el1).getLabel();
			Object e2 = ((EdgeLabel) el2).getLabel();
			
			// If possible transform the edge value to a number 
			if( e1 instanceof Number && e2 instanceof Number){
				n1 = ((Number)e1).doubleValue();
				n2 = ((Number)e2).doubleValue();
			} else {
			// The weight of the DAG was provided as a String
				n1 = (new Double((String)e1)).doubleValue();
				n2 = (new Double((String)e2)).doubleValue();
			}
			
			return ( n1 < n2 ? -1 : (n1 == n2 ? 0 : 1));
		}
}
