package day05;
/**
 * �Զ����쳣:
 * ����Ҫ�̳и���RuntimeException
 * @author HP
 *
 */
public class DemoRuntimeException02 {
	public static void register(){
		String name = "admin";
		if(name.equals("admin")){
			throw new NameAlreadyException("������ռ��!");
		}
	}
	public static void main(String[] args) {
		try{
			register();
		}catch(Exception e){
			System.out.println(e.getMessage());//��ȡ�쳣��Ϣ
		}
	}
}
