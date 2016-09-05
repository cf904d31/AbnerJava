package tw.org.iii.AbnerJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.Object;

public class Object_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dir1/s.dat"));
			Object obj = ois.readObject();
			Student s1 = (Student)obj;
			ois.close();
			System.out.println(s1.getTotal());
			System.out.println(s1.getAvg());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
