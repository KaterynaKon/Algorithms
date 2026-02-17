import java.math.BigInteger;

public class RecursionEx1 {
    public static void main(String[] args) {
        int n = 100000;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            if (n == 0 || n == 1)
                fact = 1;
            else {
                fact = fact * i;
            }

        }
        System.out.println(fact);
        System.out.println(recLab(n));
    }



    public static BigInteger recLab(int n){
            if(n==0||n==1)
                return BigInteger.ONE;
        return
               BigInteger.valueOf(n).multiply(recLab(n-1));
        }




    }

