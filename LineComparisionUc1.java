package Test;

public class LineComparisionUc1 
{
	public static void main(String[] args) 
	{
		int x1=1;
		int y1=1;
		int x2=5;
		int y2=5;
		int x3=3;
		int y3=3;
		int x4=10;
		int y4=10;
		System.out.println("the cordinates of line 1 are");
		System.out.println("(" + x1 + "," + y1 + ")");
		System.out.println("(" + x2 + "," + y2 + ")");
		double length=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1))); 
				System.out.println("Length is" +length);
}
}