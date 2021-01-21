package day10;
/**
 * HashMap内部有数组保存键值对，存储元素时根据key的hashcode
 * 值计算数组索引并将键值对存入，获取时也根据该计算索引直接找到该元素，
 * 所以HashMap根据这个方式避免了查找元素时对数组的遍历操作，
 * 所以不受元素的多少而影响查询性能
 * 
 * 由于key的hashcode决定键值对在HashMap中数组索引位置，而equals方法决定着
 * key是否重复，所以这个方法要妥善重写
 * 
 * hashcode与equals方法是定义在Object中的，所以要妥善地重写两个方法，当我们
 * 定义的类需要重写equals和hashcode时必须遵循以下原则:
 * 1.成对重写，当我们需要重写一个类的equals方法时，就应当连同重写hashcode方法
 * 2.一致性:当两个对象equals比较为true时，hashcode值应当相等
 * 3.稳定性:当参与equals比较的属性没有发生变化的情况下，多次调用hashcode方法返回的数字不应当有变化
 * @author 86180
 *
 */
public class Key {
	private int x;
	private int y;
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
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
