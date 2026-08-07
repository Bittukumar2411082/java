public class sumofnumanddivisibleby7 {
    public static void main(String[] args){
        int sum =0;
        System.out.println("number between 100 and 200 and divisible by 7 ");
        for(int i=101;i<200;i++){
            if(i%7==0){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("sum="+sum);

    }
}
