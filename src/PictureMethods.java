import java.awt.Color;

public class PictureMethods {

	public static Color[][] process1(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);

		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {

				Color pixel = tmp[i][j];

				int r = pixel.getRed() * 0;
				int g = pixel.getGreen() * 0;
				int b = pixel.getBlue();
				tmp[i][j] = new Color(r, g, b);

			}
		}
		return tmp;
	}

	public static Color[][] process2(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);

		for (int i = 0; i < tmp.length; i++) { // i = col
			for (int j = 0; j < tmp[i].length; j++) { // j = row

				if (j % 5 == 0) {
					if (j < tmp[j].length * 0 + 100) {
						Color pixel = tmp[i][j];
						int r = pixel.getRed() * 0;
						int g = pixel.getGreen() * 0;
						int b = pixel.getBlue();
						tmp[i][j] = new Color(r, g, b);
					}
					if (j > tmp[j].length * 0 + 198 && j < tmp[j].length * 0 + 300) {
						Color pixel = tmp[i][j];
						int r = pixel.getRed();
						int g = pixel.getGreen() * 0;
						int b = pixel.getBlue() * 0;
						tmp[i][j] = new Color(r, g, b);
					}
					if (j > tmp[j].length * 0 + 398 && j < tmp[j].length * 0 + 500) {
						Color pixel = tmp[i][j];
						int r = pixel.getRed() * 0;
						int g = pixel.getGreen() * 0;
						int b = pixel.getBlue();
						tmp[i][j] = new Color(r, g, b);
					}
				}
				if (j > tmp[j].length * 0 + 98 && j < tmp[j].length * 0 + 200) {
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen() * 0;
					int b = pixel.getBlue() * 0;
					tmp[i][j] = new Color(r, g, b);
				}
				if (j > tmp[j].length * 0 + 300 && j < tmp[j].length * 0 + 400) {
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen() * 0;
					int b = pixel.getBlue() * 0;
					tmp[i][j] = new Color(r, g, b);
				}
				if (j > tmp[j].length * 0 + 498 && j < tmp[j].length * 0 + 512) {
					Color pixel = tmp[i][j];
					int r = pixel.getRed();
					int g = pixel.getGreen() * 0;
					int b = pixel.getBlue() * 0;
					tmp[i][j] = new Color(r, g, b);
				}
			}
		}
		return tmp;
	}

	public static Color[][] process3(Color[][] img) {
		Color[][] tmp = ImageUtils.cloneArray(img);

		for (int i = 0; i < tmp.length; i++) {
			for (int j = 0; j < tmp[i].length; j++) {

				Color pixel = tmp[i][j];

				if (pixel.getGreen() > 207 || pixel.getRed() > 207 || pixel.getBlue() > 207) {
					int r = pixel.getRed();
					int g = pixel.getGreen() * 0;
					int b = pixel.getBlue() * 0;
					tmp[i][j] = new Color(r, g, b);
				}
			}
		}
		return tmp;
	}
}
