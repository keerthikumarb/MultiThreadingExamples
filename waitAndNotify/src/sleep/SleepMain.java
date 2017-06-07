package sleep;

public class SleepMain {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread1 = new Thread(myRunnable, "Thread1");
		Thread thread2 = new Thread(myRunnable, "Thread2");
		thread1.start();
		System.out.println(Thread.currentThread().getName());
		thread2.start();
	}
}
