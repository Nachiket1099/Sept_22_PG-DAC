class Box 
{
	double height;
	double width;
	double breadth;
	
	double getvolume()
	{
		double volume=height*breadth*width;
		System.out.println("Volume= "+volume);
		return volume ;
		
	}
	double getarea()
	{
		double area=2*(breadth*width+height*breadth+width*height);
		System.out.println("area= "+area);
		return area ;
	}
	Box ()
	{
		
	}
	
	Box(double height,double width,double breadth)
	{
		this.height=height;
	    this.width= width;
	    this.breadth=breadth;
		
	}	
}

public class BoxDemo
{
public static void main (String args[])
{
	Box b1=new Box(20.0,40.0,60.0);
	Box b2=new Box(30.0,50.0,70.0);
	
	b1.getvolume();
	b1.getarea();
	
	b2.getvolume();
	b2.getarea();
	
	
	
	
}	
}