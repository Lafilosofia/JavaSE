package day05;

import java.awt.AWTException;
import java.io.IOException;

/**
 * ������д���ຬ��throws�����쳣�׳����ķ�����throws����дԭ��
 * @author 86180
 *
 */
public class DemoException04 {
	public void dosome() throws IOException,AWTException{
		
	}
}

class Son extends DemoException04{
	//���Բ����׳��κ��쳣
	//public void dosome(){
	//
	//}
	
	//���Խ��׳������쳣
	//public void dosome() throws IOException{
	//	
	//}
	
	//�����׳����෽���а����쳣���������쳣
	//public void dosome() throws FileNotException{
	//	
	//}
	
	//�������׳������쳣
	//public void dosome() throws SQLeXCEPTION{
	//
	//}
	
	//�������׳����෽���׳��쳣�ĸ������쳣
	//public void dosome() throws Exception{
	//
	//}
}

