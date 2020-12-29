package day01;
/**
 * StringBulider:
 * �ǿɱ��ַ���,�������StringBuliderʵ��,�������ܻ��һ��
 * @author 86180
 *StringBuffer��StringBuilder����
 *1. StringBuffer���̰߳�ȫ��,ͬ�������,��������
 *2. StringBuilder���̲߳���ȫ��,���������,�����Կ�
 *
 *������ǲ������߳��Ƿ�ȫ����,��ѡ�����ܿ��StringBuilder
 *
 *
 *@since  ʼ��JDK�汾
 *@see   java.lang.StringBuilder �μ�
 *
 *
 *
 *
 */
public class DemoStringBulider {
	/**
	 *��������˵�� 
	 * @param ����
	 * @return  ""
	 * @throws 
	 */
	public String test(){
		return "";
	}
	
	
	
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		/*
		 * StringBuilder�����ṩ��append()���ӷ��� 
		 * insert()���뷽�� delete()ɾ������
		 */
		sb.append("java");
		sb.append("php");
		sb.append("c");
		/*
		 * ��StringBuilderת��String���� ��StringBuilde�����toString()����
		 */
		String str=sb.toString();
		System.out.println(str);
		
		/*
		 * insert(int offset,String str)
		 * offset:����λ��(�±�)
		 * str:����ָ�����ַ���
		 */
		sb.insert(4, "c##");
		System.out.println(sb.toString());
		
		/*
		 * ɾ��ָ�����ַ���
		 * delete(int start, int end)
		 * start:ɾ��ָ���ַ�����ʼλ��
		 * end:ɾ��ָ���ַ����Ľ���λ��
		 * ��ͷ����β
		 */
		sb.delete(7, 10);
		System.out.println(sb.toString());
		
		StringBuilder sb2=new StringBuilder();
		sb2.append("���").append("�Һܺ�").insert(2, "����").delete(4,7);
		System.out.println(sb2.toString());
		
		StringBuffer s=new StringBuffer();
		s.append("����").insert(1, "�Ǻ�").delete(1, 3);
		System.out.println(s.toString());
		
		
	}

}	

