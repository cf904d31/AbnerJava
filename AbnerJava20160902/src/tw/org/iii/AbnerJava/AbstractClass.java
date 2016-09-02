package tw.org.iii.AbnerJava;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass1 obj1 = new AbstractClass1();
		//-----抽象類別無法被new出來，因為其肚子中有一個未定義的方法
		//AbstractClass2 obj2 = new AbstractClass2();
		AbstractClass3 obj3 = new AbstractClass3();
	}

}

class AbstractClass1 {
	void m1() {
		
	}
	void m2() {
		
	}
}

abstract class AbstractClass2 {
	AbstractClass2() {
		System.out.println("AbstractClass2 的建構式");
	}
	void m1() {
		
	}
	//-----在類別裡面定義抽象方法，其方法不有有任何定義
	//-----而在有抽象方法裡的別，也必須是抽象類別
	abstract void m2();
}


//------當要繼承一個抽象類別時，必須將之其抽象方法實作出來
class AbstractClass3 extends AbstractClass2 {
	void m2() {
		System.out.println("AbstractClass3 m2()");
	}
}


class AbstractClass4 extends AbstractClass2 {
	void m2() {
		System.out.println("AbstractClass4 m2()");
	}
}
