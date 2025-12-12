public class Rectangle {
   private double length;
   private double width;
     
   public Rectangle(double L, double W)  {
       this.length = L;
       this. width = W;
   }
	
   public double getLength() {
       return length;
   }
	" 
   public double getWidth() {
       return width;
   }
	
   public double area() {
       return length * width;
   }
	
   public String toString() {
     return "length = " + length + "\n" + "width = " + width;
   }

} // end for Rectangle class



class Box extends Rectangle
{
    private double height;
     
    public Box(double L, double W, Double H){
       super(L,W);   //it calls a constructor not a method
       height = H;
    }
	 
         public double getHeight(){
       return height;
    }
	 
    public double area() {
       return  2  * (getLength() * getWidth() + getLength() * height 
	+ getWidth() * height);
    } 
	 
    public double volume() {
       return super.area() * height;
    }
	 
    public String toString(){
      return super.toString () + "height = " + height;
    }

} // end for class Box extends
