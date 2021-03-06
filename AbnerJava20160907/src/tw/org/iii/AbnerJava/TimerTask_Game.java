package tw.org.iii.AbnerJava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TimerTask_Game extends JFrame {
	private MyGame gameView;
	private int viewW, viewH;
	public TimerTask_Game() {
		super("MyGame");
		setLayout(new BorderLayout());
		
		gameView = new MyGame();
		add(gameView,BorderLayout.CENTER);
		
		setSize(768,640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MyGame extends JPanel {
		private Timer time;
		private Ball myBall;
		private LinkedList<Ball> balls;
		
		MyGame () {
			time = new Timer();
			time.schedule(new ViewTask(), 0 , 50);
			balls = new LinkedList<>();
			Color [] colors = {Color.black,Color.blue,Color.cyan,Color.darkGray,Color.gray,Color.green
					,Color.orange,Color.pink,Color.yellow};
			addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					balls.add(new Ball(e.getX(),e.getY(),40,40,4,4,colors[(int)(Math.random()*9)]));
				}
				
			});
			
		}
		
		private class ViewTask extends TimerTask {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				repaint();
			}
			
		}
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			viewW = getWidth(); viewH = getHeight();
			for (Ball myBall : balls) {
				g2d.setColor(myBall.color);
				g2d.fillOval(myBall.x, myBall.y, myBall.w, myBall.h);
			}
			
			
		}
		
		private class Ball {
			private int x, y, w, h, dx, dy;
			private Color color;
			private Timer timer;
			Ball(int x, int y, int w, int h, int dx, int dy, Color color) {
				this.x = x;
				this.y = y;
				this.w = w;
				this.h = h;
				this.dx = dx;
				this.dy = dy;
				this.color = color;
				timer = new Timer();
				timer.schedule(new BallTask(), 0, 100);
			}
			private class BallTask extends TimerTask {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					x += dx;
					y += dy;
					if (x<0 || x+w > viewW){
						dx *= -1;
					}
					if (y<0 || y+h > viewH){
						dy *= -1;
					}
					x += dx; y += dy;
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerTask_Game();
	}

}
