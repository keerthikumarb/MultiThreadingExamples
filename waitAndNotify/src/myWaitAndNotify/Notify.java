package myWaitAndNotify;

import java.time.LocalTime;

public class Notify implements Runnable {

	Employee employee;

	public Notify(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " thread reached Notify runnable");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (this.employee) {
			System.out.println(threadName + " thread entering notify state at time:" + LocalTime.now());
			employee.notifyAll();
			System.out.println(threadName + " thread notified at time:" + LocalTime.now());
		}
	}

}
