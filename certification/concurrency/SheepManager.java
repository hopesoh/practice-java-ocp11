import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SheepManager {
	private int sheepCount = 0;

	private void incrementAndReport() {
		synchronized(this) {
			System.out.print((sheepCount.incrementAndGet()) + " ");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			SheepManager manager = new SheepManager();
			for (int i = 0; i < 10; i++) service.submit(() -> manager.incrementAndReport());
		} finally {
			if (service != null) service.shutdown();
		}
	}

}