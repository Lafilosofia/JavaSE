package day02;

public class DemoReg03 {
	public static void main(String[] args) {
		/*
		 * ƥ���ֻ���
		 * 11λ����
		 * +86,+0086
		 * +86|+008615829216986
		 * (+86)?
		 * ����()���Խ�һϵ��������ʽ����һ������
		 * ����ʱ��ʹ��"|"��ʾ"��"�Ĺ�ϵ
		 * . ?...  ��Ҫʹ��ת���ַ�"\\"
		 * "^"��""$
		 * ^�����ַ�����ʼ
		 * $�����ַ�������
		 */
		/*String phoneReg="^(\\+86|\\+0086)?\\s*\\d{11}$";//ע�������ַ�,��Ҫ����ת��
		String phone="+8615829216986";
		if(phone.matches(phoneReg)){
			System.out.println("�ֻ�����ͨ��");
		}else{
			System.out.println("����д��ȷ���ֻ���");
		}*/
		
		/*
		 * ƥ������
		 * kun_262307846@qq.com
		 */
		String emailReg="^\\w{4,18}@[a-z0-9]+\\.[a-z]{2,3}$";
		String email="kun_262307846@qq.com";
		if(email.matches(emailReg)){
			System.out.println("����ͨ��");
		}else{
			System.out.println("�밴�չ淶��������");
		}
		
		
	}
}
