package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import day08.Point;

/**
 * �����Զ�������Ԫ�صļ���
 * @author 86180
 *
 */
public class Collections_sort2 {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<Point>();
		list.add(new Point(2,3));
		list.add(new Point(5,9));
		list.add(new Point(1,6));
		list.add(new Point(2,5));
		list.add(new Point(6,4));
		System.out.println(list);
		Collections.sort(list);
		System.out.println("�Զ��������:"+list);
	}
}
