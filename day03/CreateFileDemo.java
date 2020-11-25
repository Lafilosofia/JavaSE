package day03;

import java.io.File;
import java.io.IOException;

/**
 * java.io.File
 * File��ÿһ��ʵ��ʱ���ڱ�ʾӲ���ϵ�һ���ļ�����Ŀ¼.
 * 
 * ʹ��File����:
 * 1. �������ʾ���ļ���Ŀ¼��������Ϣ(����,��С,��)
 * 2. �����ļ���Ŀ¼(����,ɾ��)
 * 3. ����һ��Ŀ¼�е���������ǲ��ܷ����ļ�����
 * 
 * @author 86180
 *
 */
public class CreateFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڱ�ʾ�ļ���Ŀ¼ʱָ����·��������Ҫʹ�þ���·��,��Ϊ��ͬ�Ĳ���ϵͳ��ʽ��һ��.
		 * 
		 * ���·������õ�,�������·���������Ҫ���������Ǹ����л�������,
		 * ���л������������·��
		 * 
		 * ��eclipse�����г���ʱ,"��ǰĿ¼"ָ��������������ĿĿ¼��"./"��ʾ
		 * ������./����ʡ�Բ�д
		 */
		
		/*
		 * �ڵ�ǰĿ¼���½�һ���ļ�demo.txt
		 * File�ṩ��createNewFile()���������ļ�
		 */
		File file=new File("./demo.txt");
		/*
		 *File �ṩ��boolean exists()�÷����������жϵ�ǰFile��ʾ���ļ���Ŀ¼�Ƿ����
		 * ,�����򷵻�true
		 */
		if(!file.exists()){
			file.createNewFile();
			System.out.println("�ļ��Ѵ���!");
		}else{
			System.out.println("�ļ��Ѵ���!");
		}
		
	}
}
