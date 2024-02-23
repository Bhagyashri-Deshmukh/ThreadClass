package thread;

public class RunaableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadClass myThreadClass = new MyThreadClass();
		Thread thread = new Thread(myThreadClass);
		thread.start();
	}

}

class MyThreadClass implements Runnable{

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is run method of MyThreadClass, which is created by implementing runnable interface.");
	}
	
}
