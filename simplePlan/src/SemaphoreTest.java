import java.util.concurrent.Semaphore;


public class SemaphoreTest {
	
	Semaphore binary = new Semaphore(1);
	
	private void mutex() {
		try {
			System.out.println(Thread.currentThread().getName() + " trying to acquire lock");
			binary.acquire();
			System.out.println(Thread.currentThread().getName() + " instead mutex region");
			Thread.sleep(1000);
		} catch (InterruptedException iex) {
			iex.printStackTrace();
		} finally {
			binary.release();
			System.out.println(Thread.currentThread().getName() + " outside mutex region");
		}
	}

	public static void main(String[] args) {
		final SemaphoreTest test = new SemaphoreTest();
		
		new Thread() {
			public void run() {
				test.mutex();
			}
		}.start();
		
		new Thread() {
			public void run() {
				test.mutex();
			}
		}.start();
		
		
	}

}
