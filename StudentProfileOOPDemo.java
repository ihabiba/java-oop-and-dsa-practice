public class labWeek8 {
    private String name;
    private int age;
	  int mark;

    public static void main(String[] args) {
        // Creating an instance of labWeek8 using the constructor
        labWeek8 obj = new labWeek8("Habiba", 32);
		  
    }

    // Default constructor
    public labWeek8() {
	 mark =50;

    }

    // Parameterized constructor
    public labWeek8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}
