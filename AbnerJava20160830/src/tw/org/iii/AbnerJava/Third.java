package tw.org.iii.AbnerJava;

public class Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Yang:
		for (int i=0 ; i<5 ; i++) {
			for (int j=5 ; j>0 ; j--) {
				System.out.println(i+":"+j);
				if (i==3) {
					break Yang;  //若加上標頭則會直接回到Yang的開頭 直接離開for迴圈
				}
			}
		}
	}

}