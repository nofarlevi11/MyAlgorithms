package algorithms.search;

import static org.junit.Assert.*;

import org.junit.Test;

import algorithm.demo.MazeAdapter;
import algorithms.mazeGenerators.Maze3d;
import algorithms.mazeGenerators.Position;

public class BFSTest {


	int[][][] maze = {
			{ 	{ 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 0, 1 }, 
				{ 1, 0, 1, 0, 1 }, 
				{ 1, 0, 0, 0, 1 }, 
				{ 1, 1, 1, 1, 1 } } 
			};
	Position startPos = new Position(0, 1, 1);
	Position goalPos = new Position(0, 1, 3);
	Searchable<Position> mazeSearchable = new MazeAdapter(new Maze3d(maze,1,5,5, startPos, goalPos));
	BFS<Position> bfs = new BFS<Position>();
	Solution<Position> sol = bfs.search(mazeSearchable);

			
	@Test
	public void shouldReturnCountOfPathFromStartToFinishPosition() {
		assertEquals(7, sol.getStates().size());
	}


	@Test
	public void shouldReturnTheGoalStateOfTheMaze() {
		assertEquals(goalPos, sol.getStates().get(sol.getStates().size() - 1).getCost());
	}


	@Test
	public void shouldReturnTheStartStateOfTheMaze() {
		assertEquals(startPos, sol.getStates().get(0).getCost());
	}


	@Test
	public void checkIfTheEvaluatedNumberOfNodesOfTheSolutionIsValid() {
		assertEquals(true, bfs.getNumberOfNodesEvaluated() >= sol.getStates().size());
	}


}
