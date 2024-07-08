import java.util.Scanner;
public class StudentGradeCalculator{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("StudentGradeCalculator");
    System.out.println("Enter no.of subjects");
    int nS=sc.nextInt();
    int total=0;
    for(int i=1;i<=nS;i++){
      System.out.println("Enter marks obtained in "+i+":");
      int marks=sc.nextInt();
      total=total+marks;
    }
    double averP=(double)total/nS;
    char Grade;
    if(averP>=90){
      Grade='O';
    }
    else if(averP>=80){
      Grade='A';
    }
    else if(averP>=70){
      Grade='B';
    }
    else if(averP>=60){
      Grade='C';
    }
    else if(averP>=50){
      Grade='D';
    }
    else if(averP>=40){
      Grade='E';
    }
    else{
      Grade='F';
    }
    System.out.println("Grade is "+Grade);
  }
}