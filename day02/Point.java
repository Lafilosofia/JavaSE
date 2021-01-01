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
	 * 重写Object类中的equals(Object obj)方法
	 * 重写equals的目的就是定义当前对象与给定的参数对象比较内容,
	 * 在实际应用中,一般需要重写该方法,通过比较对象的成员属性
	 * 
	 */
	/*public boolean equals(Object obj){
		if(obj==null){
			return false;
		}
		if(this==obj){//判断引用是否指向同一个对象
			return true;
		}
		if(obj instanceof Point){//判断类型是否一样,如果一样比较对象中的成员属性
			Point p=(Point)obj;
			return this.x==p.x && this.y==p.y;
		}
		return false;
	}*/
	
	
}
