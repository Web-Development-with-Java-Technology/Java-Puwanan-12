import java.util.Scanner;

public class CalculateNumber {
    public static void main(String[] args){
        System.out.print(">>Enter your number A : ");
        Scanner sc1 = new Scanner(System.in);
        int x = sc1.nextInt();

        System.out.print(">>Enter your number B : ");
        Scanner sc2 = new Scanner(System.in);
        int y = sc2.nextInt();

        sc1.close();
        sc2.close();

        System.out.println("----------------------------");
        System.out.println("**RESULT**");
        System.out.println("A+B = " + (x+y));
        System.out.println("A-B = " + (x-y));
        System.out.println("A*B = " + (x*y));
        System.out.println("A/B = " + (x/y));
    }
}
