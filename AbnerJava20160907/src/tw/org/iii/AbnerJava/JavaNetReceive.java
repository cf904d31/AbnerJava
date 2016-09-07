package tw.org.iii.AbnerJava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class JavaNetReceive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buf = new byte[1024];
		try {
			DatagramSocket ds = new DatagramSocket(8888);
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			System.out.println("Receive OK");
			ds.close();
			
			//-----顯示IP位置與內容
			InetAddress urip = dp.getAddress();
			int len = dp.getLength();
			byte []recmsg = dp.getData();
			System.out.println(urip.getHostAddress() + "" + new String(recmsg,0,len));
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
