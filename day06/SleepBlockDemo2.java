package day06;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 使用睡眠阻塞方式实现图片切换
 * @author HP
 *
 */
public class SleepBlockDemo2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();//窗口
		frame.setSize(500,500);
		JPanel panel = new JPanel();//面板
		panel.setSize(500,500);
		frame.setContentPane(panel);
		frame.setVisible(true);//是否可见
		frame.setLocationRelativeTo(null);//设置窗口居中
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread t = new Thread(){
			int i = 0;
			public void run(){
				while(true){
					i = i == 0 ? 1:0;
					if(i == 0){
						//设置图片颜色为Green
						panel.setBackground(Color.GREEN);
					}
					if(i == 1){
						//设置图片颜色为Red
						panel.setBackground(Color.RED);
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}
}
