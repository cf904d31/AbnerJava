package tw.org.iii.AbnerJava;

public class TWId {
	private String id;
	static String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
	
	public TWId(String id) {
		this.id = id;
	}
	
	public TWId() {
		this((int)(Math.random()*26));
	}
	public TWId(int area) {
		this((int)(Math.random()*2)==0?true:false , area);
	}
	public TWId(boolean gender) {
		this(gender , (int)(Math.random()*26));
	}
	public TWId(boolean gender, int area) {
		//------選擇地區------
		String temp = check.substring(area, area+1);
		//------選擇男女------
		temp += (gender?"1":"2");
		//------亂數產生7個0~9的號碼-----
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		temp += (int)(Math.random()*10);
		//------驗證最後一個號碼是否符合身分證驗證規格---------
		for (int i=0 ; i<10 ; i++) {
			if ( isRight(temp + i) ) {
				id = temp+i;
				break;
			}
		}
	}
	
	public String getId() {
		return id;
	}
	
	int Area() {
		return 1;
	}
	
	//---True:male  False:female
	boolean getGender() {
		return id.charAt(1)==1;
	}
	//-------如要讓大家可以不用new一個新物件便可以使用此方法
	//-------只要加上static即可
	static boolean isRight(String id) {
		boolean ret = false;   //-----使用正則表示法來判斷是否符合身分證規則
		if (id.matches("^[A-Z][12][0-9]{8}$")) {
			//------身分證驗證機制--------
			int pos = check.indexOf(id.charAt(0));
			//System.out.println(pos);
			int n12 = pos+10;
			int n1 = n12/10;
			int n2 = n12%10;
			//System.out.println(n1);
			//System.out.println(n2);
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4
					 +n8*3 + n9*2 + n10*1 + n11*1;
			
			ret = (sum%10==0);
		}
		return ret;
	}
	
	//--------底下這個是必須new TWId物件出來才可使用
	
	/*
	boolean isRight() {
		boolean ret = false;   //-----使用正則表示法來判斷是否符合身分證規則
		if (id.matches("^[A-Z][12][0-9]{8}$")) {
			//------身分證驗證機制--------
			String check = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int pos = check.indexOf(id.charAt(0));
			System.out.println(pos);
			int n12 = pos+10;
			int n1 = n12/10;
			int n2 = n12%10;
			System.out.println(n1);
			System.out.println(n2);
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4
					 +n8*3 + n9*2 + n10*1 + n11*1;
			
			ret = (sum%10==0);
		}
		return ret;
	}
	*/
}
