package dev.utility.jbase.constants;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class JConstants {
	
	
	
	
	public static final String DOT = ".";
	public static final String SLASH = "/";
	public static final String UNDERSCORE = "_";
	public static final String NEWLINE = "\n";

	


	
	private static final String USER_BASE = "/home/r4770/"; 
	private static final String INPUTS ="inputs/";
	private static final String OUTPUTS = "outputs/"; 
	private static final String DESKTOP ="Desktop/";
	private static final String PICTURES ="Pictures/";
	private static final String VIDEOS ="Videos/";
	private	 static final String MUSIC ="Music/";
	private static final String TESTS = "tests/"; 
	private static final String STEGANOGRAPHY = ".steganography/"; 

	private static final String IMAGE1_SAMPLE = USER_BASE + DESKTOP + "image1";
	private static final String IMAGE2_SAMPLE = USER_BASE + DESKTOP +"image2";
	
	public static final String DESKTOP_DIRECTORY = USER_BASE + DESKTOP; 
	public static final String IMAGE_DIRECTORY= USER_BASE + PICTURES;
	public static final String INPUT_DESKTOP_DIRECTORY = USER_BASE+ DESKTOP + INPUTS; 
	public static final String INPUT_AUDIO_DIRECTORY= USER_BASE + MUSIC + INPUTS;
	public static final String INPUT_VIDEO_DIRECTORY= USER_BASE + VIDEOS + INPUTS;
	public static final String INPUT_IMAGE_DIRECTORY= USER_BASE + PICTURES +INPUTS;
	public static final String STEGANOGRAPHY_DIR= USER_BASE + STEGANOGRAPHY;
	
	public static final String INPUT_TEST_DIRECTORY = USER_BASE+DESKTOP +INPUTS + TESTS;
	public static final String OUTPUT_TEST_DIRECTORY = USER_BASE+DESKTOP +OUTPUTS + TESTS;



	public static final String OUTPUT_DESKTOP_DIRECTORY = USER_BASE+ DESKTOP + OUTPUTS; 
	public static final String OUTPUT_AUDIO_DIRECTORY= USER_BASE + MUSIC + OUTPUTS;
	public static final String OUTPUT_VIDEO_DIRECTORY= USER_BASE + VIDEOS + OUTPUTS;
	public static final String OUTPUT_IMAGE_DIRECTORY= USER_BASE + PICTURES +OUTPUTS;
	

    public static final  String STEG_DATA =  "zданные"; 
   	public static final  String STEG_PARTITION = "раздел";
	
	
	public static final String JPG = "jpg";
	public static final String JPEG="jpeg";
	public static final String PNG = "png" ;
	public static final String TIFF = "tiff"; 
	public static final String  BMP = "bmp";
	public static final String  GIF = "gif";
	public static final String IP01="IP01";
	public static final String IJ01="IJ01";
	
	public static final String[] JPGS = {JPG,JPEG,IJ01}; 
	public static final String[] PNGS = {PNG,IP01}; 
	public static final String[] TIFFS = {"tiff", "IT01"}; 
	public static final String [] BMPS = {"bmp", "IB01"};
	public static final String[]  GIFS = {"gif","IG01"};
   	
	public static final String JPG_EXTENSION = DOT+JPG;
	public static final String PNG_EXTENSION = DOT+PNG;
	public static final String TIFF_EXTENSION = DOT+TIFF;
	public static final String BMP_EXTENSION = DOT+BMP;
	public static final String GIF_EXTENSION = DOT+GIF;
	public static final String IP01_EXTENSION = DOT+ IP01;
	public static final String IJ01_EXTENSION=DOT + IJ01;


	
	public static final String  MP3 = "mp3"; 
	public static final String  MP4 = "mp4"; 
	public static final String  AVI = "avi"; 
	public static final String  FLV = "flv"; 
	public static final String WEBM = "webm"; 
	
	 public static String getMiliNumericTimeStamp()
	 {
		 return  new SimpleDateFormat("MMddyyyy_HHmmssSSS").format(Calendar.getInstance().getTime());
	 }
	 
	 public static String getSecNumericTimeStamp()
	 {
		 return  new SimpleDateFormat("MMddyyyy_HHmmss").format(Calendar.getInstance().getTime());
	 }
	 public static String getDayNumericTimeStamp()
	 {
		 return  new SimpleDateFormat("MMddyyyy").format(Calendar.getInstance().getTime());
	 }
	 public static String getAlphaNumericTimeStamp()
	 {
		 return new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z").format(Calendar.getInstance().getTime()); 
	 }

	public static String getEpochTimeStamp() 
	{

		Long timeSince = Instant.now().getEpochSecond(); //Long = 1450879900
		return timeSince.toString();
	}
		

}
