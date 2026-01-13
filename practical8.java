class practical8{
   
     public static void main(String args[]){
            
             if (args.length < 2) {
                      System.out.println("Please provide two numbers as command-line arguments.");
            }
 

            int a=Integer.parseInt(args[0]);
            System.out.println(a);
            int b=Integer.parseInt(args[1]);
            System.out.println(b);

            int c=a+b;
            System.out.println("c:" + c);
            
    }       
    
}