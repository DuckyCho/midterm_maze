package maze.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Defines {
	
	/*are used when maze is built, some of constants are also used when Finder checks status of maze*/
	public static final int wall = 1;
	public static final int empty = 0;
	public static final int unvalid =  -1;
	public static final boolean fail = false;
	public static final int finderIdConstructor = 2;
	public static final int basicMazeSize = 8;
	public static final int[][] wallPreset = {
		{0,1,1,1,0,1,1,1},
		{0,0,0,1,0,0,0,0},
		{1,1,0,0,0,1,0,1},
		{1,1,0,1,1,1,0,1},
		{1,0,0,1,0,0,0,0},
		{0,1,1,1,0,1,1,1},
		{1,0,1,1,0,0,0,0},
		{0,1,1,0,1,1,1,0}
		};
	
	
	/*directions*/
	public static final int N = 0;
	public static final int NE = 1;
	public static final int E = 2;
	public static final int ES = 3;
	public static final int S = 4;
	public static final int SW = 5;
	public static final int W = 6;
	public static final int WN = 7;
	public static final int NN = 8;
		
		
	/*are used when Finder explores the maze*/
	
	public static ArrayList<Coordinate> movePos; 
	public static final int inorder = 0;
	public static int inverse;
	public static int searchDirection;
	public static int theNumberOfFinder;
	
	//searchDirection파일을 읽어들여 property를 설정
	//invsere, searchDirection, movePos어레이를 설정값에 따라 변경
	public static void setProperties() throws IOException{
				
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("Properties");
		props.load(in);
		theNumberOfFinder = Integer.valueOf(props.getProperty("howManyFinder"));
		searchDirection = Integer.valueOf(props.getProperty("searchDirection"));
		inverse = searchDirection;
		
		if(searchDirection == 4){
			movePos = new ArrayList<Coordinate>(); 
			
			movePos.add(new Coordinate(0,-1));
			movePos.add(new Coordinate(1,0));
			movePos.add(new Coordinate(0,1));
			movePos.add(new Coordinate(-1,0));
			
			movePos.add(new Coordinate(0,-1));
			movePos.add(new Coordinate(-1,0));
			movePos.add(new Coordinate(0,1));
			movePos.add(new Coordinate(1,0));
		}
		
		else if(searchDirection == 8){
			movePos = new ArrayList<Coordinate>(); 
			
			movePos.add(new Coordinate(0,-1));
			movePos.add(new Coordinate(1,-1));
			movePos.add(new Coordinate(1,0));
			movePos.add(new Coordinate(1,1));
			movePos.add(new Coordinate(0,1));
			movePos.add(new Coordinate(-1,1));
			movePos.add(new Coordinate(-1,0));
			movePos.add(new Coordinate(-1,-1));
			
			movePos.add(new Coordinate(0,-1));
			movePos.add(new Coordinate(-1,-1));
			movePos.add(new Coordinate(-1,0));
			movePos.add(new Coordinate(-1,1));
			movePos.add(new Coordinate(0,1));
			movePos.add(new Coordinate(1,1));
			movePos.add(new Coordinate(1,0));
			movePos.add(new Coordinate(1,-1));
		}
	
	}
	
	
}
