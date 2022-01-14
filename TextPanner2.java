import java.applet.*;
import java.awt.*;
import java.util.*;
import java.text.*;


/** Create an applet that displays marquee string on it */

public class TextPanner2 extends Applet implements Runnable{
	
	Thread th;
	  int x;
	  int width ;
	  String s="HELLO JAVA";
	public void init(){
		  x=0;
		th =new Thread(this);
		th.start();
	}
	
	public void paint (Graphics g){
            width = g.getFontMetrics().stringWidth(s);
			g.drawString(s, x, 250);
			
		
	}
	public void run(){
		while (true){
			
                  if(x>getWidth())
                     x=-width;
                     else 
                     x+=30;
			try{
                   th.sleep(500);  
             }
            catch(InterruptedException e)
			
			{
			e.printStackTrace();
			 }
			
		this.repaint();	
			
		}
		
		
		
}
	
	
	
}