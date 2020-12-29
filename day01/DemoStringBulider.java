package day01;
/**
 * StringBulider:
 * 是可变字符串,建议采用StringBulider实现,这样性能会好一点
 * @author 86180
 *StringBuffer和StringBuilder区别
 *1. StringBuffer是线程安全的,同步处理的,性能稍慢
 *2. StringBuilder是线程不安全的,并发处理的,性能稍快
 *
 *如果我们不考虑线程是否安全问题,则选择性能快的StringBuilder
 *
 *
 *@since  始于JDK版本
 *@see   java.lang.StringBuilder 参见
 *
 *
 *
 *
 */
public class DemoStringBulider {
	/**
	 *方法功能说明 
	 * @param 参数
	 * @return  ""
	 * @throws 
	 */
	public String test(){
		return "";
	}
	
	
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		/*
		 * StringBuilder类中提供了append()增加方法 
		 * insert()插入方法 delete()删除方法
		 */
		sb.append("java");
		sb.append("php");
		sb.append("c");
		/*
		 * 把StringBuilder转换String类型 在StringBuilde类调用toString()方法
		 */
		String str=sb.toString();
		System.out.println(str);
		
		/*
		 * insert(int offset,String str)
		 * offset:插入位置(下标)
		 * str:插入指定的字符串
		 */
		sb.insert(4, "c##");
		System.out.println(sb.toString());
		
		/*
		 * 删除指定的字符串
		 * delete(int start, int end)
		 * start:删除指定字符的起始位置
		 * end:删除指定字符串的结束位置
		 * 含头不含尾
		 */
		sb.delete(7, 10);
		System.out.println(sb.toString());
		
		StringBuilder sb2=new StringBuilder();
		sb2.append("你好").append("我很好").insert(2, "坤哥").delete(4,7);
		System.out.println(sb2.toString());
		
		StringBuffer s=new StringBuffer();
		s.append("哈哈").insert(1, "呵呵").delete(1, 3);
		System.out.println(s.toString());
		
		
	}

}	

