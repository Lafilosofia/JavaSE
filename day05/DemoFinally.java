package day05;
/**
 * finally��:
 * finally��ֻ�ܶ������쳣������Ƶ����,����ֱ�Ӹ���try����������һ��
 * catch֮��,finally���Ա�ֻ֤Ҫ�������е�try��,��ô����try���еĴ���Ƭ��
 * �Ƿ�����쳣,finally������Ĵ��붼����ִ��;
 * 
 * ͨ�����ͷ���Դ�Ȳ�������finally��,����:���Ĺر�;
 * 
 * ע��:finally����return֮ǰִ��
 * @authorHP
 *
 */
public class DemoFinally {
	public static void main(String[] args) {
		System.out.println("����ʼִ��");
		try{
			String str = "hassasd";
			System.out.println(str.charAt(2));
			return ;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("�ͷ���Դ");
		}
	}
}
