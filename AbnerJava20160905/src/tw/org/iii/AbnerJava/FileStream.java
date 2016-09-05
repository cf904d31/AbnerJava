package tw.org.iii.AbnerJava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----串接功能的介紹  
		//-----一個串一個
		try {
			FileInputStream fis = new FileInputStream("dir1/Abner.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while ( (line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//-----讀入一個execel的csv檔
		try {
			FileInputStream fis = new FileInputStream("dir1/Book1.csv");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line;
			//-----利用split來分割處理顯示出來的檔案
			while ( (line = br.readLine()) != null) {
				String []row = line.split(",");
				System.out.print("Name:" + row[0] + "\t Tel:" + row[1] + "\t Add:" + row[2]);
				System.out.println();
				System.out.println(line);
			}
			
			//-----三個開檔要關哪一個皆可
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
