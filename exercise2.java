import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise2 extends JFrame{
	JPanel contentPane = new JPanel();
	public exercise2(){
		super("�巡�뵿�� YELLOW ����"); //JFrame �����ڸ� ȣ���Ͽ� Ÿ��Ʋ �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ �����츦 ������ ���α׷��� �����ϵ��� ����

		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN); //������ GREEN���� ����
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {

	 public void mouseDragged(MouseEvent e) {
		   contentPane.setBackground(Color.YELLOW); //������ YELLOW���� ����
		   }

		public void mouseMoved(MouseEvent e) {
			contentPane.setBackground(Color.GREEN); 
		   }
		});
		setSize(300,150); //������ ũ��
		setVisible(true); //������ ���
	 }

	public static void main(String[] args) {
		 new exercise2();
	}
}

