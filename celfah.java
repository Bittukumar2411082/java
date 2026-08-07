import java.util.Scanner;
public class celfah {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double fahrenheit,celsius;
        System.out.print("enter temperature infahrenheit:");
        fahrenheit=sc.nextDouble();
        celsius=(fahrenheit-32)*5/9;
        System.out.println("temperature in celsius="+celsius);
        sc.close();
    }
}
