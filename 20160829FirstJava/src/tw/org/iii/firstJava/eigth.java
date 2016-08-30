package tw.org.iii.firstJava;

public class eigth {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10 , b = 3;
		if ( a++ >= 11 && b++ >= 3) {  //-------- ++在後會先執行比大小  所以在&&後面的b++不會執行
			System.out.println("OK;a="+a+";b="+b );
		} else {
			System.out.println("XX;a="+a+";b="+b );
		}
		
		//-----------------------------------
		a = 10;
		b = 3;
		if ( ++a >= 11 && ++b >= 3) {  //---------  ++在前會先執行+1
			System.out.println("OK;a="+a+";b="+b );
		} else {
			System.out.println("XX;a="+a+";b="+b );
		}
		
		//-----------------------------------
		a = 10;
		b = 3;
		if ( a++ >= 11 & b++ >= 3) {  //---------  因為只有使用一個& 與 && 不同 他會繼續執行完畢，所以會執行b++
			System.out.println("OK;a="+a+";b="+b );
		} else {
			System.out.println("XX;a="+a+";b="+b );
		}
		
	}
}
