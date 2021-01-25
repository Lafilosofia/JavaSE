package day11;

public class Line {
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Line [x=" + x + ", y=" + y + "]";
	}
	
	public Line() {
		super();
	}
	
	public Line(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
}
