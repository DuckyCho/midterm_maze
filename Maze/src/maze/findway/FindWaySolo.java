package maze.findway;

import java.io.IOException;
import java.util.ArrayList;

import maze.finder.*;
import maze.maze.Maze;
import maze.utils.Coordinate;
import maze.utils.Defines;

public class FindWaySolo implements IFindWay {
	//싱글 쓰레드로 미로찾기
	//Finder를 한명만 생성
	
	public Finder finderSolo;

	
	public FindWaySolo(){
		try {
			Defines.setProperties();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		finderSolo = new Finder(Defines.inorder,Maze.getMazeEntrance(),Maze.getMazeExit());
		
	}
	
	@Override
	public void startFindWay() {
		finderSolo.run();
		this.printWay();
	}

	@Override
	public void printWay() {
		ArrayList<Coordinate> finderWay = new ArrayList<Coordinate>();
		
		while(finderSolo.fHistory.top > 0 )
			finderWay.add(finderSolo.fHistory.popLocation());
	
		
		for(int i = finderWay.size()-1 ; i >= 0 ; i--)
			System.out.println(finderWay.get(i));
	}
	
	

}
