package day02;

public class Point {
	int x;
	int y;
	
	public Point(){
		
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	 * ��дObject���е�equals(Object obj)����
	 * ��дequals��Ŀ�ľ��Ƕ��嵱ǰ����������Ĳ�������Ƚ�����,
	 * ��ʵ��Ӧ����,һ����Ҫ��д�÷���,ͨ���Ƚ϶���ĳ�Ա����
	 * 
	 */
	/*public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(this==obj){//�ж������Ƿ�ָ��ͬһ������
			return true;
		}
		if(obj instanceof Point){//�ж������Ƿ�һ��,���һ���Ƚ϶����еĳ�Ա����
			Point p=(Point)obj;
			return this.x==p.x && this.y==p.y;
		}
		return false;
	}*/
	
	
}
