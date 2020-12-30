package day02;

public class DemoReg02 {
	public static void main(String[] args) {
		//检索邮政编码(6位数)
		String reg="[0-9][0-9][0-9][0-9][0-9][0-9]";
		String reg2="\\d\\d\\d\\d\\d\\d";
		String reg3="\\d{6}";//表示6个\d
		String str="234568";
		//System.out.println(str.matches(reg));
		//System.out.println(str.matches(reg2));
		//System.out.println(str.matches(reg3));
		
		String regex1="[a-z]*";
		String regex2="\\w+\\.jar";
		String regex3="\\d?[a-z]*";
		//System.out.println("asdsad".matches(regex1));//true
		//System.out.println("".matches(regex1));//true
		//System.out.println("lang.jar".matches(regex2));//true
		//System.out.println(".jar".matches(regex2));//false
		//System.out.println("21sadas".matches(regex3));//false
		//System.out.println("dagssaf".matches(regex3));//true
		//System.out.println("2".matches(regex3));//true
		
		String regex4="\\w{5}";
		String regex5="\\d{5,}";
		String regex6="[a-zA-Z0-9]{4,10}";
		//System.out.println("sdajh".matches(regex4));//true
		//System.out.println("4526t".matches(regex5));//false
		//System.out.println("34asDsdj".matches(regex6));//true
		
	}
}
 