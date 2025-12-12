public class TestInheritance
{
     public static void main(String []args)
	   {
	            Rectangle objRec = new Rectangle (6, 5);	
	            System.out.println(objRec);
	            System.out.println(" Area of Rectangle = " + objRec.area());

               Box objBox = new Box(5.0, 4.0, 2.0);
	            System.out.println(objBox);
	            System.out.println(" Area of Box = " + objBox.area());
	            System.out.println(" Volume of Box = " + objBox.volume());
					
    }

} // end for class Box extends

