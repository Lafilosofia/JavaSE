package day05;
/**
 * Java异常捕获异常机制中
 * try-catch
 * 语法:
 * try{
 *   代码片段
 * }catch(异常类){
 *   捕获try代码片段中出现的XXException并处理
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
			//e.printStackTrace();//日志跟踪
			System.out.println("数字转换异常!");
		}catch(NullPointerException e){
			System.out.println("空指针异常!");
			/*
			 * 应当养成一个好习惯,最后一个catch捕获Exception防止因为没有
			 * 捕捉到的异常导致程序抛出异常是从小到大(从子类异常到父类异常)
			 */
		}catch(Exception e){
			System.out.println("反正就是出了个错!");
		}
		
	}
}
