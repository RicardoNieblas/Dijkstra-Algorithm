package edu.cetys.cinap.icc.algorithms.tree;

public enum RBTColor {
	/*
	 * Used to label the vertex as not explore.
	 */
	RED(),
	

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
	 public boolean validateStateChange(RBTColor source) {
		 boolean result;
			
		 switch (this) {
				case BLACK: 
					result = source == null ? true : false;
					break;
					
				case RED:
					result = BLACK.equals(source);
					break;
				
				default:
					result = false;
					break;
			} // End switch
			return result;
		} // End validateStateChange
}