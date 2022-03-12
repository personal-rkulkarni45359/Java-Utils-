package dev.utility.jbase;

import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import dev.utility.jbase.constants.JConstants;

public class JHelper {

	/**
	 * Method to list all the fonts installed in java jre 
	 * @throws IOException 
	 */
	 

	public static Image getImageURL(String link) throws IOException
	{
		Image image = null;
		URL url = new URL(link);
		image = ImageIO.read(url);
		return image;
	}
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    // only got here if we didn't return false
	    return true;
	}
	public static void listFonts()
	{
		String fonts[] = 
	 			GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		for ( int i = 0; i < fonts.length; i++ )
		{
			System.out.println(fonts[i]);
		}
	}
	public static void check_parameters(String[] user_args, String[] valid_args)
	{
		int user_size=user_args.length; 
		int valid_size=valid_args.length; 
		
		if(user_size != valid_size)
		{
			
		}
		
		
	}
	public static void exit_Error(String loc, Exception e,String msg)
	{
		
		
		System.err.println("--------------------------System Error Detected--------------------------"); 
		System.err.println("Location of error: "); 
		System.err.println("\t "+ loc);
		System.err.println("User message");
		System.err.println(msg); 
		System.err.println("System Message of Error"); 
		System.err.println("\t " +e.getMessage());
		System.err.println("Stack Trace location");
		e.printStackTrace();
		System.err.println("Sending kill signal to terminate program");
		System.err.println("Program Terminated.");
		System.err.println("--------------------------------------------------------------------------"); 
		System.exit(1); 
	}
	
	public static boolean containsIgnoreCase(String input, String tester) {
		boolean isGood = false;
		input = input.toLowerCase();
		tester = tester.toLowerCase();

		if (input.contains(tester)) {
			isGood = true;
		}

		return isGood;
	}
	
	public static String sanatizeDirectoryName(String input)
	{
		
		
		input = input.replaceAll("//", "/");
		if(input.charAt(0) != '/')
			input= JConstants.SLASH + input;
		if(input.charAt(input.length()-1) != '/')
				input = input + JConstants.SLASH;
		return input;
	}
	
	public static String getFileExtension(String fileName)
	{
		String fileExtension=null; 
		fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
		return fileExtension; 
	}
	
	public static String getExtFileName(String fileName)
	{
		String fileExtension=null; 
		fileExtension = fileName.substring(fileName.lastIndexOf("/") +1, fileName.length());
		return fileExtension; 
	}
	public static String getOnlyFileName(String fileName)
	{
		String fileExtension=null; 
		fileExtension = fileName.substring(fileName.lastIndexOf("/") +1, fileName.lastIndexOf("."));
		return fileExtension; 
	}
	public static String getFilePath(String fileName)
	{
		String fileExtension=null;  
		fileExtension = fileName.substring(0, fileName.lastIndexOf("/")+1);
		return fileExtension; 
	}
	public static boolean equalsIgnoreCase(String input, String tester) {
		boolean isGood = false;

		input = input.toLowerCase();
		tester = input.toLowerCase();

		if (input.equals(tester))
			isGood = false;

		return isGood;
	}

	public static String removeCharacter(String input, String delimiter) {
		return input.replaceAll(delimiter, "");

	}

	public static String removeCharacters(String input, String[] delimiters) {
		String result = input;

		for (String delimiter : delimiters)
			result = removeCharacter(input, delimiter);

		return result;

	}
	
	public boolean isFile(String strFile)
	{
		
		File file= new File(strFile); 
		if(file.isFile())
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isDirectory(String strFile)
	{
		
		File file= new File(strFile); 
		if(file.isDirectory())
		{
			return true;
		}
		else
			return false;
	}
	
	

}

