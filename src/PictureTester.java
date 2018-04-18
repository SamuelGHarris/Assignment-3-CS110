import java.awt.Color;

public class PictureTester {
	
	public static void main(String[] args) {
		
		ImageUtils utils = new ImageUtils();
		
		Color[][] orig = utils.loadImage("src/George.png");
		
		utils.addImage(orig, "Original image");
		
		Color[][] blueFilter = PictureMethods.process1(orig);
		Color[][] coloredLines = PictureMethods.process2(orig);
		Color[][] redSky = PictureMethods.process3(orig);

		utils.addImage(blueFilter, "Solid Blue");
		utils.addImage(coloredLines, "Blue and Red Lines");
		utils.addImage(redSky, "Red Sky");

		
		utils.display();

	}

}
