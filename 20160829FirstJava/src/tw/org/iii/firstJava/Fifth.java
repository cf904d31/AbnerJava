package tw.org.iii.firstJava;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10 , b = 3 ;
		//byte c = a + b ; //視為int 所以無法使用byte
		int d = a+b;
		
		//------------------------------------
		int e = a/b ;
		double f = a/b ;
		System.out.println(e);
		System.out.println(f);
		
		//------------------------------------
		double g = (double) a/b;
		System.out.println(g);
		
	}

}
