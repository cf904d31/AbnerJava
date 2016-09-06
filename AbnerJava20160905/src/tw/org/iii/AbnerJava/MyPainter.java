package tw.org.iii.AbnerJava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyPainter extends JFrame {
	private Drawer drawer;
	private JButton clear,undo,redo;
	
	public MyPainter() {
		super("My Painter");
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(clear);top.add(undo);top.add(redo);
		add(top, BorderLayout.NORTH);
		
		drawer = new Drawer();
		add(drawer, BorderLayout.CENTER);
		
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearDrawer();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				undoDrawer();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				redoDrawer();
			}
		});
	}
	
	private void clearDrawer() {
		drawer.clear();
	}
	private void undoDrawer(){
		//drawer.undo();
	}
	private void redoDrawer(){
		//drawer.redo();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyPainter();
	}

}
