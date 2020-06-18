package dynamic_beat_4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {
	
	//더블버퍼링을 위해 전체화면에 대한 이미지를 담는 인스턴스
	private Image screenImage;
	private Graphics screenGraphic;
	
	//백그라운드 이미지를 담는 인스턴스
	//메인클래스의 위치를 기반으 인트로파일을 얻어온뒤 이미지 인스턴스를 초기화 해주겠다
	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	
	
	
	public DynamicBeat() {
		setUndecorated(true);//기본적으로 존재하는 메뉴바가 존재하지않게됨
		
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);			//창 고정
		setLocationRelativeTo(null);	//창 위치 정중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//창 종료시 프로그램종료
		setVisible(true);				//말그대로 보이게 설정
		setBackground(new Color(0,0,0,0));
		
		Music introMusic = new Music("introMusic.mp3", true);
		introMusic.start();
	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		paintComponents(g);	//메뉴바는 고정적(항상 고정)이기 때문에 paintComponents를 이용, 다른건 drawImage
		this.repaint();
	}
}
