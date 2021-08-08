package eg1;

import ImageDecoder.JpgDecoder;
import png.java.PngDecoder;

public class ImageDecoderFactory {
	public static ImageDecoder getInstance(String fileName) {
			if (fileName.endsWith(".jpg")) {
				return new JpgDecoder(fileName);
			}
			if (fileName.endsWith(".png")) {
				return new PngDecoder(fileName);
			}
			return null;
		}
	}
