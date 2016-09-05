package tw.org.iii.AbnerJava;

import java.util.HashSet;
import java.util.Iterator;
import java.lang.Object;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet set = new HashSet();
		set.add(12);	// 會將int經過編譯 Auto-Boxing =>後變成Integer物件
		set.add(12.3);
		set.add("Abner"); //  String本身就是物件
		set.add(new Student("Abner",1,2,3));
		System.out.println(set.size());
		//HastSet的特性-----1.不重複   2.無順序性
		set.add(12.3);
		set.add(12);
		System.out.println(set.toString());
		
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println((Integer)obj);
		}
	}

}
