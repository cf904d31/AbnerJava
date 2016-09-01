package tw.org.iii.AbnerJava;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abner1 obj1 = new Abner1();
		obj1.m1();
		Abner2 obj2 = new Abner2();
		obj2.m1();
		obj2.m2();
	}
}

class Abner1 {
	void m1() {
		System.out.println("Abner1  : m1()");
	}
}

class Abner2 extends Abner1 {
	void m1() {
		super.m1();
		System.out.println("Abner2  : m1()");
	}
	
	void m2() {
		System.out.println("Abner2  : m2()");
	}
	
}
