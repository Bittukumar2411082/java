import java.util.Scanner;
public class result {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.print("enter marks sub 1:");
         int sub1=sc.nextInt();
          System.out.print("enter marks sub 2:");
         int sub2=sc.nextInt();
           System.out.print("enter marks sub 3:");
         int sub3=sc.nextInt();
           System.out.print("enter marks sub 4:");
         int sub4=sc.nextInt();
           System.out.print("enter marks sub 5:");
         int sub5=sc.nextInt();
         int sum=sub1+sub2+sub3+sub4+sub5;
         double per=(sum*100)/500;
         System.out.println("total_marks="+sum);
          System.out.println("percentage="+per);
          if(per>=81&&per<=100){
            System.out.println("grade is A");
          }
          else if(per>=71&&per<=80){
            System.out.println("grade is B");
          }
          else if(per>=61&&per<=70){
            System.out.println("grade is C");
          }
          else if(per>=33&&per<=60){
            System.out.println("grade is D");
          }
          else{
            System.out.println("fail");
          }
         sc.close();
    }
}
