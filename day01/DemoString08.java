package day01;

import org.junit.Test;

/**
 * String�ṩ�ķ���
 * starWith()
 * endWith()
 * @author 86180
 *
 */
public class DemoString08 {
	@Test
	public void tttt(){
		System.out.println("�Ǻ�");
	}
	
	@Test
	public void dddd(){
		System.out.println("ddd");
	}
	
	public void testStartWith(){
		/*
		 * String���ṩ��starsWith(String str)
		 * ���һ���ַ����Ƿ���֮����ָ���ַ���str��ͷ
		 */
		String str = "http://baidu.com";
		if(str.startsWith("http")){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
	}
	
	public void testEndWith(){
		/*
		 * String���ṩ��starsWith(String str)
		 * ���һ���ַ����Ƿ���֮����ָ���ַ���str��ͷ
		 */
		String str = "http://baidu.com";
		if(str.endsWith("http")){
			System.out.println("��");
		}else{
			System.out.println("��");
		}
	}
}
