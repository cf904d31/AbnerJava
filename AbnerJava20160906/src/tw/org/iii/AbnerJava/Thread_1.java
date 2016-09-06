package tw.org.iii.AbnerJava;

public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 obj1 = new Thread1("A");
		Thread1 obj2 = new Thread1("B");
		//obj1.run();
		//obj2.run();
		obj1.start();
		obj2.start();
	}

}

class Thread1 extends Thread {
	private String name;
	Thread1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i=0 ; i<10 ; i++) {
			System.out.println(name + ":" + i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
