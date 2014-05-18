
public class InterruptSynchronized implements Runnable {
	Class<InterruptSynchronized> lock;
	
	public InterruptSynchronized(Class<InterruptSynchronized> lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		System.out.println("running thread: " + Thread.currentThread().getName());
		synchronized (lock) {
			System.out.println(Thread.currentThread().getName() + " obtained lock.. sleeping");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " interrupted");
			}
			System.out.println(Thread.currentThread().getName() + " obtained lock.. done sleeping");
		}
	}


	public static void main(String[] args) throws InterruptedException {
		Class<InterruptSynchronized> lock = InterruptSynchronized.class;
		InterruptSynchronized one = new InterruptSynchronized(lock);
		InterruptSynchronized two = new InterruptSynchronized(lock);
		Thread t1 = new Thread(one);
		Thread t2 = new Thread(two);
		t1.start();
		t2.start();
		Thread.sleep(2000);
		t1.interrupt();
	}

}
