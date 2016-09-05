package tw.org.iii.AbnerJava;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection_Latto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----樂透應用使用Collection產生出不重複的6個數字
		HashSet hset = new HashSet();
		while (hset.size() < 6) {
			hset.add( (int)(Math.random()*49+1) );
		}
		System.out.println(hset.toString());
		
		//-----Set中的TreeSet可以幫忙排序，正常情況是會像HashSet一樣無順序性
		TreeSet Tset = new TreeSet();
		while (Tset.size() < 6) {
			Tset.add( (int)(Math.random()*49+1) );
		}
		System.out.println(Tset.toString());
	}

}
