package tw.org.iii.AbnerJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class JavaNetURLImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//URL url = new URL("http://a.ecimg.tw/pic/v1/data/item/201609/D/R/A/G/6/S/DRAG6S-19007D0LW000_57d0c1eba36c7.jpg");
			URL url = new URL("http://pdfmyurl.com/?url=http://www.gamer.com.tw");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			InputStream ins = conn.getInputStream();
			
			
			//FileOutputStream fout = new FileOutputStream("dir1/Abner.jpg");
			FileOutputStream fout = new FileOutputStream("dir1/Gamer.pdf");
			byte []buf = new byte[4096];
			int len;
			while ( (len = ins.read(buf)) != -1 ) {
				fout.write(buf,0,len);
			}
			
			
			fout.flush();
			fout.close();
			ins.close();
			System.out.println("OK");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
