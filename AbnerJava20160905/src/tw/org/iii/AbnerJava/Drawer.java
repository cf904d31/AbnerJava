package tw.org.iii.AbnerJava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;


public class Drawer extends JPanel{
	//-----<泛型>  意即  指定型別給它  讓他在編譯時就可以檢查到，不用到RunTime時再檢查
	private LinkedList<LinkedList<HashMap<String,Integer>>> lines;
	public Drawer() {
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		
		//-----將定義的LinkedList  new出來使用
		lines = new LinkedList<>();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		//System.out.println("B");
		
		
		//-----使用Graphics2D 這是 Graphics 的第二代 功能較多
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		//g2d.drawLine(0, 0, 100, 100);
		
		for (LinkedList<HashMap<String,Integer>> line : lines) {
			for (int i=1 ; i<line.size() ; i++) {
				HashMap<String,Integer> p0 = line.get(i-1);
				HashMap<String,Integer> p1 = line.get(i);
				Integer p0x = p0.get("x");
				Integer p0y = p0.get("y");
				Integer p1x = p1.get("x");
				Integer p1y = p1.get("y");
				g2d.drawLine(p0x, p0y, p1x, p1y);
			}
		}
	}
	
	void clear() {
		lines.clear();
		repaint();
	}
	
	private class MyListener extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseDragged(e);
			int x = e.getX();
			int y = e.getY();
			//System.out.println("Dragged:(X=" + x + ",Y=" + y + ")");
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", x);
			point.put("y", y);
			lines.getLast().add(point);
			
			//-----呼叫repaint()讓他重畫repaint()是 繼承至父類別JPanel中的方法
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mousePressed(e);
			int x = e.getX();
			int y = e.getY();
			//System.out.println("Pressed:(X=" + x + ",Y=" + y + ")");
			
			LinkedList<HashMap<String,Integer>> line = new LinkedList<>();
			
			//-----new出一個HashMap將x及y的值放進去
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", x);
			point.put("y", y);
			//-----將HashMap的值放入LinkedList中
			line.add(point);
			//-----將一條一條的線段放入lines中
			lines.add(line);
		}
	}
}
