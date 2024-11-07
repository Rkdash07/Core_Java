package day4;

public class Marks_Catergory {
   public static void main(String args[]) {
	   int marks=25;
	   if(marks>=81 && marks<=100)
	   {
		   System.out.println("DISTINCTION");
	   }
	   else if(marks>=51 && marks<=80)
	   {
		   System.out.println("FIRST CLASS");
	   }
	   else if(marks>=35 && marks<=50)
	   {
		   System.out.println("SECOND CLASS");
	   }
	   else if(marks>=0 && marks<=34)
	   {
		   System.out.println("FAIL");
	   }
	   else
	   {
		   System.out.println("Marks is not in the range \n Please provide a valid input!!");
	   }
   }
}
