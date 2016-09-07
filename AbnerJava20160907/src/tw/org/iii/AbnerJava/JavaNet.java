package tw.org.iii.AbnerJava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class JavaNet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//-----除非打錯DNS的名稱 或者 打超過網域的範圍 才會顯示 Exception
			InetAddress ip = InetAddress.getByName("www.hinet.net");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
