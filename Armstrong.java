import java.util.*;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int n = num;
        int sum=0;
        while (n>0){
            sum += (n%10)*(n%10)*(n%10);
            n=n/10;
        }
        if (sum==num)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
