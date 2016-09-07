package tw.org.iii.AbnerJava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ThirdShake_Receive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket sos = new ServerSocket(9999);
			Socket socket = sos.accept();
			
			FileOutputStream fout = new FileOutputStream("receive/brad.jpg");
			InputStream ins = socket.getInputStream();
			int c;
			while ( (c = ins.read()) != -1) {
				//System.out.println((char)c);
				fout.write(c);
			}
			
			ins.close();
			
			fout.flush();
			fout.close();
			
			
			sos.close();
			socket.close();
			System.out.println("收到照片了");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
