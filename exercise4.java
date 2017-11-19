import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise4 extends JFrame  {
	 JLabel label;
	 String loveJava;
	 
	 public exercise4 () {
		 super("Left 키로 문자열 이동");  //JFrame 생성자를 호출하여 타이틀 달기
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		 setLayout(new FlowLayout()); //컨텐트펜에 FlowLayout 배치관리자 달기
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
		 setSize(400,200); //프레임 크기
		 setVisible(true); //프레임 출력
		 label.requestFocus(); //레이블에 키 입력 포커스 서정
	 }
	public static void main(String[] args) {
		new exercise4();
	}
}

