package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ʹ��Comparator�ӿ�ʵ������
 * ʹ��Comparator�ӿ�ʵ�ֶԼ����е�Ԫ��������ϸҪ�����£�
 * 1�� ʹ��ArrayList�������϶���emps��Ҫ��ü����д洢Emp���͵����ݡ�
 * 2�� �ֱ���name��age��gender�Լ�salaryΪ
 * ��"Terry", 25,'m',6000����
 * ��"Allen", 21,'f',4000)��
 * ��"Smith", 23,'m',3000��
 * ������Emp��Ķ��󣬲���������������뵽����emps�С�
 * 3�� ʹ��Collections���ṩ��sort����������Emp�����salary���Ե�ֵ�������м���emps
 * 
 * @author Lenovo
 *
 */
public class LambdaDemo9 {
	public static void main(String[] args) {
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(new Emp("Terrt", 25, 'm', 6000));
		emps.add(new Emp("Allen", 21, 'f', 4000));
		emps.add(new Emp("Smith", 23, 'm', 3000));
		
		Comparator<Emp> c = (e1, e2) -> {
			int a = e1.getSalary();
			int b = e2.getSalary();
			return a - b;
		};
		Collections.sort(emps, c);
		//forEach()���
		emps.forEach((s) -> {System.out.println(s);});
		
	}
}
