package tw.org.iii.AbnerJava;

import java.io.File;

public class FileInput_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("./dir1/Abner.txt");
		System.out.println(file1.getAbsolutePath());
		if (file1.exists()) {
			System.out.println("檔案存在");
		}
	}

}
