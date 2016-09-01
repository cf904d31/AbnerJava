package tw.org.iii.AbnerJava;

import javax.swing.JOptionPane;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-------------猜數字1A2B遊戲-----------
		//--------1.產生出4個號碼的亂數---------
		int n = 5;
		String answer = createAnswer(n);
		System.out.println(answer);
		//--------2.開始遊戲--------------------
		
		for (int i=0 ; i<10 ; i++) {
			//--------3.猜數字----------------------
			String guess = JOptionPane.showInputDialog("�п�J" + n + "�ӼƦr");
			//--------4.比對猜的數字----------------
			if (guess.equals(answer)) {
				
			}
			String result = checkAB(guess , answer);
			JOptionPane.showMessageDialog(null, guess+":" + result);
		}
		
		//--------5.顯示結果--------------------
	}
	
	
	static String createAnswer(int n) {
		int [] porkCard = new int[n];
		for (int i=0 ; i<porkCard.length ; i++) {
			int temp;
			//------�ˬd�O�_����----------  
			//------�ϥ�do-while�ӧP�_----
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
		//-----�ϥ�foreach���}�C�����Ʀr�v���[�J�ܼ�ret��
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