package Fibonacci;

public class FibonacciOf {
    public static void main(String[] args){
        int n = 200;
        long n1 = 1,n2=1,sum=0;
        for (int i=0,c=1;i<n;i++,c++){
            if (i==0||i==1){
                System.out.printf("%-10d",n1);
            }else{
                sum=n1+n2;
                System.out.printf("%-10d",sum);
                n1=n2;
                n2=sum;
            }
            if(c%5==0)
                System.out.println();
        }

    }
}
