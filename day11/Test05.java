package day11;
/**
 * @FunctionalInterface
 * У��˽ӿ��Ƿ�����Lambda���ʽ:
 * ��JDK1.7�汾����,�Ƴ����ڽӿ�����Ҳ����д��ͨ����,����
 * һ��Ҫ�ڷ���ǰ�����"default"��"public static"
 * @author HP
 *
 */
@FunctionalInterface
public interface Test05 {
	/*void test();
	void test02();
	int test03();*/
	String test04(int age, String name);
	
	/*default int test05(){
		return 0;
	}
	
	public static int test06(){
		return 1;
	}*/
}
