package tw.org.iii.AbnerJava;

import javax.swing.JButton;
import javax.swing.JFrame;


//----------繼承 javax.swing  中的     JFrame類別
public class Third extends JFrame {
	
	//------宣告JFrame擁有JButton這個類別的屬性
	//------基本上JFrame與JButton沒有任何關係
	private JButton open ,save ,exit;
	
	Third() {
		super("Abner APP");
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Third();
	}

}
