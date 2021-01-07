package day05;
/**
 * 使用当前类测试异常的抛出
 * @author Lenovo
 *
 */
public class Person {
	private int age;
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) throws AgeException{
		/*
		 * 一个方法内部使用throw抛出一个异常,就要在方法上使用throws
		 * 声明该异常的抛出已告知调用方处理这个异常,
		 * 只有RuntimeException及其子类型异常在方法中抛出是不需要在方法
		 * 上声明该异常的抛出,其他类型则必须在方法后使用throws抛出异常
		 * 否则编译不通过
		 */
		if(age<0 || age>120){
			throw new AgeException("年龄不合法,请认真填写您的年龄!");
		}
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	
	
}
