package Producer_Consumer.java;

public class producer_consumerclass {

	public static void main(String[] args) {
		Shop sobj=new Shop();
		Producer p=new Producer(sobj);
		Consumer c=new Consumer(sobj);

		// TODO Auto-generated method stub

	}

}
