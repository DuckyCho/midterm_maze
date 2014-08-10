package maze.utils;

//Coordinate 클래스를 상속받아 Direction을 추가한 클래스
public class CoordinateWithDirections extends Coordinate{
	
	private int Direction;
	
	//Constructor
	public CoordinateWithDirections(CoordinateWithDirections cd1){
		this.setX(cd1.getX());
		this.setY(cd1.getY());
		this.setDirection(cd1.getDirection());
	}
	
	public CoordinateWithDirections(int X, int Y, int Direction){
		this.setX(X);
		this.setY(Y);
		this.Direction = Direction;
	}
	
	//get, set Direction
	public int getDirection(){
		return this.Direction;
	}
	
	public void setDirection(int Direction){
		this.Direction = Direction;
	}
	
	
	//clone
	public CoordinateWithDirections clone() {
		CoordinateWithDirections cloned = new CoordinateWithDirections(this.getX(),this.getY(),this.Direction);
		return cloned;
	}
	

}
