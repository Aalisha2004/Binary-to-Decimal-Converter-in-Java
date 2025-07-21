import java.util.*;

public class binToDec {
    public static void BinDec(int n){
        int num=n;
        int pow=0;
        int dec=0;

        while(n>0){
            int lastDigit=n%10;
            dec=dec+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("decimal of "+num+"="+dec);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();

        BinDec(n);
    }
}
