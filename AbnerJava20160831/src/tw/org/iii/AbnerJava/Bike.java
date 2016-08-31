package tw.org.iii.AbnerJava;

public class Bike {
	private double speed;
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
}
