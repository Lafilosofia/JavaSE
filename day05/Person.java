package day05;
/**
 * ʹ�õ�ǰ������쳣���׳�
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
		 * һ�������ڲ�ʹ��throw�׳�һ���쳣,��Ҫ�ڷ�����ʹ��throws
		 * �������쳣���׳��Ѹ�֪���÷���������쳣,
		 * ֻ��RuntimeException�����������쳣�ڷ������׳��ǲ���Ҫ�ڷ���
		 * ���������쳣���׳�,��������������ڷ�����ʹ��throws�׳��쳣
		 * ������벻ͨ��
		 */
		if(age<0 || age>120){
			throw new AgeException("���䲻�Ϸ�,��������д��������!");
		}
		this.age=age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
	
	
}
