import java.util.Scanner;
class Rec{
     double width,height;
     Rec()
     {
           width =1;
           height =1;
     }
     Rec(Double w,Double h)
     {
           width =w;
           height =h;
     }
     void getArea()
     {
           System.out.println("Area of Rectangle :"+ (width*height));
     }
     void getPerimeter()
     {
           System.out.println("Area of Perimeter:"+(2*(width + height)));
     }
    
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
	  System.out.println("250393107006");
          System.out.println("Enter width value:");
		double a= sc.nextDouble();
          System.out.println("Enter height value :");
	        double b= sc.nextDouble();
          Rec obj1=new Rec();
          obj1.getArea();
          obj1.getPerimeter();
          Rec obj2=new Rec(a,b);
          obj2.getArea();
          obj2.getPerimeter();
     }
}
          
 
           