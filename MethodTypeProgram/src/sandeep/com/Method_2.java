package sandeep.com;
public class Method_2
{
	static void Circleinfo(double r)
	{
		System.out.println("Radius is "+r);
		System.out.println("Area is "+3.141*r*r*r);
		System.out.println("Circumtances "+2*3.141*r);
	}
	public static void main(String[] args) 
	{
		System.out.println("MMS");
		Circleinfo(7.5);
		
		System.out.println("MMS");
		Circleinfo(5.6);
		
		System.out.println("MMS");
		Circleinfo(4.6);	
	}
}
/*
MMS
Radius is 7.5
Area is 1325.109375
Circumtances 47.115
MMS
Radius is 5.6
Area is 551.6098559999998
Circumtances 35.179199999999994
MMS
Radius is 4.6
Area is 305.73237599999993
Circumtances 28.897199999999998
*/