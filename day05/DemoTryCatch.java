package day05;
/**
 * Java�쳣�����쳣������
 * try-catch
 * �﷨:
 * try{
 *   ����Ƭ��
 * }catch(�쳣��){
 *   ����try����Ƭ���г��ֵ�XXException������
 * }
 * @author HP
 *
 */
public class DemoTryCatch {
	public static void main(String[] args) {
		try{
			String str = null;
			String str2 = "";
			//System.out.println(str.length());
			//System.out.println(Integer.parseInt(str));
			System.out.println(str2.charAt(1));
		}catch(NumberFormatException e){
			//e.printStackTrace();//��־����
			System.out.println("����ת���쳣!");
		}catch(NullPointerException e){
			System.out.println("��ָ���쳣!");
			/*
			 * Ӧ������һ����ϰ��,���һ��catch����Exception��ֹ��Ϊû��
			 * ��׽�����쳣���³����׳��쳣�Ǵ�С����(�������쳣�������쳣)
			 */
		}catch(Exception e){
			System.out.println("�������ǳ��˸���!");
		}
		
	}
}
