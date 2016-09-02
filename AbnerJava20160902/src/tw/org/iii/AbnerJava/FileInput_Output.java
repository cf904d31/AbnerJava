package tw.org.iii.AbnerJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

public class FileInput_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("./dir1/Abner.txt");
		System.out.println(file1.getAbsolutePath());
		if (file1.exists()) {
			System.out.println("檔案存在");
		}
		
		
		//----讀取檔案-----
		
		try {
			FileInputStream fis = new FileInputStream(file1);
			int c;
			
			//-----------讀取檔案方法1-----------
			//-----一個一個字元的讀取檔案
			//while ( (c=fis.read()) != -1 ) {
			//	System.out.print((char)c);
			//}
			
			
			//-----------讀取檔案方法2-----------
			//-----因為讀取不到中文字碼所以
			//byte []buf = new byte[3];
			//while ( (c = fis.read(buf)) != -1 ) {
			//	System.out.print(new String(buf,0,c));
			//}
			
			
			//-----------讀取檔案方法3-----------
			long len = file1.length();
			byte []buf = new byte[(int)len];
			c = fis.read(buf);
			//System.out.println(c);
			System.out.print(new String(buf));
			
			
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
