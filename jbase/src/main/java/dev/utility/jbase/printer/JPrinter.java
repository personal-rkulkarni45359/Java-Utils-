package dev.utility.jbase.printer;

import dev.utility.jbase.constants.JConstants;

public class JPrinter {
	
	
	

	public static final  int delimtLength= 50; 
	public static final String NEWLINE="\n"; 
	public static final String TAB= "\t"; 
	public static final String DASH_1 = "*"; 
	public static final String DASH_2 ="="; 
	public static final String DASH_3="-"; 
	static String w=""; 

	public static final String TAB_0= ""; 
	public static final String TAB_1 = "\t"; 
	public static final String TAB_2 = "\t\t";
	public static final String TAB_3 = "\t\t\t"; 
	
	public static String currentTAB = TAB_0; 
	public static String currentDASH = DASH_1; ; 
	
	protected final int DEFAULT_LENGTH = 83; 
	
	private int line_length; 
	private String requester;
	boolean include_time = false; 
	private boolean verbose; 
	
	

	public JPrinter(String requester)
	{
		this.requester = requester; 
		this.verbose = false; 
		this.line_length= DEFAULT_LENGTH;
		
		
	}
	
	public JPrinter(String requester, boolean verbose)
	{
		this.line_length = 83; 
		this.requester = requester; 
		this.verbose = verbose; 
		
		
	}
	
	
	public JPrinter(String requester, int lineLength)
	{
		this.requester = requester; 
		this.line_length= lineLength;
		this.verbose = false; 

		
		
	}
	
	
	public JPrinter(String requester, int lineLength,boolean verbose)
	{
		this.requester = requester; 
		this.line_length= lineLength;
		this.verbose = verbose; 	
	}


	public void write(String str)
	{
		w = w  +str; 

	}
	
	public static void print()
	{
		System.out.print(w); 
	}
	

	
	public void writeln(String str)
	{
		if(!verbose)
			w = w + currentTAB + str + NEWLINE; 
		else
		{
			w = w + JConstants.getAlphaNumericTimeStamp() + "\n";
			w = w + currentTAB +this.requester +NEWLINE;
			w = w + currentTAB+ str +NEWLINE;
			
		}
	}

	public void addCurrentDash() 
	{
		writePreformat("");
	}
	public void genEnd()
	{
		writePreformat("END"); 
	}
	
	public void  writeTab_0(String title)
	{
		currentDASH = "*"; 
		currentTAB = TAB_0;
		writePreformat(title);
	}
	
	public void writeTab_1(String title)
	{
		currentDASH = "="; 
		currentTAB = TAB_1; 
		writePreformat(title);
	}
	
	public  void  writeTab_2(String title)
	{
		
		currentDASH = "-"; 
		currentTAB = TAB_2; 
		writePreformat(title);
	}
	
	public  void  writeTab_1()
	{
		
		currentDASH = "="; 
		currentTAB = TAB_1; 
		writePreformat("");
	}
	
	public  void  writeTab_0()
	{
		
		currentDASH = "*"; 
		currentTAB = TAB_0; 
		writePreformat("");
	}
	
	public  void  writeTab_2()
	{
		
		currentDASH = "-"; 
		currentTAB = TAB_2; 
		writePreformat("");
	}
	
	
	private void  writePreformat(String title)
	{
		
		int lossHalf = title.length() /2; 
		int dashChunk = line_length/2 - lossHalf;
	
		
		write(NEWLINE); 
		for(int i = 0; i< dashChunk; i++)
			write(currentDASH);
		write(title);		
		for(int i = 0; i<dashChunk; i++)
			write(currentDASH);
		write(NEWLINE);

	}
	
	

	
	public void publish(String str)
	{
		System.out.print(str);
	}

}
