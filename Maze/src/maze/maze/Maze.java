package maze.maze;

import maze.utils.Coordinate;
import maze.utils.Defines;

//Singleton maze
//int형 2차원 배열 maze와 입구,출구 정보를 가지고있다.

public class Maze {
	private static int[][] maze;
	private static Coordinate entrance;
	private static Coordinate exit;
	private static Maze m1 = new Maze();
	
	
	private Maze(){
		Maze.maze = new int[Defines.basicMazeSize][Defines.basicMazeSize];
			for(int i = 0 ; i < Defines.basicMazeSize ; i++){
				for(int j = 0 ; j< Defines.basicMazeSize ; j++){
					Maze.maze[i][j] = Defines.wallPreset[i][j];
				}
			}
			entrance = new Coordinate(0,0);
			exit = new Coordinate(7,7);
	}
		
	
	public static Coordinate getMazeEntrance(){
		 return Maze.entrance;
	}
	
	public static Coordinate getMazeExit(){
		return Maze.exit;
	}
	
	public static Maze getInstance(){
		return Maze.m1;
	}
	
	
	//좌표값을 인자로 받아 그 위치의 값을 get하거나 set
	public static int getMazeLocationInfo(Coordinate location){
		int result;
		if(Maze.isValidLocation(location))
			result = Maze.maze[location.getY()][location.getX()];
		else
			result = Defines.unvalid;
		
		return result;
	}
	
	public static boolean setMazeLocationInfo(Coordinate location, int info){
		boolean result;
		if(Maze.isValidLocation(location)){
			Maze.maze[location.getY()][location.getX()] = info;
			result = true;
		}
		else
			result = Defines.fail;
		
		return result;
	}
	
	
	//좌표값이 valid한 지역인지 체크하여 boolean값을 return
	public static boolean isValidLocation(Coordinate location){
		boolean result;
		
		if(location.getX() < Defines.basicMazeSize && location.getX() >= 0 && location.getY() < Defines.basicMazeSize && location.getY() >= 0)
			result = true;
		else
			result = false;
		
		return result;
	}
	
	public static void printMaze(){
		for(int i = 0 ; i <Defines.basicMazeSize ; i++){
			for(int j = 0 ;j <Defines.basicMazeSize; j++){
				System.out.print(String.format("%d\t",maze[i][j]));
			}
			System.out.println();
		}
	}
}	


