package maze.main;


import maze.findway.FindWayDuo;
import maze.findway.FindWaySolo;
import maze.findway.IFindWay;
import maze.maze.Maze;
import maze.utils.Defines;

public class MazeMain {

	public static void main(String[] args) {
		
			Maze.printMaze();
			
			IFindWay f1;
			IFindWay f2;
			
			if(Defines.operationComparisonMode){

				f1 = new FindWaySolo();
				f1.startFindWay();
				
				Maze.resetMaze();
		
				f2 = new FindWayDuo();
				f2.startFindWay();

			}
			
			else{
				if(Defines.theNumberOfFinder == 1){
					f1 = new FindWaySolo();
					f1.startFindWay();
				}
				else{
					f2 = new FindWayDuo();
					f2.startFindWay();
				}
			}
			
			
				

	}

}
