public class LabWeek6

{
    static int sum;
    public static void main (String args[])
	 {
	 
	    display();
		 CalculateArea();
		 addTwoNums();
		 sum = sum + 100;
		 System.out.println(sum);
		 addTwoNums(10, 20);
		 addTwoNums(10, 100);
		 double a = CalculateArea(10);
		 System.out.println(a);
		 String result =  grade(60);
		 System.out.println(result);


	 
	 }//main
    
	 
	 public static void display()
	 {
	 
	    System.out.println("My name is Habiba");
		 
		 
	 }//display
	 
	 
	  public static void CalculateArea()
	  {
		 int radius = 5;
		 double pi = 3.14;
		 double area = pi *(radius*radius);
		 System.out.println("The area = "+area);
		  
	  }//calcu
	  
	  
	   public static void addTwoNums()
		{
		  int num1 = 10;
		  int num2 = 20;
		  sum = num1 + num2;
		  System.out.println(sum);
		
		}//add
		
		
		 public static void addTwoNums(int a, int b)
		 {
		    sum = a + b;
			 System.out.println(sum);
		 }//addpara
		 
		 public static double CalculateArea(int r)
		 {
		     double area = 3.143 *(r*r);
			  return area;
		 }//calcupara
		 
		 
		 public static String grade(int mark)
		 {
		 
		    String gr;
		    if (mark > 50)
			    gr= "passs";
			 
			 else
			    gr = "fail";	 
		 
		 
		    return gr;
		 }





}//class