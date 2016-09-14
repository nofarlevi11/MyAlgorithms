package algorithms.mazeGenerators;

// TODO: Auto-generated Javadoc
/**
 * <h1> Maze 3d Generator </h1>
 * This interface is defines all the types of 3d maze generation algorithm.
 *
 * @author NofarLevi
 * @since August 2016
 */
public interface Maze3dGenerator {

	/**
	 * Generate.
	 *
	 * @param floor the floor
	 * @param rows the rows
	 * @param cols the cols
	 * @return the maze 3 d
	 */
	Maze3d generate (int floor, int rows, int cols);
	
	/**
	 * Measure algorithm time.
	 *
	 * @param floor the floor
	 * @param rows the rows
	 * @param cols the cols
	 * @return the string which represent the time it took to generate the maze
	 */
	String measureAlgorithmTime(int floor, int rows, int cols);
	
	/**
	 * Sets the checks if is done.
	 *
	 * @param isDone the new checks if is done
	 */
	public void setIsDone (boolean isDone);
	
}
