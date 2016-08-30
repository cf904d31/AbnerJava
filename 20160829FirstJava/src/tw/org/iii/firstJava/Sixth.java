package tw.org.iii.firstJava;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 10;
		double b = 0;
		double c = a/b;
		System.out.println(c);
		double d = 0;
		double e = 0; // 很接近0的數值
		c = d/e;
		System.out.println(c);
		
		int f = 1;
		int g = 3;
		int h = f & g; // 會轉成2進制 來做AND 運算
		int i = f | g; // 會轉成2進制 來做OR 運算
		int j = f ^ g; // 會轉成2進制 來做XOR 運算
		System.out.println(h); 
		System.out.println(i);
		System.out.println(j);
	}

}
