package day02;



/**
 * Object(��������):
 * ���е��඼��һ�������Object,Ĭ�ϵĸ�����java.lang.Object
 * Object���͵����ñ�����ָ���κ����Ͷ���(��������)
 * 
 * Object��������:
 * toString():����String����,�÷����������ǽ���ǰ����ת��Ϊһ���ַ���
 * Object�Ѿ�ʵ���˸÷���,���ص��ַ����ǵ�ǰ������(����),��ʽΪ����.����@ɢ����,
 * ���ַ�����ʵ�ʿ����е����岻��,����ͨ����Ҫʹ���������ʱ��Ҫ��д
 * @author HP
 *
 */
public class DemoObject {
	public static void main(String[] args) {
		/*
		 * toString()�����Ƿǳ����õĵ��Թ���(һ�㷵�ص������еĳ�Ա����),
		 * ǿ�ҽ����Զ���Ķ�����дtoString()����
		 */
		Person p = new Person("����",30);
		//System.out.println(�������);//ֱ�ӵ���toString()����,������toString()����ʡ��
		System.out.println(p.toString());
		System.out.println(p);
	}
}
