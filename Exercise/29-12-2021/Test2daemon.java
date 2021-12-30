
public class Test2daemon extends Thread{
	public void run() {
		System.out.println("Running thread is daemon...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Test2daemon td=new Test2daemon();
   td.start();
	}
}