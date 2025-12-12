public class studentList
{
  private int counter;
  private Student [] student;


  public studentList(int size)
  {
   student = new Student[size];
   counter = 0;
  }
  
  public void addRecord(String name, int score, char gender)
  {
    student[counter] = new Student(name, score, gender);
	 counter++;
  }

  public void displayRecord()
  {
    for(int i=0; i<counter; i++){
	   System.out.println("\n Name = " +student[i].getName());
		System.out.println("score = " +student[i].getScore());
		System.out.println("gender = " +student[i].getGender());
	 }
  
  }
}

