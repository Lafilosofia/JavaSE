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
 * ʹ��dom4j����һ��XML�ĵ�
 * @author 86180
 *
 */
public class WriterXmlDemo {
	public static void main(String[] args) {
		List<Emp> list=new ArrayList<Emp>();
		list.add(new Emp(1,"С��",18,'Ů',12000.00));
		list.add(new Emp(2,"С��",19,'Ů',12001.00));
		list.add(new Emp(3,"С��",20,'Ů',12002.00));
		list.add(new Emp(4,"С��",21,'��',12003.00));
		list.add(new Emp(5,"С��",22,'��',12004.00));
		list.add(new Emp(6,"Сǿ",23,'��',12005.00));
		list.add(new Emp(7,"С��",24,'��',12006.00));
		
		/*
		 *����һ��XML�ĵ��Ĳ���"
		 *1.����Document����,��ʾһ���հ��ĵ�,
		 *  DocumentHelper���ṩ��һ����̬����createDocument()����һ��Documentʵ��
		 *
		 *2.��Document�����Ԫ��
		 *3.�����ǩ��������ӱ�ǩ�ﵽXML�ĵ�Ӧ�е���״�ӿ�
		 *4.����XMLWriter
		 *5.��Document����ͨ��XMLWriterд��������XML�ĵ�
		 */
		
		//1.����Document����
		Document doc=DocumentHelper.createDocument();
		/*
		 * Document�ṩ�����Ԫ�صķ���:
		 * Element  addElement(String name),���ָ�����ֵĸ�Ԫ��,����Element
		 * ʵ����ʽ���䷵��,�Ա��ڼ����Ը�Ԫ�ز���;
		 * ע��:�������ֻ�ܵ���һ��
		 */
		//2.��Document�����Ԫ��
		Element root=doc.addElement("list");
		
		//��ÿһ��Ա����Ϣ��һ��<emp>��ǩ��ӵ�<list>��ǩ��
		list.forEach((e)->{
			//3.
			//��<list>��ǩ����ӱ�ǩ<emp>
			Element empEle=root.addElement("emp");
			//��<emp>��ǩ����ӱ�ǩ<name>
			Element nameEle=empEle.addElement("name");
			//��<name>��ǩ����ı�
			//���Ա������
			nameEle.addText(e.getName());
			
			//�������
			Element ageEle=empEle.addElement("age");
			ageEle.addText(e.getAge()+"");
			
			//����Ա�
			Element genderEle=empEle.addElement("gender");
			genderEle.addText(e.getGender()+"");
			
			//���н��
			Element salary=empEle.addElement("salary");
			salary.addText(e.getSalary()+"");
			
			//��<emp>��ǩ�������id
			empEle.addAttribute("id", e.getId()+"");
			
		});
		
		//4.����XMLWriter
		try{
			//����XML��ʽ
			OutputFormat of=OutputFormat.createPrettyPrint();
			FileOutputStream out=new FileOutputStream("src/day12/myEmp.xml");
			XMLWriter w=new XMLWriter(out,of);
			/*
			 * XMLWriter�����ṩ��һ������write(Document doc)
			 */
			w.write(doc);
			System.out.println("д�����!");
			out.close();
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
