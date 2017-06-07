package myWaitAndNotify;

public class MyMain {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1, "Keerthi");
		
		Wait wait = new Wait(employee);
		new Thread(wait, "First").start();
		
		Wait wait1 = new Wait(employee);
		new Thread(wait1, "Second").start();
		
		Notify notify = new Notify(employee);
		new Thread(notify, "Notify").start();
		
		System.out.println("All thread got notified.");
	}
}
