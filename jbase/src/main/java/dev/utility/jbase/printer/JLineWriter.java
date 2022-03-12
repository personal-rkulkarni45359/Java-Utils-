package dev.utility.jbase.printer;

import dev.utility.jbase.constants.JConstants;

public class JLineWriter {

	public static final  int delimtLength= 50; 
	
	public static final String NEWLINE="\n"; 
	public static final String TAB= "\t"; 
	public static final String SPACE= " "; 

	
	public static final String DASH_1 = "*"; 
	public static final String DASH_2 ="="; 
	public static final String DASH_3="-"; 
	
	
	static String line;  

	public static final String TAB_0= ""; 
	public static final String TAB_1 = "\t"; 
	public static final String TAB_2 = "\t\t";
	
	public static String currentTAB = TAB_0; 
	public static String currentDASH = DASH_1;
	
	private final int DEFAULT_LENGTH = 83; 
	private int line_length; 
	private String requester;
	

	public JLineWriter(String requester)
	{
		this.requester = requester; 
		this.line_length= DEFAULT_LENGTH;
		
		
	}
	

	public  String  starLine()
	{
		
		currentDASH = "*"; 
		currentTAB = TAB_0; 
		writeDashText("");
		return printLine();
	}
	
	public String  starLine(String title)
	{
		currentDASH = "*"; 
		currentTAB = TAB_0;
		writeDashText(title);
		return printLine();

	}
	

	public String doubleDashLine(String title)
	{
		currentDASH = "="; 
		currentTAB = TAB_1; 
		writeDashText(title);
		return printLine();
	}
	public  String doubleDashLine()
	{
		
		currentDASH = "="; 
		currentTAB = TAB_1; 
		writeDashText("");
		return printLine();
	}
	
	
	public  String  singleDashLine(String title)
	{
		
		currentDASH = "-"; 
		currentTAB = TAB_2; 
		writeDashText(title);
		return printLine();
	}
	
	public String noTabLine(String text)
	{
		currentTAB = TAB_0;
		writeTabLine(text); 
		return printLine(); 
		
	}
	
	public String singleTabLine(String text)
	{
		currentTAB = TAB_1;
		writeTabLine(text); 
		return printLine(); 

	}
	public String doubleTabLine(String text) 
{
		currentTAB = TAB_2;
		writeTabLine(text); 
		return printLine(); 

}

public String centerTextLine(String text)
{
	
	 this.writeSpaceText(text);
	 return printLine();
	
}
	
	public  String  singleDashLine ()
	{
		
		currentDASH = "-"; 
		currentTAB = TAB_2; 
		writeDashText("");
		return printLine();

	}
	
	
	public String blankLine()
	{
		writeBlankLine(); 
		return printLine(); 
	}
	
	
	private void writeBlankLine()
	{
		for(int i = 0 ; i < this.line_length; i++)
		{
			append(" ");
		}
	}
	private void   writeTabLine(String title)
	{
		append(currentTAB);
		append( title);
	
	}
	private void   writeDashText(String title)
	{
		
		int lossHalf = title.length() /2; 
		int dashChunk = line_length/2 - lossHalf;
		
		append(NEWLINE); 
		for(int i = 0; i< dashChunk; i++)
			append(currentDASH);
		append(title);		
		for(int i = 0; i<dashChunk; i++)
			append(currentDASH);

	}
	
	
	private void   writeSpaceText(String title)
	{
		
		int lossHalf = title.length() /2; 
		int dashChunk = line_length/2 - lossHalf;
		
		append(NEWLINE); 
		for(int i = 0; i< dashChunk; i++)
			append(" ");
		append(title);		
		for(int i = 0; i<dashChunk; i++)
			append(" ");

	}
	

	private String printLine()
	{
		String returnLine = line; 
		line ="";
		
		return returnLine; 
	}
	
	private void append(String s)
	{
		line = line + s;
	}

}
