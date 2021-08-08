package eg1;

public class singleton {
	private static singleton singleton = null;
	private void Singleton() {
		
	}
	public static singleton getInstance() {
		if(singleton==null) {
			singleton=new singleton();
		}
			return new singleton();
		}
	}