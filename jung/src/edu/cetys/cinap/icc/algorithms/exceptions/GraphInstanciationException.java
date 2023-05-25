package edu.cetys.cinap.icc.algorithms.exceptions;

public class GraphInstanciationException extends Exception{
	
	/**
	 * TODO: not yet commented
	 * 
	 */
	private static final long serialVersionUID = -185241670310984591L;

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 */
	public GraphInstanciationException() {
		super();
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param message
	 */
	public GraphInstanciationException(String message) {
		super(message);
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param cause
	 */
	public GraphInstanciationException(Throwable cause) {
		super(cause);
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param message
	 * @param cause
	 */
	public GraphInstanciationException(String message, Throwable cause) {
		super(message, cause);
	}
}