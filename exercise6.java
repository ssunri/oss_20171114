import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise6 extends JFrame{
	private JLabel la = new JLabel("c");
	
	public exercise6() { //������
		super("Ŭ�� ���� �� �������α׷�"); //JFrame �����ڸ� ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����
		Container c = getContentPane(); //�����ӿ� ������ ����Ʈ ���� �˾Ƴ���
		c.addMouseListener(new MyMouseAdapter()); //����Ʈ �ҿ� Mouse�̺�Ʈ ������ �ޱ�
		
		c.setLayout(null); //���̺��� ������ ��ġ�� �����̰� �ϱ� ���� ��ü������ ����
		la.setSize(50,20); //���̺��� ũ�⸦ ����
		la.setLocation(100,100); //���̺� �ʱ� ��ġ (100,100)���� ����
		c.add(la); //���̺� ������Ʈ ����
		
		setSize(300,300); //������ ũ�� ����
		setVisible(true); //������ ���
		
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); //���콺 Ŭ�� ��ǥ x
			int y = e.getY();  //���콺 Ŭ�� ��ǥ y
			la.setLocation(x,y); //���̺��� ��ġ�� (x,y)�� �̵�
		}
	}

	public static void main(String[] args) {
		new exercise6();
	}
}
