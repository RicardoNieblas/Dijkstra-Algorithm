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



/**
 *	Color is used by the classic Depth First Search algorithm in Graph 
 * 	theory. A color indicates if a vertex has been explored or not.
 *	<p>
 *	The following color states are defined: 
 *	<ul>
 *	<li> WHITE 		The vertex has not been explored.
 *	<li> GRAY 		The vertex is being explored, one or more adjacent vertices have not been explored.
 *	<li> BLACK		All adjacent vertices have been explored.
 *	</ul>
 *	<p>
 * 
 * @author </a>href="mailto:ahirales@uabc.mx">Adan Hirales Carbajal</a>
 *         (last edited by $Author$)
 * @see DFSDistanceLabeler
 * @version $Version$, $Date$
 */

public enum Color {
	/*
	 * Used to label the vertex as not explore.
	 */
	WHITE(),
	
	/*
	 * Used to level a vertex when one or more adjacent 
	 * neighbors have been explored.
	 */
	GRAY(),
	
	/*
	 * Used to level vertex when all adjacent neighbors 
	 * have been explored.
	 */
	BLACK();
	
	/**
	 * Verifies valid state transitions
	 * 
	 *	@param 	source	the source state (current state)
	 *	@return	<code>true</code> if the transition is valid;
	 *			<code>false</code> otherwise
	 */
	 public boolean validateStateChange(Color source) {
		 boolean result;
			
		 switch (this) {
				case WHITE: 
					result = source == null ? true : false;
					break;
					
				case GRAY:
					result = WHITE.equals(source); 
					break;
					
				case BLACK:
					result = GRAY.equals(source);
					break;
				
				default:
					result = false;
					break;
			} // End switch
			return result;
		} // End validateStateChange
}//End Color
