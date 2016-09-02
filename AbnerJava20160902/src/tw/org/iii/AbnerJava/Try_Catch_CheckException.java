package tw.org.iii.AbnerJava;

public class Try_Catch_CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird1 = new Bird();
		try {
			bird1.setLeg(5);
		} catch (Exception er) {
			
		}
	}

}

class Bird {
	int leg;
	//-----如有丟出Exception 要加上  throws Exception  
	void setLeg(int n) throws Exception{
		if (n<0) {
			//-----丟出一個Exception來讓呼叫他的人處理
			throw new Exception();
		}
		System.out.println(n);
	}
}