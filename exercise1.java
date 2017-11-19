import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise1 extends JFrame{
	public exercise1() { //생성자
		super("마우스 올리기 내리기 연습"); //JFrame 생성자를 호출하여 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정

		Container c = getContentPane(); //프레임에 부착된 컨텐트팬을 알아낸다
		c.setLayout(new FlowLayout()); //컨텐트펜에 FlowLayout 배치관리자 달기
		
		JLabel label = new JLabel("Love Java");
		c.add(label); 
		
		label.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("Love Java");
			}
			public void mouseExited(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				la.setText("사랑해");
			}			
		});

		setSize(250,150); //프레임 크기
		setVisible(true); //프레임 출력
	}

	public static void main(String[] args) {
		new exercise1();
	}

}
