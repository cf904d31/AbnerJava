package tw.org.iii.firstJava;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a_a;
		a_a=2100000000;
		System.out.println(a_a);
		int  z =2;
		byte a = 127;  //在java中所有數值都被宣告為int 
		a++; //而因為a超出範圍的數值所以當+上1之後在電腦中是位移 顯示為-128
		System.out.println(a);
		a += 4; //-124
		System.out.println(a);
		long b ;
		b = 21000000000000000L; //
		//a = b ; //因為b已被放在long裡面 所以不是能放在int 的 a 裡面
		
		a = 12;
		System.out.println(a);
		a = 012; //八進位
		System.out.println(a);
		a = 0x12; //十六進位
		System.out.println(a);
	}

}
