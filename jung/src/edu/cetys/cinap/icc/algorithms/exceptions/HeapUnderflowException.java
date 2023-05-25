package edu.cetys.cinap.icc.algorithms.exceptions;

/**
 * This Exception is thrown, when the heap is empty
 * 
 * @author <a href="mailto:ahirales@gmail.com">Adan Hirales Carbajal</a>
 *         (last edited by $Author$)
 * @version $Version$, $Date$
 * 
 */
public class HeapUnderflowException extends Exception{
	
	/**
	 * TODO: not yet commented
	 * 
	 */
	private static final long serialVersionUID = -1852416703109845948L;

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 */
	public HeapUnderflowException() {
		super();
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param message
	 */
	public HeapUnderflowException(String message) {
		super(message);
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param cause
	 */
	public HeapUnderflowException(Throwable cause) {
		super(cause);
	}

	/**
	 * TODO: not yet commented
	 * Creates a new instance of this class, using the given parameters.
	 *
	 * @param message
	 * @param cause
	 */
	public HeapUnderflowException(String message, Throwable cause) {
		super(message, cause);
	}
}