package tw.org.iii.AbnerJava;

import javax.swing.JOptionPane;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-------------�q�Ʀr1A2B�C��-----------
		//--------1.���ͥX4�Ӹ��X���ü�---------
		int n = 5;
		String answer = createAnswer(n);
		System.out.println(answer);
		//--------2.�}�l�C��--------------------
		
		for (int i=0 ; i<10 ; i++) {
		//--------3.�q�Ʀr----------------------
			String guess = JOptionPane.showInputDialog("�п�J" + n + "�ӼƦr");
		//--------4.���q���Ʀr----------------
			if (guess.equals(answer)) {
				
			}
			String result = checkAB(guess , answer);
			JOptionPane.showMessageDialog(null, guess+":" + result);
		}
		
		//--------5.��ܵ��G--------------------
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
