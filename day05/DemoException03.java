package day05;

public class DemoException03 {
	public void test() throws Exception{
		
	}
}
	
class Demo04 extends DemoException03{
	//父类重写方法
	public void test() throws NullPointerException{
		
	}
}