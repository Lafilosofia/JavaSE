package day06;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ʹ��˯��������ʽʵ��ͼƬ�л�
 * @author HP
 *
 */
public class SleepBlockDemo2 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();//����
		frame.setSize(500,500);
		JPanel panel = new JPanel();//���
		panel.setSize(500,500);
		frame.setContentPane(panel);
		frame.setVisible(true);//�Ƿ�ɼ�
		frame.setLocationRelativeTo(null);//���ô��ھ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Thread t = new Thread(){
			int i = 0;
			public void run(){
				while(true){
					i = i == 0 ? 1:0;
					if(i == 0){
						//����ͼƬ��ɫΪGreen
						panel.setBackground(Color.GREEN);
					}
					if(i == 1){
						//����ͼƬ��ɫΪRed
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
