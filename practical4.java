import java.util.Scanner;
class practical4
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the weight in pounds:");
    Double weightpounds=sc.nextDouble();
    
    System.out.println("Enter the height in inches");
    Double heightinches=sc.nextDouble();

     double weightKg= weightpounds* 0.45359237;
     double heightmeter=  heightinches* 0.0254;
 
    Double BMI = weightKg /  ( heightmeter * heightmeter);

    System.out.println("BMI = "+ BMI);
sc.close();
}
}
  
  