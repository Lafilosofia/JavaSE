package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo7 {
	public static void main(String[] args) {
		List<Line> list = new ArrayList<Line>();
		list.add(new Line(2,4));
		list.add(new Line(1,6));
		list.add(new Line(4,5));
		list.add(new Line(3,1));
		System.out.println(list);
		
		Comparator<Line> c = (o1, o2)->{
			int a = o1.getX()*o1.getY();
			int b = o2.getX()*o2.getY();
			
			return a - b;
		};
		Collections.sort(list, c);
		System.out.println("比较后的结果:" + list);
		
		
	}
}
