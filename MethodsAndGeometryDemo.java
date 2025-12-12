public class Habiba
{    
     static int length = 6, width = 10;

     public static void main(String args[])
    {
        
       display(); 
		 line();
		 FindAreaOfRect();
		 FindVolume();
		 ShowMessage("Pass");
        
    }//main
    
    public static void display()
	 {
	 
		 System.out.println("hello world");
	    line();
	 
	 }//display
	 
	 public static void line()
	 {
	 
	    System.out.println("my name is Habiba");

	 }//line
	 
	 public static void FindAreaOfRect()
	 {
	    int area = length * width;
	    System.out.println("The area = " +area);
	 }
	 
	 public static void FindVolume()
	 {
		int hight = 7;
		int volume = length * width * hight;
		System.out.println("The volume = " +volume);
	 }
    
	 public static void ShowMessage(String msg)
	 {
	   System.out.println(msg);

	 }

	 
}//class