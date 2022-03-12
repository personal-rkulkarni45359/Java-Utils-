package dev.utility.jimage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import dev.utility.jimage.JImage;

public class JImageDisplayer {
	
	private JImage originalImage; 
	private JImage displayImage;
	private JPanel imagePanel;
	private JScrollPane imagePane; 
	private JLabel imageLabel; 
	
	
	
	
	public static void main(String[] args)
	{
		
		JImageDisplayer panel = new JImageDisplayer("/home/r4770/Desktop/null.png"); 
		JFrame frame = new JFrame(); 
		JScrollPane imagePane= panel.getImagePane(); 
		frame.add(imagePane); 
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		
		panel.setWidth(2000);
	
	
		
		
	}
	
	public JImageDisplayer(String sourceImage)
	{
		initialize(new JImage(sourceImage)); 
	}
	
	public JImageDisplayer(JImage sourceImage)
	{
		initialize(sourceImage); 
	}

	private void initialize(JImage sourceImage)
	{
		this.originalImage = sourceImage; 
		this.displayImage= new JImage(sourceImage);
		imagePanel = new JPanel(); 
		imageLabel= new JLabel();
		 imagePane= new JScrollPane(imagePanel); 

		updateImage(); 
	}
	public JScrollPane getImagePane()
	{
		return imagePane;
	}
	
	
	private void updateImage()
	{
		
	
		imageLabel.setIcon(displayImage.getImageIcon());
		imagePanel.add(imageLabel); 
		imagePanel.repaint(); 
		imagePanel.revalidate();
		

		
		imagePane.repaint(); 
		imagePane.revalidate();

		
	}
	
	public void enlarge()
	{
		displayImage= this.originalImage;
		displayImage.scaleAuto(displayImage.getWidth()+50,displayImage.getHeight()+ 50);
		updateImage(); 
		
	}
	
	public void shrink()
	{
		displayImage= this.originalImage;
		displayImage.scaleAuto(displayImage.getWidth()-50,displayImage.getHeight()- 50);
		updateImage(); 
		
	}
	public void setWidth(int width) 
	{
		displayImage= this.originalImage;
		displayImage.scaleWidth(width);
		updateImage(); 
	}
	
	
	public void scaleHeight(int height) 
	{
		displayImage= this.originalImage;
		displayImage.scaleWidth(height);
		updateImage(); 
	}
	
	
}
