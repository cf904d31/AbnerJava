package tw.org.iii.AbnerJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//-----物件序列化---------
public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Abner" , 80 , 50 , 40);
		System.out.println(s1.getTotal());
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream oobj = new ObjectOutputStream(new FileOutputStream("dir1/s.dat"));
			oobj.writeObject(s1);
			oobj.flush();
			oobj.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


//------任何一個物件要序列化 ， 必須要宣告實作此介面Interface Serializable 
//------因為介面中沒有任何方法需要實作，所以只須宣告即可
class Student implements Serializable {
	private int ch ,eng ,math;
	//-----若序列化的物件內有物件宣告的變數(例如:String)，則該物件也必須實作序列化
	String name;
	Student(String name ,int ch, int eng, int math ) {
		this.name = name;
		this.ch = ch;
		this.eng = eng;
		this.math = math;
	}
	int getTotal() {
		return ch+eng+math;
	}
	double getAvg() {
		return getTotal()/3.0;
	}
}
