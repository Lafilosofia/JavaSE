package day10;

import java.util.HashMap;
import java.util.Map;

/**
 * ��map�������Ԫ��
 * @author 86180
 * Map��Ϊ���ұ������ݽṹ������������һ��"��������"�ı��
 * ���г�Ϊkey�����г�Ϊvalue��
 * Map���Ǹ���key���Ҷ�Ӧ��value
 * �洢Ԫ��ҲҪ����key-value�ɶԴ���
 * 
 * ���õ�ʵ����:java.util.HashMapɢ�б���ϣ��HashMapʱ����ɢ���㷨ʵ�ֵ�Map
 * �����������Ĳ�ѯ�ṹ
 */
public class MapDemo {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		/*
		 * V put(Key key,Value v)
		 * ��������key-value��ֵ�Դ��뵽Mao�У�Map��һ��Ҫ��
		 * key�������ظ�(key��equals�ȽϾ���)����ʹ��Mao���е�key����value��
		 * �����滻value
		 */
		Integer sorce2 = map.put("����", 99);
		System.out.println(sorce2);
		
		map.put("����", 80);
		map.put("��ѧ", 99);
		map.put("Ӣ��", 60);
		map.put("��ѧ", 90);
		System.out.println(map);
		
		//map���ϵĳ��� size()
		int size = map.size();
		//System.out.println(size);
		
		/*
		 * V get(Key key)
		 * ���ݸ�����key��ȡ��Ӧ��value,��������key������,�򷵻�Ϊnull;
		 */
		//�鿴��ѧ�ĳɼ�
		Integer n = map.get("��ѧ��");
		//System.out.println(n);
		
		/*Scanner scanner=new Scanner(System.in);
		while(true){
			System.out.println("��������Ҫ��ѯ�Ŀ�Ŀ:");
			String str=scanner.next();
			Integer m=map.get(str);
			if(m==null){
				System.out.println("û�д˿�Ŀ,��������д��Ŀ!");
				continue;
			}
			System.out.println(str+":"+m+"��");
		}*/
		
		/*
		 * V remove(Key key)
		 * ɾ����ǰMap�и�����key����Ӧ�������ֵ��,����ֵΪ��key��
		 * ��Ӧ��value,���������Ǹ�key��Map�в�����,�򷵻�null;
		 */
		Integer mm = map.remove("Ӣ��");
		System.out.println("��ɾ����value:"+mm);
		System.out.println(map.size()+","+map);
		
		/*
		 * �жϵ�ǰMap�Ƿ����������key��value
		 */
		boolean bk = map.containsKey("����");
		System.out.println(bk);
		
		boolean bv = map.containsValue(99);
		System.out.println(bv);
		
		//��ռ���
		map.clear();
		System.out.println(map.size()+","+map);
		
		//�жϼ����Ƿ�Ϊ��
		System.out.println(map.isEmpty());
	}
}
