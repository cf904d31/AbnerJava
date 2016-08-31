package tw.org.iii.AbnerJava;

public class UseBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike myBike = new Bike();
		myBike.speed = 4;
		System.out.println(myBike.speed);
		myBike.upSpeed();
		System.out.println(myBike.speed);
	}

}
