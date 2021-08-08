package eg1;

public class jpgDecoder extends ImageDecoder {
	public jpgDecoder(String fileName) {
		super(fileName);
	}
		

	@Override
	void displayImage() {
		System.out.print("Display jpgimage.");
	}

}
