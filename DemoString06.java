package day01;
/**
 * ��ȡ�ַ���
 * substring(��ʼλ��)
 * substring(��ʼλ��/����λ��)
 * 
 * @author HP
 *
 */
public class DemoString06 {
	public static void main(String[] args) {
		String string = "http://ykt.com/index.html";
		/*String���ṩ��
		 * subString(int beginIndex,int endIndex)
		 * ����һ���ַ���
		 * ��ͷ����β(����ʼ���±�,�����������±�)*/
		String s = string.substring(0,4);
		System.out.println(s);
		
		//��ȡstr�е�����"ykt.com"
		s = string.substring(7, 14);
		System.out.println(s);
		
		//��7��ʼ������4���ַ�
		s = string.substring(7, 7 + 4);
		
		//��ȡstr��"ykt.com/index.html"
		/*String�����ṩ��sunstring(int beginIndex)����
		 * ����ʼλ�õ����ȫ����ȡΪ���ַ���*/
		s = string.substring(3);
		System.out.println(s);
		
		/*
		 * ��̬��ȡURL��������
		 * 0123456789...
		 * http://kunge.org/index.html
		 */
		String url="http://kunge.org/index.html";
		int index=url.indexOf("/", 7);
		String host=url.substring(7, index);
		//System.out.println(host);
		
		//��̬��ȡURL�е��ļ���"index.html"����substring()��lastIndexOf()
		/*int index2=url.lastIndexOf("/");
		System.out.println(index2);
		String host2=url.substring(index2+1);*/
		String host2=url.substring(url.lastIndexOf("/")+1);
		System.out.println(host2);
	}
}
