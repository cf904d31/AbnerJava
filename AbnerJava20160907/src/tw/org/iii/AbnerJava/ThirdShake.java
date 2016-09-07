package tw.org.iii.AbnerJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ThirdShake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File sendFile = new File("dir1/nature.jpg");
			byte[] buf = new byte[(int)sendFile.length()];
			FileInputStream fis = 
					new FileInputStream(sendFile);
			fis.read(buf);
			fis.close();
			
			
			Socket socket = new Socket(
				InetAddress.getByName("10.1.6.58"), 9999);
			
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("Send OK!");
			
			
			//-----這個版本傳遞速度較慢
			/*
			Socket socket = new Socket(InetAddress.getByName("10.1.6.58") ,9999);
			
			
			
			
			FileInputStream fis = new FileInputStream("dir1/coffee.jpg");
			OutputStream out = socket.getOutputStream();
			
			int b;
			while ( (b = fis.read() ) !=-1 ) {
				out.write(b);
			}
			
			//out.write("Hello! I am Brad!".getBytes());
			out.flush();
			out.close();
			
			
			
			
			socket.close();
			
			*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
