package tw.org.iii.AbnerJava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


//----------繼承 javax.swing  中的     JFrame類別
public class Third extends JFrame implements ActionListener {
	
	//------宣告JFrame擁有JButton這個類別的屬性
	//------基本上JFrame與JButton沒有任何關係
	private JButton open ,save ,exit;
	
	Third() {
		super("Abner APP");
		
		//----setLayout這個方法是在JFrame 中的一個方法
		//----而FlowLayout()是setLayout中的介面LayoutManager裡面的一個考過此證照的類別setDefaultCloseOperation
		setLayout(new FlowLayout());
		
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(open);
		add(save);
		add(exit);
		
		
		
		
		//------這是當三個按鈕擁有同一個的傾聽者時要如何判別------------------
		open.addActionListener(this);
		//------當同一個按鈕有三個人傾聽時會一起執行，但會從最後一個加上去的Listener
		open.addActionListener(new MyLinster());
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("mySelfOpen");
			}
		});
		save.addActionListener(this);
		exit.addActionListener(this);
		
		
		
		
		/*
		//------這是三個按鈕各有不同的傾聽者------------------
		//------為按鈕加上傾聽事件實作這個介面後必須考過這張證照
		//------因為自己已經考過這張證照所以呼叫自己即可
		open.addActionListener(this);
		//------也可以自行新增一個類別來考過此證照再呼叫他
		save.addActionListener(new MyLinster());
		//------直接在這裡實作這個介面
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		//------這是三個按鈕各有不同的傾聽者------------------
		*/
		
		
		
		//------底下這兩個是JFrame中父類別的父類別Window中的方法
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Third();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		/*
		//------這是三個按鈕各有不同的傾聽者------------------
		System.out.println("OK");
		//------這是三個按鈕各有不同的傾聽者------------------
		*/
		
		//------這是當三個按鈕擁有同一個的傾聽者時要如何判別------------------
		if (e.getSource() == open) {
			System.out.println("Open");
		} else if (e.getSource() == save) {
			System.out.println("Save");
		} else if (e.getSource() == exit) {
			System.out.println("Exit");
		}
		
	}

}

class MyLinster implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Save");
	}
	
}
