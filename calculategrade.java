import java.util.Scanner;
public class calculategrade {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.print("enter marks:");
         int marks=sc.nextInt();
         if(marks>=80&&marks<=100){
            System.out.print("grade is A+");
         }
         else if(marks>=70&&marks<=79){
            System.out.println("grade is A");
         }
          else if(marks>=40&&marks<=69){
            System.out.println("grade is c");
         }
         else{
            System.out.println("fail");
         }
         sc.close();
    }
}
