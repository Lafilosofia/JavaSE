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
		return "�ҵ����ֽ�:" + name + ",�ҵ�������:" + age;
	}
	
	static{
		//��������ڼ�ִ��
		System.out.println("Load Koo!");
	}
}
