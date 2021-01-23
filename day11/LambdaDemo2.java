package day11;
/**
 * Lambda表达式
 * 有参形式
 * @author Lenovo
 *
 */
public class LambdaDemo2 {
	public static void main(String[] args) {
		/*Test02 t=new Test02() {
			
			public void demo2(int a) {
				System.out.println("a的值是:"+a);
			}
		};
		t.demo2(8);*/
		
		//Lambda表达式写
		/*
		 * 1.在接口中的方法列表(参数)可以省略类型
		 * 2.如果方法中只有一个参数则可以省略掉()
		 */
		Test02 t=a->{
			System.out.println("a的值是:"+a);
		};
		t.demo2(8);
		
		Test02_2 t2=(age, name)->{
			System.out.println("我的名字叫:"+name+",我的年龄:"+age);
		};
		t2.demo02(18, "乌龟");
	}
}
