package tw.org.iii.AbnerJava;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a ;  //int ,long ,char ,byte ,short 等會顯示0            而float ,double會顯示0.0     Boolean會顯示False
		int b[] ;
		a = new int[3];
		b = new int[4];
		System.out.println(a.length);
		System.out.println(b.length);
		for (int i=0 ; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		
		
		//-----------骰子骰100次記錄各點出現次數(不使用陣列)----------------
		int one=0 ;
		int two=0 ;
		int three=0 ;
		int four=0 ;
		int five=0 ;
		int six=0 ;
		for (int i=1 ; i<=100 ; i++) {
			int number =(int)((Math.random()*6)+1) ;
			switch (number) {
				case 1:
					one++;
					break;
				case 2:
					two++;
					break;
				case 3:
					three++;
					break;
				case 4:
					four++;
					break;
				case 5:
					five++;
					break;
				case 6:
					six++;
					break;
			}
		}
		System.out.println("1點出現"+one+"次");
		System.out.println("2點出現"+two+"次");
		System.out.println("3點出現"+three+"次");
		System.out.println("4點出現"+four+"次");
		System.out.println("5點出現"+five+"次");
		System.out.println("6點出現"+six+"次");
		System.out.println("-----------------------------");
		
		
		//-----------骰子骰1000000次記錄各點出現次數(使用陣列)----------------
		
		int []p = new int[6];
		for (int i=0 ; i<1000000 ; i++) {
			int number =(int)((Math.random()*6)) ;  // 0~5
			p[number]++;
		}
		for (int j=0 ; j<p.length ; j++) {
			System.out.println((j+1)+"點出現"+p[j]+"次");
		}
		System.out.println("-----------------------------");
		
		
		//-----------骰子骰1000000次記錄各點出現次數(使用陣列及三元運算子)----------------
		int []x = new int[6];
		for (int i=0 ; i<1000000 ; i++) {
			int number =(int)((Math.random()*9)) ;  // 0~8
			p[number>5? number-3 : number]++;
		}
		for (int j=0 ; j<p.length ; j++) {
			System.out.println((j+1)+"點出現"+p[j]+"次");
		}
	}

}
