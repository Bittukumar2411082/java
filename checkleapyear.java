import java.util.Scanner;
public class checkleapyear{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter year:");
        int year=sc.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
           System.out.println("it is leap year");
        }
        else{
            System.out.println("it is not leap ");
        }

        sc.close();
    }
    
}
