package tw.org.iii.AbnerJava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class JavaNetSend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "Hello! I am 祝哥";
		byte[] buf = msg.getBytes();
		for (;;) {
		try {
			DatagramSocket ds = new DatagramSocket();
			DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("10.1.6.255"),8888);
			ds.send(dp);
			System.out.println("OK");
			ds.close();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
