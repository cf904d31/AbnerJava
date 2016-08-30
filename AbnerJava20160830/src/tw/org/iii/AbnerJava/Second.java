package tw.org.iii.AbnerJava;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		*/
		
		/*
		//------無窮迴圈------
		int i = 0;
		for (;;) {
			System.out.println(i++);
		}
		*/
		
		/*
		int i = 0;
		for (System.out.println("Yang");i<10;System.out.println("---------------------")) {
			System.out.println(i++);
		}
		*/
		
		
		//---------99乘法表
		for (int row=0 ; row<3 ; row++) {
			for (int firstNumber = 1;firstNumber<=9;firstNumber++) {
				for (int secondNumber = 1;secondNumber<=3;secondNumber++) {
					
					int result = firstNumber * secondNumber;
					System.out.print(secondNumber+"*"+firstNumber+"="+result+"\t");
				}
				System.out.println();
			}
			System.out.println("-----------------------");
		}
	}

}