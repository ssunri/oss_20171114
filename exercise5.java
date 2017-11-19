import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class exercise5 extends JFrame {
	public exercise5() { //생성자
		super("+,- 키로 폰트 크기 조절"); //JFrame 생성자를 호출하여 타이틀 달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우를 닫으면 프로그램을 종료하도록 설정
		Container c = getContentPane(); //프레임에 부착된 컨텐트팬을 알아낸다
		c.setLayout(new FlowLayout()); //컨텐트펜에 FlowLayout 배치관리자 달기
	
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.setFont(new Font("TimesRoman", Font.PLAIN, 10)); //10 픽셀 크기
		label.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == '+') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					la.setFont(new Font("TimesRoman", Font.PLAIN, size+5)); 					
				}
				else if(e.getKeyChar() == '-') {
					JLabel la = (JLabel)e.getSource();
					Font f = la.getFont();
					int size = f.getSize();
					if(size <= 5)
						return;
					la.setFont(new Font("TimesRoman", Font.PLAIN, size-5)); 					
				}				
			}
		});

		setSize(300,150); //프레임 크기
		setVisible(true); //프레임 출력
		
		label.setFocusable(true); //레이블이 포커스를 받을 수 있도록 지정
		label.requestFocus(); //레이블에 키 입력 포커스 서정
	}

	public static void main(String[] args) {
		new exercise5();
	}
}