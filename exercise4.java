import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise4 extends JFrame  {
	 JLabel label;
	 String loveJava;
	 
	 public exercise4 () {
		 super("Left Ű�� ���ڿ� �̵�");  //JFrame �����ڸ� ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����
		 setLayout(new FlowLayout()); //����Ʈ�濡 FlowLayout ��ġ������ �ޱ�
		 loveJava = "Love Java";
		 label = new JLabel(loveJava);
		 label.setSize(80, 20);
		 label.addKeyListener(new KeyAdapter() {
			 public void keyPressed(KeyEvent e) {  
				 if(e.getKeyCode() == KeyEvent.VK_LEFT)  {
					 String moveString = loveJava.substring(1) + loveJava.substring(0, 1);
					 loveJava = new String(moveString);
					 label.setText(moveString);
					 }
				 }   
			 });
		 
		 add(label);  
		 setSize(400,200); //������ ũ��
		 setVisible(true); //������ ���
		 label.requestFocus(); //���̺� Ű �Է� ��Ŀ�� ����
	 }
	public static void main(String[] args) {
		new exercise4();
	}
}

