package tw.org.iii.AbnerJava;

public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 obj1 = new Thread1("A");
		Thread1 obj2 = new Thread1("B");
		Thread12 obj3 = new Thread12("C");
		Thread t1 = new Thread(obj3);
		//obj1.run();
		//obj2.run();
		obj1.start();
		obj2.start();
		t1.start();
		//-----start就像人的生命只有一條，但是大體仍然存在
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main");
		obj2.interrupt();
	}

}

//-----創建執行序的方法一:繼承Thread()方法
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
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
	}
	
}

//-----創建執行序的方法二:實作Runnable介面   
//-----然後在主程式將之放入一個new出來的執行序中給它start()
class Thread12 implements Runnable {
	private String name;
	Thread12(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i=0 ; i<10 ; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
	}
	
}
