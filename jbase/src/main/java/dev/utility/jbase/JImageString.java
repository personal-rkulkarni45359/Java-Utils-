package dev.utility.jbase;

import dev.utility.jbase.constants.JConstants;

public class JImageString {
	public static String parseImageType(String input) {
		String output = "";
		output = input.toLowerCase();
		output = input.replaceAll(".", "");
		if (isJPG(output)) {
			output = JConstants.JPG;
		}
		if (isPNG(output)) {
			output = JConstants.PNG;
		} else if (isTIFF(output)) {
			output = JConstants.TIFF;
		} else if (isBMP(output)) {
			output = JConstants.BMP;
		} else if (isGIF(output)) {
			output = JConstants.GIF;
		} else {
			System.out.println("Unable to extract image type from file name");
			System.exit(1);
		}
		return output;

	}

	public static boolean isImage(String input) {
		boolean isTrue = false;
		if (isJPG(input) || isPNG(input) || isTIFF(input) || isBMP(input) || isGIF(input))
			isTrue = true;
		return isTrue;

	}

	public static boolean isJPG(String input) {
		boolean isTrue = false;

		for (String string : JConstants.JPGS) {
			if (JHelper.containsIgnoreCase(input, string)) {
				isTrue = true;
				break;
			}

		}
		return isTrue;
	}

	public static boolean isPNG(String input) {

		boolean isTrue = false;

		for (String string : JConstants.PNGS) {
			if (JHelper.containsIgnoreCase(input, string)) {
				isTrue = true;
				break;
			}
		}
		return isTrue;
	}

	public static boolean isTIFF(String input) {

		boolean isTrue = false;

		for (String string : JConstants.TIFFS) {
			if (JHelper.containsIgnoreCase(input, string)) {
				isTrue = true;
				break;
			}
		}

		return isTrue;
	}

	public static boolean isBMP(String input) {
		boolean isTrue = false;

		for (String string : JConstants.BMPS) {
			if (JHelper.containsIgnoreCase(input, string)) {
				isTrue = true;
				break;
			}
		}

		return isTrue;
	}
	


	public static boolean isGIF(String input) {

		boolean isTrue = false;

		for (String string : JConstants.GIFS) {
			if (JHelper.containsIgnoreCase(input, string)) {
				isTrue = true;
				break;
			}
		}

		return isTrue;
	}
	
	

}
