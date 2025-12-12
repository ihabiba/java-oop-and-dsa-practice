public class labWeek7


{   
    int num1 = 10;
	 int num2 = 20;
	 int sum;
	 String name = "Habiba";
    public static void main(String args[])
	 {
		labWeek7 obj = new labWeek7();  //creating an object
		System.out.println(obj.num1);
		obj.sum = obj.num1 + obj.num2;
		System.out.println(obj.sum);
		multiply();
		System.out.println(obj.name);
		System.out.println(obj.name.length());
		
	 }
 
    
	 public static void multiply()
	 {
	   labWeek7 obj = new labWeek7();  //creating an object
	   int result = obj.num1 * obj.num2;
		System.out.println(result);
	 }


}