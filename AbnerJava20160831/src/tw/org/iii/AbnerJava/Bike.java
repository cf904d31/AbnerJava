package tw.org.iii.AbnerJava;

public class Bike {
	private double speed;
	private int color;
	
	//-----建構式(不能有傳回值所以不能加上void若加上去，會變成一般的方法)------------
	//-----通常建構式用於初始化這個類別------------
	//-----建構式也可同名只要參數跟型別不同
	Bike() {
		System.out.println("Bike()");
		color = 2;
	}
	Bike(int c) {
		System.out.println("Bike(int)");
		color = c;
	}
	
	void upSpeed() {
		speed = (speed<1?speed=1:speed*1.2);
	}
	//-----同名的方法只要參數跟型別不同亦可使用
	void upSpeed(int gear) {
		speed = (speed<1?speed=1:speed*(gear+1.2));
	}
	void downSpeed() {
		speed = (speed<1?speed=0:speed*0.7);
	}
	double getSpeed() {
		return speed;
	}
	
	//------加上toString方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Hello Yang";
	}
}
