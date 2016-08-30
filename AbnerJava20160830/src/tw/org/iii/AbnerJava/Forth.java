package tw.org.iii.AbnerJava;

public class Forth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----------判斷1到100的質數
		for (int i=1 ; i<=100 ; i++) {
			boolean isP = false;
			for (int j=2 ; j<i ; j++) {
				if (i%j == 0) {
					isP = true;
					//break;
				}
			}
			System.out.print(i + (isP?" ":"*") + " ");
			if (i%10 == 0) {
				System.out.println("");
			}
			
		}
	}

}