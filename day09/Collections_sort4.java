package day09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ʹ�ñȽ���(Comparator)����Point2���������Զ����������
 * @author HP
 *
 */
public class Collections_sort4 {
	public static void main(String[] args) {
		List<Point2> list = new ArrayList<Point2>();
		list.add(new Point2(2,7));
		list.add(new Point2(4,2));
		list.add(new Point2(3,9));
		list.add(new Point2(4,6));
		list.add(new Point2(1,5));
		System.out.println("ԭ����:" + list);
		Collections.sort(list, new Comparator<Point2>() {

			@Override
			public int compare(Point2 o1, Point2 o2) {
				int len1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
				int len2 = o2.getX() * o1.getX() + o2.getY() * o2.getY();
				return len1 - len2;
			}
		});
		System.out.println("�����Ľ��:" + list);
	}
}
