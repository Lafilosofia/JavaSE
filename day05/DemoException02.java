package day05;
/**
 * �쳣���׳�:
 * throw�ؼ���,���ڽ�һ���쳣�׳�.
 * ͨ����������������׳�һ���쳣:
 * 1.��������һ�������﷨Ҫ��,���ǲ�����ҵ���߼�Ҫ���ʱ��������׳�һ���쳣��������
 * 
 * 2.����������쳣,���ǲ�Ӧ���ڵ�ǰ����Ƭ���н��,���쳣ʱ�����׸�������
 * 
 * �����ǵ���һ������throws�����쳣�׳��ķ���ʱ,������Ҫ�����Ǳ��봦������쳣,
 * ����ʽ������:
 * 1.try-catch�ֽڲ����쳣������
 * 2.�ڵ�ǰ�����ϼ���ʹ��throws���������쳣�׳�,���ǵ�������Ҫ�������������쳣
 * @author HP
 *
 */
public class DemoException02 {
	public static void main(String[] args) {
		Person p = new Person();
		try{
			p.setAge(1000);
		}catch(AgeException e){
			System.out.println(e.getMessage());
		}
	}
}
