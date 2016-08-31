package tw.org.iii.AbnerJava;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1 = "Yang";
		String a2 = "Yang";
		String a3 = new String("Yang");
		String a4 = new String("Yang");
		//-------在因為在JAVA中的String使用次數太高，所以當String沒有被new的時候，
		//-------電腦看到""的符號時會直接放置在一個String的共同記憶體中，所以a1的記憶體會等於b1
		System.out.println(a1 == a2);
		//-------當String被new時會放置在一個全新的記憶體中所以會出現False
		System.out.println(a3 == a4);
		//-------在JAVA的String中如要比對字串內容要使用equals()的API
		System.out.println(a3.equals(a4));
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		//-------記憶體位置不同當然不同
		//-------一般情況下equals這個方法基本上等同於==的用法
		//-------在String中會有所不同是為equals()方法被改寫過
		System.out.println(myBike == urBike);
		System.out.println(myBike.equals(urBike));
	}

}
