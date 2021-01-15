package day08;

public class Point implements Comparable<Point> {
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
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	/*
	 * ʵ��Comparable�ӿ�,Ҫ�������д�÷���:
	 * �÷�������˼�Ƕ��嵱ǰ�������������Ĵ�С��ϵ
	 * ������ֵ>0: ��ǰ����this���ڲ�������o
	 * ������ֵ<0: this<o
	 * ������ֵ=0: this=o
	 */
	@Override
	public int compareTo(Point o) {
		//��ǰ����
		int len=this.x*this.x+this.y*this.y;
		//����
		int olen=o.x*o.x+o.y*o.y;
		return len-olen;
	}
	
}
