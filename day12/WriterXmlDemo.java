package day12;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * 使用dom4j生成一个XML文档
 * @author 86180
 *
 */
public class WriterXmlDemo {
	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1,"小闫",18,'女',12000.00));
		list.add(new Emp(2,"小丁",19,'女',12001.00));
		list.add(new Emp(3,"小张",20,'女',12002.00));
		list.add(new Emp(4,"小轲",21,'男',12003.00));
		list.add(new Emp(5,"小云",22,'男',12004.00));
		list.add(new Emp(6,"小强",23,'男',12005.00));
		list.add(new Emp(7,"小哲",24,'男',12006.00));
		
		/*
		 *生成一个XML文档的步骤"
		 *1.创建Document对象,表示一个空白文档,
		 *  DocumentHelper类提供了一个静态方法createDocument()返回一个Document实例
		 *
		 *2.向Document中添加元素
		 *3.向根标签中逐级添加子标签达到XML文档应有的树状接口
		 *4.创建XMLWriter
		 *5.将Document对象通过XMLWriter写出并生成XML文档
		 */
		
		//1.创建Document对象
		Document doc=DocumentHelper.createDocument();
		/*
		 * Document提供了添加元素的方法:
		 * Element  addElement(String name),添加指定名字的根元素,并以Element
		 * 实例形式将其返回,以便于继续对该元素操作;
		 * 注意:这个方法只能调用一次
		 */
		//2.向Document中添加元素
		Element root=doc.addElement("list");
		
		//将每一个员工信息以一个<emp>标签添加到<list>标签中
		list.forEach((e)->{
			//3.
			//向<list>标签添加子标签<emp>
			Element empEle=root.addElement("emp");
			//向<emp>标签添加子标签<name>
			Element nameEle=empEle.addElement("name");
			//向<name>标签添加文本
			//添加员工姓名
			nameEle.addText(e.getName());
			
			//添加年龄
			Element ageEle=empEle.addElement("age");
			ageEle.addText(e.getAge()+"");
			
			//添加性别
			Element genderEle=empEle.addElement("gender");
			genderEle.addText(e.getGender()+"");
			
			//添加薪资
			Element salary=empEle.addElement("salary");
			salary.addText(e.getSalary()+"");
			
			//给<emp>标签添加属性id
			empEle.addAttribute("id", e.getId()+"");
			
		});
		
		//4.创建XMLWriter
		try{
			//美化XML格式
			OutputFormat of=OutputFormat.createPrettyPrint();
			FileOutputStream out=new FileOutputStream("src/day12/myEmp.xml");
			XMLWriter w=new XMLWriter(out,of);
			/*
			 * XMLWriter类中提供了一个方法write(Document doc)
			 */
			w.write(doc);
			System.out.println("写入完毕!");
			out.close();
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
