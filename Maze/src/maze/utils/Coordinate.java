package maze.utils;

//좌표 클래스
//X값과 Y값을 가짐
//X값은 열을 뜻하고, Y값은 행을 뜻한다.
public class Coordinate {
	
	private int X;
	private int Y;
	
	
	//constructor
	public Coordinate(){
		this.X = 0 ;
		this.Y = 0 ;
	}
	
	public Coordinate(int X, int Y){
		this.X = X;
		this.Y = Y;
	}
	
	public Coordinate(Coordinate c1){
		this.X = c1.getX();
		this.Y = c1.getY();
	}
	
	
	//set, get value of X, Y
	public void setX(int X){
		this.X = X;
	}
	
	public int getX(){
		return this.X;
	}
	
	public void setY(int Y){
		this.Y = Y;
	}
	
	public int getY(){
		return this.Y;
	}
	
	
	
	//toCoordinateWithDirections : Coordinate클래스를 CoordinateWithDirections클래스로 변경해
	public static CoordinateWithDirections toCoordianteWithDirections(Coordinate c1){
		CoordinateWithDirections transfer = new CoordinateWithDirections(c1.getX(),c1.getY(),Defines.N);
		
		return transfer;
	}
	
	public static CoordinateWithDirections toCoordianteWithDirections(Coordinate c1, int direction){
		CoordinateWithDirections transfer = new CoordinateWithDirections(c1.getX(),c1.getY(),direction);
		
		return transfer;
	}
	
	
	//Coordinate끼리의 연산을 정의한 메쏘드. Coordinate둘을 더하면 X좌표끼리 Y좌표끼리 더해서 return 해준다.
	//Finder가 nextPos를 currentPos와 nextDirection을 addCoordinate 연산으로 정함
	public Coordinate addCoordinate(Coordinate c1){
		Coordinate addResult = new Coordinate(this.getX()+c1.getX(),this.getY()+c1.getY());
		return addResult;
	}

	//Coordinate를 clone
	public Coordinate clone() {
		Coordinate cloned = new Coordinate(this.X,this.Y);
		return cloned;
	}

	
	//Coordinate를 print하면 X값과 Y값을 출
	@Override
	public String toString() {
		StringBuilder coordinate = new StringBuilder();
		if(this != null)
			coordinate.append(String.format("%s : %d , %s, %d","X좌표",this.getX(),"Y좌표",this.getY()));
		
		return coordinate.toString();
	}

	@Override
	public int hashCode() {
		int result = this.Y*10 + this.X;
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		Coordinate c1;
		boolean result = false;
		
		if(obj instanceof Coordinate){
			c1 = (Coordinate)obj;
			if(this.X == c1.X && this.Y == c1.Y){
				result = true;
			}
		}
		else{
			result = false;
		}
		
		return result;
	}

	
}
