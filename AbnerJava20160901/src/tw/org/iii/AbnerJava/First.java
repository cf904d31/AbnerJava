package tw.org.iii.AbnerJava;

import javax.swing.JOptionPane;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-------------猜數字1A2B遊戲-----------
		//--------1.產生出4個號碼的亂數---------
		int n = 4;
		String answer = createAnswer(n);
		System.out.println(answer);
		//--------2.開始遊戲--------------------
		boolean isCheck = false;
		int choice = 10;
		String showResult = "";
		for (int i=1 ; i<=10 ; i++) {
			//--------3.猜數字----------------------
			String guess = JOptionPane.showInputDialog("請輸入" + n + "個數字");
			choice --;
			//--------4.比對猜的數字----------------
			if (guess.equals(answer)) {
				isCheck = true;
				break;
			}
			String result = checkAB(guess , answer);
			showResult += ("第" + i + "次猜的結果" + guess + ":" + result + "\n");
			JOptionPane.showMessageDialog(null, "您還有" + choice + "次機會\n" + showResult);
		}
		
		//--------5.顯示結果--------------------
		
		if (isCheck) {
			JOptionPane.showMessageDialog(null, "恭喜您成功猜對數字");
		} else {
			JOptionPane.showMessageDialog(null, "抱歉您在10次內未猜中數字");
		}
	}
	
	
	static String createAnswer(int n) {
		int [] porkCard = new int[n];
		for (int i=0 ; i<porkCard.length ; i++) {
			int temp;
			//------檢查是否重複----------  
			//------使用do-while來判斷----
			boolean isRepeat;
			do {
				isRepeat = false;
				temp =(int)(Math.random()*10);
				for (int j=0 ; j<i ; j++) {
					if (temp == porkCard[j]) {
						isRepeat = true;
						break;
					}
				}
			} while (isRepeat);
			porkCard[i] = temp;
		}
		String ret = "";
		//-----使用foreach將陣列中的值放入ret中
		for (int p : porkCard) {
			ret += p;
		}
		return ret;
	}
	static String checkAB(String b, String a) {
		int A , B ;
		A = B = 0;
		for (int i=0 ; i<a.length() ; i++) {
			if (b.charAt(i) == a.charAt(i)) {
				A++;
			} else if (a.indexOf(b.charAt(i)) != -1) {
				B++;
			} else {
				
			}
		}
		return A + "A" + B + "B";
	}
}
