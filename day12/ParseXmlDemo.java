package day12;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 使用DOM4J解析XML
 * 
 * 将emp.xml文件中的所有员工信息解析出来存入集合中
 * @author 86180
 *
 */
public class ParseXmlDemo {
	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		/*
		 * 解析流程:
		 * 1:创建SAXReader
		 * 2.使用SAXReader读取xml文档并生成Document对象,
		 * 这一步就是DOM解析耗时资源的地方,因为会将当前XML
		 * 文档解析为一颗"树"状结构并存入Document对象,那么内容越多
		 * 内存消耗越多,并且要求读取完整XML文档,所以相对耗时.
		 * 3.通过Document对象获取根元素(根标签)
		 * 4.通过根元素开始逐级获取子元素,达到遍历XML文档数据的目的
		 */
		
		//1.
		SAXReader reader=new SAXReader();
		
		//2.SAXReader提供了read()方法来读取xml文档返回一个Document实例
		try {
			File file=new File("src/day12/emp.xml");
			Document doc=reader.read(file);
			
		/*
		 * 3.Document提供获取根元素的方法:
		 *  getRootElement()返回一个Element.
		 *  
		 *  Element的每一个实例用于表示XML文档中的一个元素(标签),
		 *  通过Element可以获取其表示的元素相关信息
		 *  
		 *  Element element(String name)获取当前标签中指定名字的子标签
		 *  
		 *  List elements()获取当前标签中的所有子标签
		 *  
		 *  List elements(String name)获取当前标签中所有指定名字的子标签
		 *  
		 *  String getName()获取当前元素的名字
		 *  
		 *  String getText()获取当前元素中的文本(标签中间的文本)
		 *  
		 */
			//获取根标签
			Element root=doc.getRootElement();
			
			//获取根标签下所有子标签
			List<Element> element=root.elements();
			//System.out.println("子标签长度:"+element.size());
			
			//遍历集合,通过每个子元素<emp>标签获取对应的员工信息
			for(Element e:element){
				//获取员工的名字,提前是要获取<name>标签
				Element nameEle=e.element("name");
				//获取<name>标签中的文本
				String name=nameEle.getText();
				
				//获取员工的年龄
				Element ageEle=e.element("age");
				int age=Integer.parseInt(ageEle.getText());
				//System.out.println(name+","+age);
				
				/*
				 * elementText(String name)直接获取标签中的文本
				 */
				
				//获取员工的性别
				String str=e.elementText("gender");
				char gender=str.charAt(0);
				//System.out.println(gender);
				
				//获取员工的薪资
				double salary=Double.parseDouble(e.elementText("salary"));
				//System.out.println(salary);
				
				/*
				 * 获取id
				 * Attribute attribute(String id)
				 * Attribute提供了一个获取id的方法,getValue()返回字符串
				 */
				Attribute attr=e.attribute("id");
				int id=Integer.parseInt(attr.getValue());
				//System.out.println(id);
				
				//解析后的属性存储到Emp中
				Emp emp=new Emp(id, name, age, gender, salary);
				
				list.add(emp);
			}
			System.out.println("解析完毕!");
			list.forEach((s)->System.out.println(s));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
