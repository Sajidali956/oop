class Rect
{
 double width,height;

 double getArea()
 {
  
   return (width * height);
 }
 
 double getPerimeter()
 {
   return (2*(width+height));
 }
 
public static void main (String arg[])

  {
	System.out.println("250393107006"); 	

	Rect r1= new Rect();
	r1.width=4.0;
        r1.height=40;
	System.out.println("Area of Rectangle1: " +r1.getArea());
	System.out.println("Perimeter of Rectangle1: " +r1.getPerimeter());

	Rect r2 = new Rect();
	r2.width= 3.5;
        r2.height= 35.9;
	System.out.println("Area of Rectangle2: " +r2.getArea());
	System.out.println("Perimeter of Rectangle2: " +r2.getPerimeter());
     
	if(r1.getArea()>r2.getArea())
	{
           System.out.println("r1 is Greater");
	}
	else
	{
 	  System.out.println("r2 is Greater");
	}
  }
}
      
