package tw.org.iii.AbnerJava;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First12 obj1 = new First12();
		First123 obj2 = new First123();
		
		First1234 obj3 = new First1234();
		obj3.m3(obj1);
		obj3.m3(obj2);
	}

}

//------interface(介面)的介紹
//------在interface裡的方法不能有實作

interface First1 {
	void m1();
	void m2();
}

class First12 implements First1{
	
	//-----因為interface裡面的方法是要給大家實作用的
	//-----所以要實作他必須要加上public
	public void m1() {
		System.out.println("First12 m1()");
	}
	public void m2() {
		System.out.println("First12 m2()");
	}
}

class First123 implements First1{
	
	//-----因為interface裡面的方法是要給大家實作用的
	//-----所以要實作他必須要加上public
	public void m1() {
		System.out.println("First123 m1()");
	}
	public void m2() {
		System.out.println("First123 m2()");
	}
}

class First1234 {
	void m3(First1 b) {
		b.m1();
	}
}
