import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise1 extends JFrame{
	public exercise1() { //������
		super("���콺 �ø��� ������ ����"); //JFrame �����ڸ� ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����

		Container c = getContentPane(); //�����ӿ� ������ ����Ʈ���� �˾Ƴ���
		c.setLayout(new FlowLayout()); //����Ʈ�濡 FlowLayout ��ġ������ �ޱ�
		
		JLabel label = new JLabel("Love Java");
		c.add(label); 
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("�����");
			}			
		});

		setSize(250,150); //������ ũ��
		setVisible(true); //������ ���
	}

	public static void main(String[] args) {
		new exercise1();
	}

}
