package tw.org.iii.AbnerJava;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while (i<10) {
			System.out.println(i++);
		}
		
		int n=1;
		int sum=0;
		while (n<=100) {
			sum += n++;
		}
		System.out.println("1+2+3+...+"+n+"="+sum);
	}

}
