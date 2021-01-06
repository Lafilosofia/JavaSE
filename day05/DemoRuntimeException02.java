package day05;
/**
 * 自定义异常:
 * 必须要继承父类RuntimeException
 * @author HP
 *
 */
public class DemoRuntimeException02 {
	public static void register(){
		String name = "admin";
		if(name.equals("admin")){
			throw new NameAlreadyException("姓名被占用!");
		}
	}
	public static void main(String[] args) {
		try{
			register();
		}catch(Exception e){
			System.out.println(e.getMessage());//获取异常信息
		}
	}
}
