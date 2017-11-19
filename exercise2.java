import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise2 extends JFrame{
	JPanel contentPane = new JPanel();
	public exercise2(){
		super("드래깅동안 YELLOW 유지"); //JFrame 생성자를 호출하여 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정

		setContentPane(contentPane);
		contentPane.setBackground(Color.GREEN); //배경색을 GREEN으로 설정
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {

	 public void mouseDragged(MouseEvent e) {
		   contentPane.setBackground(Color.YELLOW); //배경색을 YELLOW으로 설정
		   }

		public void mouseMoved(MouseEvent e) {
			contentPane.setBackground(Color.GREEN); 
		   }
		});
		setSize(300,150); //프레임 크기
		setVisible(true); //프레임 출력
	 }

	public static void main(String[] args) {
		 new exercise2();
	}
}

