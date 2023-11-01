import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args){
         System.out.println("Nakhon Pathom Vocational College");
         System.out.println("Name : Puwanan Sangaunpan");
         System.out.println("Nickname : Tan");
         System.out.println("Student ID : 65309010015");
         System.out.println("------------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        System.out.print(">>Enter your GPA : ");
        int x = sc.nextInt();
        sc.close();

        System.out.println("Result GPA : " + x);

        System.out.print("Grade = ");
        
	  
      if(x>=80)
         System.out.println("A");
      else if(x>=70 && x<79)
         System.out.println("B");
      else if(x>=60 && x<69)
         System.out.println("C");
      else if(x>=50 && x<59)
         System.out.println("D");
      else
         System.out.println("F");
    
        System.out.print("---------------THANK-YOU-----------------");
    
    
        } 
        
}
