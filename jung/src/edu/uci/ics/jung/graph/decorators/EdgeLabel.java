/**
 * Provides a class necessary to uniquely label graph edges
 * <p>
 * 
 * @author Adan Hirales Carbajal
 * @since %I%, %G%
 */

package edu.uci.ics.jung.graph.decorators;

import java.util.UUID;

public class EdgeLabel<E> {
	
	
	/**
	 * The edge unique identifier.
	 */
	UUID id;
	
	
	/**
	 * The user assigned label.
	 */
	E label;
	
	
	
	public EdgeLabel() {
		id = UUID.randomUUID();
	}
	
	
	public EdgeLabel(E e) {
		this();
		this.label = e;
	}
	
	
	/**
	 * Returns the edge unique identifier (UUID).
	 * 
	 * @return the edge UUID
	 */
	public UUID getUUID(){
		return this.id;
	}
	
	
	/**
	 * Sets the edge label
	 * 
	 * @param e the edge label
	 */
	public void setLabel(E e){
		this.label = e;
	}
	
	
	/**
	 * Gets the edge label
	 * 
	 * @return the edge label
	 */
	public E getLabel() {
		return label;
	}
}
