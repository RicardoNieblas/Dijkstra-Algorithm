package edu.cetys.cinap.icc.algorithms.exceptions;

public class GraphTypeException extends Exception{
	
	/**
	 * TODO: not yet commented
	 * 
	 */
	private static final long serialVersionUID = -1852416703109845918L;

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 */
	public GraphTypeException() {
		super();
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param message
	 */
	public GraphTypeException(String message) {
		super(message);
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param cause
	 */
	public GraphTypeException(Throwable cause) {
		super(cause);
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param message
	 * @param cause
	 */
	public GraphTypeException(String message, Throwable cause) {
		super(message, cause);
	}
}