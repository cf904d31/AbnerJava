package tw.org.iii.AbnerJava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class Drawer extends JPanel{
	public Drawer() {
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		System.out.println("B");
		
		
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(0, 0, 100, 100);
	}
	
	private class MyListener extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent arg0) {
			// TODO Auto-generated method stub
			super.mouseDragged(arg0);
			int x = arg0.getX();
			int y = arg0.getY();
			System.out.println("Dragged:(X=" + x + ",Y=" + y + ")");
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			super.mousePressed(arg0);
			int x = arg0.getX();
			int y = arg0.getY();
			System.out.println("Pressed:(X=" + x + ",Y=" + y + ")");
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			super.mouseReleased(arg0);
			int x = arg0.getX();
			int y = arg0.getY();
			System.out.println("Released:(X=" + x + ",Y=" + y + ")");
		}
		
	}
}
