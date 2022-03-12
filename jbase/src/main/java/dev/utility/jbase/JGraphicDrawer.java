package dev.utility.jbase;

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class JGraphicDrawer 
{

	public static final Object 	ALPHA_INTERPOLATION_DEFAULT = RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT;
	public static final Object 	ALPHA_INTERPOLATION_QUALITY = RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY;
	public static final Object 	ALPHA_INTERPOLATION_SPEED = RenderingHints.VALUE_ALPHA_INTERPOLATION_SPEED;
	
	public static final Object 	ANTIALIAS_DEFAULT = RenderingHints.VALUE_ANTIALIAS_DEFAULT;
	public static final Object 	ANTIALIAS_OFF = 	RenderingHints.VALUE_ANTIALIAS_OFF;
	public static final Object 	ANTIALIAS_ON = 		RenderingHints.VALUE_ANTIALIAS_ON;

	public static final Object 	COLOR_RENDER_DEFAULT = RenderingHints.VALUE_COLOR_RENDER_DEFAULT;
	public static final Object 	COLOR_RENDER_QUALITY = RenderingHints.VALUE_COLOR_RENDER_QUALITY;
	public static final Object 	COLOR_RENDER_SPEED =   RenderingHints.VALUE_COLOR_RENDER_SPEED;
	
	public static final Object 	DITHER_DEFAULT = RenderingHints.VALUE_DITHER_DEFAULT;
	public static final Object 	DITHER_DISABLE = RenderingHints.VALUE_DITHER_DISABLE;
	public static final Object 	DITHER_ENABLE =  RenderingHints.VALUE_DITHER_ENABLE;
	
	public static final Object 	FRACTIONALMETRICS_DEFAULT = RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT;
	public static final Object 	FRACTIONALMETRICS_OFF = 	RenderingHints.VALUE_FRACTIONALMETRICS_OFF;
	public static final Object 	FRACTIONALMETRICS_ON =		RenderingHints.VALUE_FRACTIONALMETRICS_ON;

	public static final Object 	INTERPOLATION_BICUBIC = 	RenderingHints.VALUE_INTERPOLATION_BICUBIC;
	public static final Object 	INTERPOLATION_BILINEAR = 	RenderingHints.VALUE_INTERPOLATION_BILINEAR;
	public static final Object 	INTERPOLATION_NEAREST_NEIGHBOR= RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;

	public static final Object 	RENDER_DEFAULT =	RenderingHints.VALUE_RENDER_DEFAULT;
	public static final Object 	RENDER_QUALITY =    RenderingHints.VALUE_RENDER_DEFAULT;
	public static final Object 	RENDER_SPEED =  	RenderingHints.VALUE_RENDER_DEFAULT;

	public static final Object 	STROKE_DEFAULT = 	RenderingHints.VALUE_STROKE_DEFAULT;
	public static final Object 	STROKE_NORMALIZE =  RenderingHints.VALUE_STROKE_NORMALIZE;
	public static final Object 	STROKE_PURE =		 RenderingHints.VALUE_STROKE_DEFAULT;
	
	public static final Object 	TEXT_ANTIALIAS_DEFAULT = 	RenderingHints.VALUE_ANTIALIAS_DEFAULT;
	public static final Object 	TEXT_ANTIALIAS_GASP = 		RenderingHints.VALUE_TEXT_ANTIALIAS_GASP;
	
	
	
	  public static final  Object  ALPHA_COMPOSITE_DST =   	 AlphaComposite.DST ; 
	  public static final Object  ALPHA_COMPOSITE_DST_ATOP = AlphaComposite.DST_ATOP;
	  public static final Object  ALPHA_COMPOSITE_DST_OUT =  AlphaComposite.DST_OUT;
	
	  public static final Object  ALPHA_COMPOSITE_SRC = AlphaComposite.Src;
	  public static final Object  ALPHA_COMPOSITEDST_SRC_ATOP = AlphaComposite.SrcAtop; 
	  public static final Object  ALPHA_COMPOSITE_SRC_OUT = AlphaComposite.SRC_OUT;

	BufferedImage sourceImage;
	Graphics2D g2d; 
	
	public JGraphicDrawer(BufferedImage image)
	{
		sourceImage = image; 
		g2d = (Graphics2D) sourceImage.createGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 		 RenderingHints.VALUE_ANTIALIAS_DEFAULT);
		g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, 	 RenderingHints.VALUE_COLOR_RENDER_DEFAULT);
		g2d.setRenderingHint(RenderingHints.KEY_DITHERING, 			 RenderingHints.VALUE_DITHER_DEFAULT);
		g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS,   RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT);
		g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,		 RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT);
		g2d.setRenderingHint(RenderingHints.KEY_RENDERING, 			 RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, 	 RenderingHints.VALUE_STROKE_DEFAULT);
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,   RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT );
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_LCD_CONTRAST,   RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT);
		g2d.setComposite(AlphaComposite.Src);

	}
	
	public void setInterpolation(Object param)
	{
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_DEFAULT);
	

	}
	
	public Graphics2D getConfiguredGraphics() 
	{
		return g2d;
	}
	
    

	
	

}
