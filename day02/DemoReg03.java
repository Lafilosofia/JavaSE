package day02;

public class DemoReg03 {
	public static void main(String[] args) {
		/*
		 * 匹配手机号
		 * 11位数字
		 * +86,+0086
		 * +86|+008615829216986
		 * (+86)?
		 * 分组()可以将一系列正则表达式看做一个整体
		 * 分组时可使用"|"表示"或"的关系
		 * . ?...  需要使用转义字符"\\"
		 * "^"和""$
		 * ^代表字符串开始
		 * $代表字符串结束
		 */
		/*String phoneReg="^(\\+86|\\+0086)?\\s*\\d{11}$";//注意特殊字符,需要进行转义
		String phone="+8615829216986";
		if(phone.matches(phoneReg)){
			System.out.println("手机号码通过");
		}else{
			System.out.println("请填写正确的手机号");
		}*/
		
		/*
		 * 匹配邮箱
		 * kun_262307846@qq.com
		 */
		String emailReg="^\\w{4,18}@[a-z0-9]+\\.[a-z]{2,3}$";
		String email="kun_262307846@qq.com";
		if(email.matches(emailReg)){
			System.out.println("邮箱通过");
		}else{
			System.out.println("请按照规范输入邮箱");
		}
		
		
	}
}
