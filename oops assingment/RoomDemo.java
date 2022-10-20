import java.util.Scanner;
class Room
{
	double height;
	double width;
	double breadth;
	
	void DisplayVolume()
	{
	  double volume =height*width*breadth;
		System.out.println("Volume of room: "+volume);
	}
	
	void AcceptTheDimention()
	{
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the height of room");
         height=sc.nextDouble();
		 System.out.println("Enter the width of Room");
         width=sc.nextDouble();
		 System.out.println("Enter the breadth of Room");
         breadth=sc.nextDouble();

	}
	
}
public class RoomDemo
{
	public static void main (String args[])
	{
		Room r1= new Room();
		
		
		r1.AcceptTheDimention();
		r1.DisplayVolume();
	}
}