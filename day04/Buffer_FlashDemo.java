package day04;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * �������Ļ���������
 * ���������������ļ����������Ч��;
 * ������ʵ���ϱ��ʾ��ǽ��п��д����,��������ʹ�û��������к��ֶ�д��ʽ,����
 * ���ᱻ������ת��Ϊ���д��ʽͨ���ļ�������ʵ�ʲ���;
 * 
 * �������ڲ�ά����һ��8k���ֽ�������,���ڿ��д����
 * 
 * BufferedInputStream:���뻺����
 * BufferedOutputStream:���������
 * 
 * �������ṩ��һ��ǿ��д�����ݵķ���:flush();
 * @author 86180
 *
 */
public class Buffer_FlashDemo {
	public static void main(String[] args)throws Exception {
		//�ļ������
		FileOutputStream fos=new FileOutputStream("bos.txt");
		//�ļ����������
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String str="������ʹ��ľ����ڲ������������ѡ���˰���";
		byte[] bytes=str.getBytes("UTF-8");
		bos.write(bytes);
		System.out.println("д�����!");
		//bos.flush();//ǿ�ƽ���ǰ����������д��
		bos.close();//������close()ʱ�����flush();
	}
}
