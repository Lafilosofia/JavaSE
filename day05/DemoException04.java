package day05;

import java.awt.AWTException;
import java.io.IOException;

/**
 * 子类重写父类含有throws声明异常抛出出的方法对throws的重写原则
 * @author 86180
 *
 */
public class DemoException04 {
	public void dosome() throws IOException,AWTException{
		
	}
}

class Son extends DemoException04{
	//可以不再抛出任何异常
	//public void dosome(){
	//
	//}
	
	//可以仅抛出部分异常
	//public void dosome() throws IOException{
	//	
	//}
	
	//可以抛出父类方法中熬出异常的子类型异常
	//public void dosome() throws FileNotException{
	//	
	//}
	
	//不允许抛出额外异常
	//public void dosome() throws SQLeXCEPTION{
	//
	//}
	
	//不可以抛出父类方法抛出异常的父类型异常
	//public void dosome() throws Exception{
	//
	//}
}

