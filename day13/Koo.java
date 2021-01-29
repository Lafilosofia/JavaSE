package day13;
/**
 * 
 * @author HP
 *
 */
public class Koo {
	public String name = "Tom";
	
	public int age = 8;
	
	public void test(){
		System.out.println("Test");
	}
	
	public String test2(String name,int age){
		System.out.println("Test2");
		return "我的名字叫:" + name + ",我的年龄是:" + age;
	}
	
	static{
		//在类加载期间执行
		System.out.println("Load Koo!");
	}
}
