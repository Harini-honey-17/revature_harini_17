package eg1;

import jpg.java.JpgDecoder;

public class Main {

	public static void main(String[] args) {
				ImageDecoder jpgDecoder = ImageDecoderFactory.getInstance("logo.jpg");
				jpgDecoder.displayImage();
				
				JpgDecoder jpgDecoder1 = new JpgDecoder("logo.jpg");
			}

		}
		


