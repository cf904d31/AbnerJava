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
		//-----start�N���H���ͩR�u���@���A���O�j�餴�M�s�b
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

//-----�Ыذ���Ǫ���k�@:�~��Thread()��k
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

//-----�Ыذ���Ǫ���k�G:��@Runnable����   
//-----�M��b�D�{���N����J�@��new�X�Ӫ�����Ǥ�����start()
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
