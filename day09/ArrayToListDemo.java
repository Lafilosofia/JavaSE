package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת��Ϊ����
 * ͨ�����ϵĹ�����arrays�ľ�̬����alList���Խ�����ת��ΪList����
 * @author 86180
 *
 */
public class ArrayToListDemo {
	public static void main(String[] args) {
		String[] array = new String[]{"one","two","three","four"};
		//����ת��Ϊ����
		List<String> list = Arrays.asList(array);
		
		list.set(0, "1");
		System.out.println(list);
		//�Լ���Ԫ�صĲ������Ƕ�ԭ����Ԫ�صĲ���
		System.out.println("ԭ����:" + Arrays.toString(array));
		/*
		 * �������Ԫ�ػᵼ���������ݣ��ǾͲ��ܱ�ʾԭ����
		 */
		//list.add("five");  ���쳣
		//list.remove("1");
		
		//���ϸ���
		List<String> list2=new ArrayList<String>(list);
		list2.add("five");
		System.out.println("list2����:"+list2);
	}

}
