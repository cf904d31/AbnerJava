package tw.org.iii.AbnerJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class JavaNetURL_Queryphp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("http://10.1.6.70/query.php");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(
							conn.getInputStream()));
			String line;
			while ( (line = reader.readLine()) != null){
				String[] data = line.split(":");
				System.out.println(data[0] + "-" + 
						data[1] + "-" +
						data[2]);
				
			}
			reader.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
