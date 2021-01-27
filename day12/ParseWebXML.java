package day12;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * ʹ��DOM4J����XML
 * 
 * ��emp.xml�ļ��е�����Ա����Ϣ�����������뼯����
 * @author Lenovo
 *
 */
public class ParseWebXML {
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		/*
		 * ��������:
		 * 1.����SAXReader
		 * 2.ʹ��SAXReader��ȡxml�ĵ�������Document����
		 * ��һ������DOM������ʱ��Դ�ĵط�,��Ϊ�Ὣ��ǰXML
		 * �ĵ�����Ϊһ��"��"״�ṹ������Document����,��ô����Խ��
		 * �ڴ�����Խ��,����Ҫ���ȡ����XML�ĵ�,������Ժ�ʱ
		 * 3.ͨ��Document�����ȡ��Ԫ��(����ǩ)
		 * 4.ͨ����Ԫ�ؿ�ʼ�𼶻�ȡ��Ԫ��,�ﵽ����XML�ĵ����ݵ�Ŀ��
		 */
		
		//1.
		SAXReader reader = new SAXReader();
		
		//2.SAXReader�ṩ��read()��������ȡxml�ĵ�����һ��Documentʵ��
		try {
			File file = new File("src/day12/emp.xml");
			Document doc = reader.read(file);
			
			/*
			 * 3.Document�ṩ�˻�ȡ��Ԫ�صķ���
			 * getRootElement()����һ��Elementʵ��,
			 * 
			 * Element��ÿһ��ʵ�����ڱ�ʾXML�ĵ��е�һ��Ԫ��(��ǩ),
			 * ͨ��Element���Ի�ȡ���ʾ��Ԫ�������Ϣ
			 * 
			 * Element element(String name)��ȡ��ǰ��ǩ��ָ�����ֵ��ӱ�ǩ
			 * 
			 * List elements()��ȡ��ǰ��ǩ�е������ӱ�ǩ
			 * 
			 * List elements(String name)��ȡ��ǰ��ǩ������ָ�����ֵ��ӱ�ǩ
			 * 
			 * String getName()��ȡ��ǰԪ�ص�����
			 * 
			 * String getText()��ȡ��ǰԪ���е��ı�(��ǩ�м���ı�)
			 */
			//��ȡ����ǩ
			Element root = doc.getRootElement();
			
			/*Element e=root.element("emp");
			System.out.println(e);*/
			
			//��ȡ����ǩ�������ӱ�ǩ
			List<Element> element = root.elements();
			//System.out.println("�ӱ�ǩ����:"+element.size());
			
			//��������ͨ��ÿ����Ԫ��<emp>��ǩ��ȡ��Ӧ��Ա����Ϣ
			//for(Element e:element){
			element.forEach((e)->{
				//System.out.println(e.getName());
				
				//��ȡԱ��������,ǰ����Ҫ��ȡ<name>��ǩ
				Element nameEle = e.element("name");
				//��ȡ<name>��ǩ�е��ı�
				String name = nameEle.getText();
				
				//��ȡԱ������
				Element ageEle = e.element("age");
				int age = Integer.parseInt(ageEle.getText());
				
				/*
				 * elementText(String name)ֱ�ӻ�ȡ��ǩ�е��ı�
				 */
				//��ȡԱ���Ա�
				String str = e.elementText("gender");
				char gender = str.charAt(0);
				//��ȡԱ����н��
				double salary = Double.parseDouble(e.elementText("salary"));
				//System.out.println(name+","+age+","+gender+","+salary);
				
				/*
				 * ��ȡid
				 * Attribute attribute(String id)
				 * Attribute�ṩ��һ����ȡid�ķ���,getValue()�����ַ���
				 */
				Attribute attr = e.attribute("id");
				int id = Integer.parseInt(attr.getValue());
				//System.out.println(id);
				
				//����������Դ洢��Emp��
				Emp emp = new Emp(id, name, age, gender, salary);
				list.add(emp);
			});	
			//}
			System.out.println("�������!");
			list.forEach((s) -> System.out.println(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
