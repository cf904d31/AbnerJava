package tw.org.iii.AbnerJava;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTask myTask1 = new MyTask("A");
		MyTask myTask2 = new MyTask("B");
		Timer t1 = new Timer();
		t1.schedule(myTask1, 0 , 500);
		t1.schedule(myTask2, 0 , 300);
		
	}

}

class MyTask extends TimerTask {
	private String name ;
	private int i ;
	MyTask(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+i++);
	}
	
}
