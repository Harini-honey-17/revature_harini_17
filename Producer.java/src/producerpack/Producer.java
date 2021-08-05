package producerpack;


public class Producer implements Runnable {

	Thread t;
	Shop obj;

	public Producer(Shop obj1) {
		super();
		obj = obj1;
		t = new Thread(this, "producer");
		t.start();
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				Thread.sleep(2000);
				((Object) obj).put(i);
			}
		}catch(Exception e) {
			System.out.println("\n error " + e);
		}

	}

}