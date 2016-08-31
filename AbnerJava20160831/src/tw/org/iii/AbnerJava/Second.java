package tw.org.iii.AbnerJava;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String();
		byte []a1 = {97,98,99,100};
		String b1 = new String(a1);
		String b2 = new String(a1,1,2);
		Bike myBike = new Bike();
		System.out.println(s1);
		System.out.println(b1);
		System.out.println(b2);
		//----在Bike的類別中沒有寫toString的方法的話直接印出來會顯示他在記憶體的位置
		System.out.println(myBike);
	}

}
