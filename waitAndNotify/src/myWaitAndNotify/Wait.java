package myWaitAndNotify;

import java.time.LocalTime;

public class Wait implements Runnable {

	Employee employee;

	public Wait(Employee employee) {
		this.employee = employee;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " thread reached Wait runnable");
		synchronized (this.employee) {
			try {
				System.out.println(threadName + " thread entering wait state at time:" + LocalTime.now());
				employee.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadName + " thread notified at time:" + LocalTime.now());
			// this.employee.notify();
		}
	}

}
