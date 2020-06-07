package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {
	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);			//창 고정
		setLocationRelativeTo(null);	//창 위치 정중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//창 종료시 프로그램종료
		setVisible(true);				//말그대로 보이게 설정
	}
}
