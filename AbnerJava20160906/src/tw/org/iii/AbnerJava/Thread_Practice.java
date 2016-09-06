package tw.org.iii.AbnerJava;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Thread_Practice extends JFrame {
	private JButton go;
	private JLabel[] lanes;
	private int rank;
	private MyClock clock;
	
	public Thread_Practice() {
		super("Racing");
		setLayout(new GridLayout(10, 1));
		
		go = new JButton("Go");
		add(go);
		
		clock = new MyClock();
		add(clock);
		
		lanes = new JLabel[8];
		for (int i=0 ; i<lanes.length ; i++) {
			lanes[i] = new JLabel((i+1)+".");
			add(lanes[i]);
		}
		
		go.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				go();
			}
		});
		
		setSize(1024,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	private void go() {
		rank = 0;
		Car[] cars = new Car[8];
		for (int i=0 ; i<cars.length ; i++) {
			cars[i] = new Car(i);
		}
		for (int i=0 ; i<cars.length ; i++) {
			cars[i].start();
		}
	}
	
	private class Car extends Thread {
		private int num;
		Car (int num) {
			this.num = num;
		}
		@Override
		public void run() {
			for (int i=0 ; i<120 ; i++) {
				lanes[num].setText(lanes[num].getText()+">");
				if (i==119) {
					lanes[num].setText(lanes[num].getText()+ ++rank);
				}
				try {
					Thread.sleep((int)(Math.random()*200));
				} catch (InterruptedException e) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread_Practice();
	}

}
