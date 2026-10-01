import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter string: ");
        String name = sc.nextLine();

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int len = name.length() - 1;
        String rev = "";
        int reverse = 0;

        while (len >= 0 || num > 0) {

            // String reversal
            if (len >= 0) {
                rev = rev + name.charAt(len);
                len--;
            }

            // Number reversal
            if (num > 0) {
                int ld = num % 10;
                reverse = reverse * 10 + ld;
                num /= 10;
            }
        }

        System.out.println("Reverse string = " + rev);
        System.out.println("Reverse number = " + reverse);

        sc.close();
    }
}