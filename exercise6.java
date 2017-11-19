import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise6 extends JFrame{
	private JLabel la = new JLabel("c");
	
	public exercise6() { //생성자
		super("클릭 연습 용 응용프로그램"); //JFrame 생성자를 호출하여 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		Container c = getContentPane(); //프레임에 부착된 컨텐트 팬을 알아낸다
		c.addMouseListener(new MyMouseAdapter()); //컨텐트 팬에 Mouse이벤트 리스너 달기
		
		c.setLayout(null); //레이블이 임의의 위치로 움직이게 하기 위해 배체관리자 삭제
		la.setSize(50,20); //레이블의 크기를 설정
		la.setLocation(100,100); //레이블 초기 위치 (100,100)으로 설정
		c.add(la); //레이블 컴포넌트 삽입
		
		setSize(300,300); //프레임 크기 설정
		setVisible(true); //프레임 출력
		
	}
	class MyMouseAdapter extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX(); //마우스 클릭 좌표 x
			int y = e.getY();  //마우스 클릭 좌표 y
			la.setLocation(x,y); //레이블의 위치를 (x,y)로 이동
		}
	}

	public static void main(String[] args) {
		new exercise6();
	}
}
