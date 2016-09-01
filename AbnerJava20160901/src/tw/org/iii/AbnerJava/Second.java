package tw.org.iii.AbnerJava;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abner1 obj1 = new Abner1(1);
		obj1.m1();
		Abner2 obj2 = new Abner2();
		obj2.m1();
		obj2.m2();
	}
}

//------當沒有特別宣告建構式時，類別會以他的爸爸(即父類別)的無傳參數建構式為唯一建構式
//------而所有的物件的最源頭的父類別為Object()
class Abner1 {
	int a;
	Abner1(int a) {
		System.out.println("Abner1()");
	}
	void m1() {
		System.out.println("Abner1  : m1()");
	}
}

class Abner2 extends Abner1 {
	//----當父類別沒有無傳參數的建構式時，只好自己創一個自己的建構式
	//----但是這樣仍然會出現錯誤，因為類別中的建構式沒有寫任何東西的話
	//----還是會去找父類別的無傳參數建構式，因為Abner1()沒有無傳參數建構式
	//----所以還是會出現錯誤，此時只要在自己的建構式中，呼叫父類別的其他建構式即可
	Abner2() {
		super(1);
	}
	void m1() {
		super.m1();
		System.out.println("Abner2  : m1()" + a);
	}
	
	void m2() {
		System.out.println("Abner2  : m2()");
	}
	
}
