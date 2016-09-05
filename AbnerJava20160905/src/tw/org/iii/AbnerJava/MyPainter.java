package tw.org.iii.AbnerJava;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyPainter extends JFrame {
	private Drawer drawer;
	public MyPainter() {
		super("MyPainter");
		Drawer drawer = new Drawer();
		add(drawer,BorderLayout.CENTER);
		
		setSize(1024,768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyPainter();
	}

}
