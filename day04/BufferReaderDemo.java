package day04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * �����ַ�������
 * BufferedReader
 * @author 86180
 *
 */
public class BufferReaderDemo {
	public static void main(String[] args)throws Exception {
		//�����ֽ���
		//FileInputStream fis=new FileInputStream("pw2.txt");
		
		//����ת����
	//	InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		
		//�����ַ���
	//	BufferedReader br=new BufferedReader(isr);
		BufferedReader br=new BufferedReader(
				new InputStreamReader(
						new FileInputStream("pw2.txt"),"UTF-8")
				);
		/*
		 *BufferedReader�ṩ�� String readLine()����.
		 *������ȡ�����ַ�,ֱ����ȡ�����з�Ϊֹ,Ȼ�󽫻��з�֮ǰ��ȡ��
		 *�ַ���һ���ַ�����ʽ����.
		 *ע��,�����ַ����в������������Ļ��з�,
		 *������ֵΪnull,���ʾ����ĩβ
		 * 
		 */
		String line=null;//ÿһ�ж���������
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}
