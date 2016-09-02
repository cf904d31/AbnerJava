package tw.org.iii.AbnerJava;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----Exception(例外)中有分兩類  一類是:RunTimeException  除了這一類外的都是CheckException
		//-----RunTimeException在編譯時期並不會有錯誤，執行時才會出現Exception
		//-----這裡都是探討RunTimeException
		int a = 10;
		int b = 3;
		try {
			int []d = {1,2,3,4};
			int c = a/b;
			System.out.println(c);
			System.out.println(d[4]);
		} catch(ArithmeticException ex) {
			System.out.println("ArithmeticException");
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(RuntimeException ex) {
			//-----其他兩個Exception都是RuntimeException的子類別
			System.out.println("RuntimeException");
		}
		System.out.println("Exception");
	}

}
