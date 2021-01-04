package day04;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * �ַ���
 * java�������ն�д��λ����Ϊ�ֽ������ַ���
 * InputStream��OutputStream�������ֽ����ĸ���
 * ��java.io.Reader��java.io.Writer���ַ����ĸ���;
 * С����:��Stream��β��һ�����ֽ���(Ҳ���ǵͼ���),��Reader��Writer��β��һ�����ַ���(Ҳ���Ǹ߼���)
 * 
 * �ַ���ֻ�Ƿ������Ƕ�д�ַ�,�ײ㱾�ʻ��Ƕ�д�ֽ�,ֻ���ֽ����ַ���ת��
 * ����������ת���������;
 * 
 * ת����:
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 
 * java�ṩ�������߼��ַ�������һ���ص����ֻ�������������ַ�����,
 * ����ͨ���ͼ��������ֽ���,��͵����ַ�������ֱ�Ӵ����ֽ���ʹ��,
 * ����ת��������,���Ǳ�������ַ���,�������ֿ��������ֽ���,������ʵ�ʿ����е�����ʹ�ø߼����ַ���
 * ʱͨ�����ֽ�������ʱ��Ҫʹ��ת����,����"��������"������,Ҳ����"���ַ�ת���ֽ�"�Ĺ���
 * 
 * @author HP
 *
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws Exception {
		//����ֽ���
		FileOutputStream fos = new FileOutputStream("osw.txt");
		//���ת����
		/*
		 * OutputStreamWirter���췽��OutputStreamWriter(OutputStream out)
		 * InputStreamReader(InputStream in)
		 * 
		 * OutputStreamWriter(OutputStream out,String charset);
		 * InputStreamReader(InputStream in,String charset);
		 * charset:�����ʽ
		 */
		OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		String str = "������ˮ��׺�";
		osw.write(str);
		osw.write(",�ٰ���˼����ɽ");
		System.out.println("д�����");
		osw.close();
		
		
	}
}
