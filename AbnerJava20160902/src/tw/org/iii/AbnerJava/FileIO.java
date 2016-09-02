package tw.org.iii.AbnerJava;

import java.io.File;
import java.io.IOException;


public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//----- 受到跳脫字元的影響  所以要使用  \\ 或者 / 來代表Windows 的 \ 
		File file1 = new File("C:\\test\\file1");
		if (file1.isFile()) {
			System.out.println("OK is File");
		} else {
			try {
				file1.createNewFile();
				System.out.println("Create Success");
			} catch (IOException er) {
				System.out.println("XX");
			}
		}
		
		
		
		File file2 = new File("c:/test/dir1/dir2/dir3/dir4/dir5");
		if (file2.isDirectory()) {
			System.out.println("已經存在");
		} else {
			//----mkdir 只能用在單一一個目錄     而mkdirs可創建多層目錄
			file2.mkdirs();
			System.out.println("創建目錄成功");
		}
		
		
		//-----得到這台電腦擁有root權限的地方
		File[] root = File.listRoots();
		for (File a : root) {
			System.out.println(a.getAbsolutePath());
		}
	}

}
