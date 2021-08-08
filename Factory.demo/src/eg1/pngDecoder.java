package eg1;

	public class pngDecoder extends ImageDecoder {

		public pngDecoder(String fileName) {
			super(fileName);
		}

		@Override
		void displayImage() {
			System.out.println("Display PNG image.");
		}

	}
