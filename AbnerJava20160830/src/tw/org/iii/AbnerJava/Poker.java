package tw.org.iii.AbnerJava;

public class Poker {
	
	
	/*   //第一版洗牌系統
	public static void main(String[] args) {
		// 洗牌
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++){
			int temp = (int)(Math.random()*10);
			
			// 檢查機制
			boolean isRepeat = false;
			for (int j=0; j<i; j++){
				if (temp == poker[j]){
					isRepeat = true;
					break;
				}
			}
			if (isRepeat) {
				i--;
				continue;
			}
			
			System.out.println(temp);
			poker[i] = temp;
		}
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] porkCard = new int[52];
		long start = System.currentTimeMillis();
		//---------第二版洗牌系統------------
		for (int i=0 ; i<porkCard.length ; i++) {
			int temp;
			//------檢查是否重複----------  
			//------使用do-while來判斷----
			boolean isRepeat;
			do {
				isRepeat = false;
				temp =(int)(Math.random()*52);
				for (int j=0 ; j<i ; j++) {
					if (temp == porkCard[j]) {
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);
			porkCard[i] = temp;
			System.out.print(temp+"  ");
		}
		
		
		//--------------第三版洗牌程式---------
		System.out.println();
		for (int i=0 ; i<porkCard.length ; i++) {
			int temp = i ;
			porkCard[i] = temp; 
			System.out.print(porkCard[i]+" ");
		}
		
		for (int i=porkCard.length-1 ; i>0 ; i--) {
			int arrayNumber = (int)(Math.random()*i);
			int temp = porkCard[arrayNumber];
			porkCard[arrayNumber] = porkCard[i];
			porkCard[i] = temp;
		}
		System.out.println();
		for (int i=0 ; i<porkCard.length ; i++) {
			System.out.print(porkCard[i]+" ");
		}
		
		//---------計算程式執行時間
		long stop = System.currentTimeMillis();
		System.out.print("Time=");
		System.out.println(stop-start);
		System.out.println("-----------------");
		//---------發牌-------------
		int [][] player = new int[4][13];
		for (int i=0 ; i<porkCard.length ; i++) {
			player[i%4][i/4] = porkCard[i];
		}
		for (int v[] : player) {
			System.out.println("玩家-----");
			for (int vv : v) {
				System.out.println(vv);
			}
		}
		
	}

}
