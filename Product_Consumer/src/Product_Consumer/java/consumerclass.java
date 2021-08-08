package Product_Consumer.java;

public class consumerclass {

	public static void main(String[] args) {
		Shop sobj=new Shop();
		Producer p=new Producer(sobj);
		Consumer c=new Consumer(sobj);

		// TODO Auto-generated method stub

	}

}
