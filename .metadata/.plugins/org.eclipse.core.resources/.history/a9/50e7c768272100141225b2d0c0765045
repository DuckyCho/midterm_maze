package maze.utils;

//醫뚰몴 �겢�옒�뒪
//X媛믨낵 Y媛믪쓣 媛�吏�
//X媛믪� �뿴�쓣 �쑜�븯怨�, Y媛믪� �뻾�쓣 �쑜�븳�떎.
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
	
	
	
	//toCoordinateWithDirections : Coordinate�겢�옒�뒪瑜� CoordinateWithDirections�겢�옒�뒪濡� 蹂�寃쏀빐
	public static CoordinateWithDirections toCoordianteWithDirections(Coordinate c1){
		CoordinateWithDirections transfer = new CoordinateWithDirections(c1.getX(),c1.getY(),Defines.N);
		
		return transfer;
	}
	
	public static CoordinateWithDirections toCoordianteWithDirections(Coordinate c1, int direction){
		CoordinateWithDirections transfer = new CoordinateWithDirections(c1.getX(),c1.getY(),direction);
		
		return transfer;
	}
	
	
	//Coordinate�겮由ъ쓽 �뿰�궛�쓣 �젙�쓽�븳 硫붿룜�뱶. Coordinate�몮�쓣 �뜑�븯硫� X醫뚰몴�겮由� Y醫뚰몴�겮由� �뜑�빐�꽌 return �빐以��떎.
	//Finder媛� nextPos瑜� currentPos�� nextDirection�쓣 addCoordinate �뿰�궛�쑝濡� �젙�븿
	public Coordinate addCoordinate(Coordinate c1){
		Coordinate addResult = new Coordinate(this.getX()+c1.getX(),this.getY()+c1.getY());
		return addResult;
	}

	//Coordinate瑜� clone
	public Coordinate clone() {
		Coordinate cloned = new Coordinate(this.X,this.Y);
		return cloned;
	}

	
	//Coordinate瑜� print�븯硫� X媛믨낵 Y媛믪쓣 異�
	@Override
	public String toString() {
		StringBuilder coordinate = new StringBuilder();
		if(this != null)
			coordinate.append(String.format("%s : %d , %s, %d","posX ",this.getX(),"posY",this.getY()));
		
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
