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



public class JavaNetURL_PHP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://10.1.6.80/addData.php?cname=BradPeter&tel=8756321&birthday=1992-06-30");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			
			InputStream ins = conn.getInputStream();
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
