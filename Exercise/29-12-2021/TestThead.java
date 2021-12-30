import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestThead {

	public static void main(final String[] arguments)throws
	InterruptedException{
		ExecutorService e=Executors.newSingleThreadExecutor();
		
	try {
		e.submit(new Thread());
		System.out.println("Shutdown executor");
		e.shutdown();
		e.awaitTermination(5,TimeUnit.SECONDS);
	}catch (InterruptedException ex) {
		System.err.println("tasks interrupted");
	}finally {
		 
	if(!e.isTerminated()) {
	System.err.println("cancel non-finisheed tasks");
	}
	e.shutdownNow();
	System.out.println("shutdown finished");
	}
	}
	
	static  class Task implements Runnable{
   
		public void run() {
			
	try {
		Long duration=(long)(Math.random()*20);
		System.out.println("Running Task!");
		TimeUnit.SECONDS.sleep(duration);
	}catch (InterruptedException ex) {
		ex.printStackTrace();
	}
	}
	}
}

/*
 outut:
 
 Shutdown executor
shutdown finished

 */























