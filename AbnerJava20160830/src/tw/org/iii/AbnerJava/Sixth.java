package tw.org.iii.AbnerJava;

public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二維以上陣列表示法
		int [][] a;
		int [] b [];
		int c[][];
		a = new int [3][4];
		b = new int [3][];
		b[0] = new int [2];
		b[1] = new int [3];
		b[2] = new int [4];
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(b.length);
		System.out.println(b[2].length);
		System.out.println("-------------------");
		
		b[0][1] = 1;
		b[1][2] = 2;
		b[2][3] = 3;
		
		for (int i=0 ; i<b.length ; i++) {
			for (int j=0 ; j<b[i].length ; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		//--------使用for-each顯示一維陣列-------------
		int [] d = new int[3];
		for (int v :d) {
			System.out.println(v);
		}
		System.out.println("-------------------");
		
		//--------使用for-each顯示二維陣列-------------
		//--------使用上面的b陣列來作範例--------------
		for (int [] v : b) {  // 先將二維陣列的b放進一維陣列的v中
			for (int vv : v) {  //再來將一維陣列的v的值放入vv變數中顯示
				System.out.print(vv);
			}
			System.out.println();
		}
		
		//-------一維陣列直接給值----------------------
		int [] e = new int[]{1,2,3,4,5};
		int [] f = {6,7,8,9,10};
	}

}
