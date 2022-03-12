package dev.utility.jbase.printer;

import java.util.ArrayList;

import dev.utility.jbase.constants.JConstants;

public class JBlockWriter {

	private String requester; 
	private String titleBlock = ""; 
	private String descriptionBlock = ""; 
	private String optionsBlock =""; 
	private int optionCounter;
	private final int LINE_LENGTH = 84; 
	JLineWriter lineWriter; 
 
	public JBlockWriter(String requester)
	{
		this.requester = requester; 
		this.lineWriter = new JLineWriter(requester);
		optionCounter =0; 
	}
	
	public void createTitleBlock(String title)
	{
		titleBlock = lineWriter.starLine();
		String temp = "Program Name: " + title; 
		titleBlock = titleBlock +lineWriter.centerTextLine(temp);
		temp = "Author: r4770"; 
		titleBlock = titleBlock +  lineWriter.centerTextLine(temp);
		temp = "Date: " + JConstants.getAlphaNumericTimeStamp();
		titleBlock = titleBlock +  lineWriter.centerTextLine(temp);
		temp = "Program Language: java jdk 13";
		titleBlock = titleBlock +  lineWriter.centerTextLine(temp);
		titleBlock =titleBlock + lineWriter.starLine() +JConstants.NEWLINE;
		titleBlock =titleBlock +JConstants.NEWLINE;

	}
	
	
	public void createDescriptionBlock(String description) 
	{
		descriptionBlock = lineWriter.doubleDashLine("");
		descriptionBlock = descriptionBlock + "\nProgram Description:\n ";
		int length = description.length(); 
		for(int i = 0; i <  length ; i++) 
		{
			if(i % LINE_LENGTH == 0)
				descriptionBlock = descriptionBlock + JConstants.NEWLINE;
			descriptionBlock = descriptionBlock + description.charAt(i); 
		}
		descriptionBlock = descriptionBlock + lineWriter.doubleDashLine("");
	}
	
	public String getDescriptionBlock()
	{
		return this.descriptionBlock; 
	}
	public String getTitleBlock()
	{
		return this.titleBlock;
	}
	
	public void createOptionMenu(String[] options)
	{
		optionsBlock = lineWriter.singleDashLine("Program Options") + JConstants.NEWLINE;
		
		for(int i = 0; i <options.length ; i++)
		{
			optionsBlock = optionsBlock +options[i] +JConstants.NEWLINE;
		}
		optionsBlock =optionsBlock + lineWriter.singleDashLine("") +JConstants.NEWLINE;
		optionsBlock = optionsBlock + ">";

	}
	
	public String getOptionsMenu()
	{
		return optionsBlock; 
	}
}
