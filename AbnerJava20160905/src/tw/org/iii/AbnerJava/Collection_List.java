package tw.org.iii.AbnerJava;

import java.util.LinkedList;

public class Collection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList的特性-----1.可重複  2.有順序性
		LinkedList list = new LinkedList();
		list.add(12);
		list.add(12);
		list.add("Abner");
		list.add(true);
		list.add(12.33);
		list.add(12.33);
		list.add("Abner");
		System.out.println(list.toString());
		
		//-----在add中前面加上數字便可將add的內容擠到那個數字原本的位置
		//-----而原本的內容會被往下擠
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(0,2);
		list1.add(0,3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1.toString());
	}

}
