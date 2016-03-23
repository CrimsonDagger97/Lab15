// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15st extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5, picture6, picture7, picture8, picture9;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"ZILLA.gif");
		picture2 = getImage(getDocumentBase(),"NORWAY.jpg");
		picture3 = getImage(getDocumentBase(),"ME.jpg");
		picture4 = getImage(getDocumentBase(),"VTHS.jpg");
		picture5 = getImage(getDocumentBase(),"VIKING.jpg");
		picture6 = getImage(getDocumentBase(),"SHINE.jpg");
		picture7 = getImage(getDocumentBase(),"mkx.gif");
		picture8 = getImage(getDocumentBase(),"JEP.jpg");
		picture9 = getImage(getDocumentBase(),"CE.jpg");

		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		tracker.addImage(picture6,1);
		tracker.addImage(picture7,1);
		tracker.addImage(picture8,1);
		tracker.addImage(picture9,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
			case 5 : page6(g); break;
			case 6 : page7(g); break;
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"TITLE PAGE",218,100);/*
		Expo.setColor(g,Expo.yellow);
		Expo.drawThickPreciseSpiral(g,510,370,275,50,15);
		Expo.setColor(g,Expo.red);
		Expo.fillStar(g,510,370,175,8);
		Expo.setColor(g,Expo.green);
		Expo.drawThickStar(g,510,370,225,8,25);
		Expo.setColor(g,Expo.blue);
		Expo.drawThickStar(g,510,370,275,8,25);*/
		g.drawImage(picture1,150,100,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.BOLD,20);
		Expo.drawString(g,"My name is Lucas Rotun.",35,50);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 2",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,100,250,900,550
				);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,200,250,this);
		g.drawImage(picture4,500,255,this);
		Expo.setColor(g,Expo.black);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in America in 1999 and started to attend Vernon Township Hghschool in 2013",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page3(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 3",200,100);
		Expo.setColor(g,Expo.fuschia);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		g.drawImage(picture2,100,200,this);
		g.drawImage(picture5,500,193,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My heritage consists of mostly Norwegian but I am also Irish, German, and English",100,150);
		Expo.drawString(g,"So I'm basically a viking",100,175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page4(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 4",200,100);
		Expo.setColor(g,Expo.darkCyan);
		Expo.fillRoundedRectangle(g,150,200,430,450,50);
		g.drawImage(picture6,100,200,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I like music",100,150);
		Expo.drawString(g,"I prefer hard rock",100,175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	public void page5(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 5",200,100);
		Expo.setColor(g,Expo.magenta);
		g.drawImage(picture7,265,200,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I like video games",100,150);
		Expo.drawString(g,"I prefer violent ideogames such as Mortal Kombat",100,175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page6(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 6",200,100);
		Expo.setColor(g,Expo.crimson);
		Expo.fillRoundedRectangle(g,150,200,430,450,50);
		g.drawImage(picture8,150,200,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I have a 1989 Jeep Wrangler",100,150);
		Expo.drawString(g,"It doesn't run at all.",100,175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page7(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 7",200,100);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture9,100,275,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I want to be a Civil Engineer",100,150);
		Expo.drawString(g,"My back up plan is to have my dad get me into plumbing.",100,175);
		Expo.drawString(g,"Click once to continue.",750,550);
	}



}

