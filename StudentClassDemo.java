public class Student
{// lab week 9
  private String name;
  private int score;
  private char gender;
  private Student [] student;
  
  public Student (String name, int score, char gender)
  {
    this.name = name;
	 this.score = score;
	 this.gender = gender;
  }
  
  public String getName()
  {
    return name;
  }
  
  public int getScore()
  {
    return score;
  }
  
  public char getGender()
  {
    return gender;
  }

}