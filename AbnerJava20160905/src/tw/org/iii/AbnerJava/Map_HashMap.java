package tw.org.iii.AbnerJava;

import java.util.HashMap;

public class Map_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-----Map 中的 HashMap應用
		HashMap hmap = new HashMap();
		hmap.put("name", "Abner");
		hmap.put("weight", 70);
		hmap.put("height", 180);
		System.out.println(hmap.get("height"));
	}

}
