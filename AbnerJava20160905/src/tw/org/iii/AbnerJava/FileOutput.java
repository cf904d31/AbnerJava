package tw.org.iii.AbnerJava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//-----若沒加上 true，則檔案會被覆寫
			FileOutputStream fout = new FileOutputStream("./dir1/test.txt" , true);
			fout.write("Hello World123456".getBytes());
			fout.flush();
			fout.close();
			System.out.println("Write OK");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
