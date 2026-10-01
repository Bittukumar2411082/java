import java.util.Scanner;
public class numberofpositive{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number to check wether number is +ve/-ve or zero:");
        int num=sc.nextInt();
        if(num>0){   
            System.out.println("it is positive");
        }
        else if(num<0){
            System.out.println("it is negative");
        }
        else{
            System.out.println("it is zero");
        }
        sc.close();
    }
    
}
