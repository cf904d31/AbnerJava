package tw.org.iii.AbnerJava;

public class Bike {
	double speed;
	void upSpeed() {
		speed = (speed<1?speed=1:speed*1.2);
	}
	void downSpeed() {
		speed = (speed<1?speed=0:speed*0.7);
	}
}