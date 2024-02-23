package thread;

public class ImplementingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread thread = new MyThread();
		thread.start();
	}

}

class MyThread extends Thread{
	
	public void run() {
		System.out.println("THis is a run method of my thread class.");
	}
}
