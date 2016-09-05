package tw.org.iii.AbnerJava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditor extends JFrame{
	private JButton open,save,exit;
	private JTextArea editor;
	private File openFile;
	MyEditor() {
		super("My Editor");
		setLayout(new BorderLayout());
		
		
		
		//-----配置按鈕
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
		top.add(open);
		top.add(save);
		top.add(exit);
		add(top,BorderLayout.NORTH);
		
		//-----配置編輯區
		//-----使用JScrollPane來讓UI元件可以拉動
		editor = new JTextArea();
		JScrollPane jsp = new JScrollPane(editor);
		add(jsp, BorderLayout.CENTER);
		
		
		
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doOpen();
			}
		});
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				doSave();
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	private void doOpen() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION ) {
			openFile = jfc.getSelectedFile();
			System.out.println(openFile.getAbsolutePath());
			readFile();
		}
	}
	private void readFile() {
		if (openFile == null) return;
		//editor.setText("");
		try {
			FileReader reader = new FileReader(openFile);
			int c;
			while ( (c = reader.read()) != -1 ) {
				editor.append(""+(char)c);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void doSave() {
		if (openFile == null) return;
		try {
			FileWriter writer = new FileWriter(openFile);
			writer.write(editor.getText());
			writer.flush();
			writer.close();
			JOptionPane.showMessageDialog(null, "Save OK");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Save Fail");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyEditor();
	}

}
