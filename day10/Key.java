package day10;
/**
 * HashMap�ڲ������鱣���ֵ�ԣ��洢Ԫ��ʱ����key��hashcode
 * ֵ������������������ֵ�Դ��룬��ȡʱҲ���ݸü�������ֱ���ҵ���Ԫ�أ�
 * ����HashMap���������ʽ�����˲���Ԫ��ʱ������ı���������
 * ���Բ���Ԫ�صĶ��ٶ�Ӱ���ѯ����
 * 
 * ����key��hashcode������ֵ����HashMap����������λ�ã���equals����������
 * key�Ƿ��ظ��������������Ҫ������д
 * 
 * hashcode��equals�����Ƕ�����Object�еģ�����Ҫ���Ƶ���д����������������
 * ���������Ҫ��дequals��hashcodeʱ������ѭ����ԭ��:
 * 1.�ɶ���д����������Ҫ��дһ�����equals����ʱ����Ӧ����ͬ��дhashcode����
 * 2.һ����:����������equals�Ƚ�Ϊtrueʱ��hashcodeֵӦ�����
 * 3.�ȶ���:������equals�Ƚϵ�����û�з����仯������£���ε���hashcode�������ص����ֲ�Ӧ���б仯
 * @author 86180
 *
 */
public class Key {
	private int x;
	private int y;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}
