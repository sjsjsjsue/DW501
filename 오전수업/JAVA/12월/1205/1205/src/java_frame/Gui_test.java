package java_frame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui_test extends JFrame{
	public Gui_test() {
		setTitle("swing test");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Container c = getContentPane();
		// ContentPane : 컴포넌트를 넣어주기 위해 어디에 넣어줄 것인가 지정하기 위한 용도
		c.setLayout(new FlowLayout());
		// setLayout 을 통해 어디 위치인지 지정.
		// FlowLayout 은 기본 배치 방식
		
		JButton jb = new JButton("확인");
		JButton jb2 = new JButton("취소");
		
		c.add(jb);
		c.add(jb2);
		
		setVisible(true);
	}
}
