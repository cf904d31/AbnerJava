package tw.org.iii.AbnerJava;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finally obj1 = new Finally();
		obj1.m1();
	}

}


//-----try-catch-finally共有3大結構
//-----1.try - catch  -----catch可多個
//-----2.try - catch  -----catch可多個  - finally
//-----3.try - finally  
class Finally {
	void m1(){
		int a = 10 ; 
		int b = 3;
		try {
			System.out.println(a/b);
			return;
		} catch(Exception e) {
			System.out.println("Catch");
		} finally {
			//-----加上finally可以保證在這個try-catch結束後一定會執行finally裡面的程式
			//-----如例try裡面加上return  導致 [Game Over] 不會被執行  但finally中的程式仍然被執行
			System.out.println("Finally");
		}
		System.out.println("Game Over");
	}
}