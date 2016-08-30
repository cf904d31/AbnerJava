package tw.org.iii.firstJava;

public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int)(Math.random()*101);
		//System.out.println(number);
		if (number>=90) System.out.println(number+"A");
		else if(number>=80) System.out.println(number+"B");
		else if (number>=70) System.out.println(number+"C");
		else if (number>=60) System.out.println(number+"D");
	    else System.out.println(number+"E");
		
		int a = 1700;
		if (a%4 == 0) {
			if (a%100 == 0) {
				if (a%400 == 0) {
					System.out.println(a+"是閏年");
				} else {
					System.out.println(a+"不是閏年");
				}
			} else {
				System.out.println(a+"是閏年");
			}
		} else {
			System.out.println(a+"不是閏年");
		}
	}

}
