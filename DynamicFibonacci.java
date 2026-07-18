import java.util.*;
public class DynamicFibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        int[] f=new int[n+1];

        for(int i=0;i<=n;i++){
            f[i]=a;
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println("The output is --> "+f[n]);
    }
}