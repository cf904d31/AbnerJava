package tw.org.iii.AbnerJava;

public class UseBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike myBike = new Bike();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
	}

}
