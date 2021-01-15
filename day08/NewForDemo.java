package day08;
/**
 * JDK1.5之后推出了一个新的特性增加for循环，也称新循环
 * 
 * 新循环并不取代传统的for循环的工作，它用来便利集合或数组使用
 * 
 * @author 86180
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		String[] array = {"one","two","three"};
		for(int i = 0;i < array.length;i ++){
			String str = array[i];
			System.out.println(str);
		}
		/*
		 * 新循环时编译器认可，编译器会在编译源代码时改为使用传统for循环遍历数组
		 */
		
		for(String s:array){
			System.out.println(s);
		}
}
}