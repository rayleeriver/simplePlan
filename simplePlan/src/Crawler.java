import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Crawler {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<String> urls = new ArrayList<String>() {
			private static final long serialVersionUID = 1L;
			{
				add("http://www.java2jee.blogspot.com");
				add("http://www.yahoo.com");
				add("http://www.msdn.com");  
				add("http://c2.com/xp/ExtremeProgrammingRoadmap.html");
				add("http://apache.org/");
				add("http://sourceforge.net/");
			}
		};
		List<Future<Integer>> futures = new ArrayList<Future<Integer>>(urls.size());

		final ExecutorService service = Executors.newFixedThreadPool(1);

		try {
			long start = System.nanoTime();
			for (String url : urls) {
				futures.add(service.submit(new CallableExample(url)));
			}

			long result = 0;
			for (Future<Integer> future : futures) {
				result += future.get();
			}

			System.out.println("\nTotal bytes: " + result);
			System.out.println("Total time: " + (System.nanoTime() - start) / 1000000 + "ms");

		} finally {
			service.shutdown();
		}
	}
}

class CallableExample implements Callable<Integer> {
	private final String currentUrl;

	public CallableExample(String currentUrl) {
		this.currentUrl = currentUrl;
	}

	@Override
	public Integer call() throws IOException {
		int result = 0;
		URL url = new URL(currentUrl);
		LineNumberReader in = null;
		try {
			in = new LineNumberReader(new InputStreamReader(url.openStream()));
		} catch (IOException e) {
			System.out.println(currentUrl + " connnection problem");
			return result;
		} finally {
			in.close();
		}
		
		try {
			String line = null;
			while ((line = in.readLine()) != null) {
				result += line.length();
			}
		} finally {
			in.close();
		}
		
		System.out.println(currentUrl + " has " + result + " bytes");
		
		return result;
	}

}
