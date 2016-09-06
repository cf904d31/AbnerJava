package tw.org.iii.AbnerJava;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock extends JLabel {
	private Timer time1;
	public MyClock() {
		time1 = new Timer();
		time1.schedule(new MyTask(), 0 , 500);
	}
	
	private class MyTask extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Calendar nowTime = Calendar.getInstance();	
			int hh = nowTime.get(Calendar.HOUR_OF_DAY); 
			int mm = nowTime.get(Calendar.MINUTE);
			int ss = nowTime.get(Calendar.SECOND);
			setText(hh + ":" + mm + ":" + ss);
		}
	}
	
}
