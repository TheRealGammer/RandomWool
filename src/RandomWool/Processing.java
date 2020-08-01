package RandomWool;

import processing.core.PApplet;

public class Processing extends PApplet
{
	public void setup()
	{
		this.surface.setTitle("Random Wool");
	}
	public void draw()
	{
		
	}
	public void settings()
	{
		this.size(800, 600);
	}
}
class Main
{
	public static void main(String[] args)
	{
		PApplet.main("RandomWool.Processing");
	}
}