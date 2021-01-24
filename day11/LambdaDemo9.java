package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 使用Comparator接口实现排序
 * 使用Comparator接口实现对集合中的元素排序，详细要求如下：
 * 1） 使用ArrayList构建集合对象emps，要求该集合中存储Emp类型的数据。
 * 2） 分别构造name、age、gender以及salary为
 * （"Terry", 25,'m',6000）、
 * （"Allen", 21,'f',4000)、
 * （"Smith", 23,'m',3000）
 * 的三个Emp类的对象，并将这三个对象加入到集合emps中。
 * 3） 使用Collections类提供的sort方法，按照Emp对象的salary属性的值升序排列集合emps
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
		//forEach()输出
		emps.forEach((s) -> {System.out.println(s);});
		
	}
}
