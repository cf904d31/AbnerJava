package tw.org.iii.AbnerJava;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "10";   //可以使用int , byte , short , char , String 
		switch(a){         //在switch中無法使用Long宣告的數值
			case "1":
				System.out.println("A");
				break;
			case "10":
				System.out.println("B");
				break;
			case "100":
				System.out.println("C");
				break;
			default:
				System.out.println("D");
				break;
		}
		
		int x = 10;
		//int y = 9;  //case中無法使用變數來判別
		final int y = 11;  //加上final將y變數變為常數即可
		switch(x){        
		case 1:
			System.out.println("A");
			break;  //break可省略 但會導致程式繼續執行下去而不會中斷
		case y+10:
			System.out.println("B");
			break;
		case 100:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;
		}
		
		
		
		//------------判斷幾月有多少天-------------------
		
		int month = 5;
		switch (month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println(month+"月有31天");
				break;
			case 2:
				System.out.println(month+"月有28天");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println(month+"月有30天");
				break;
		}
	}

}