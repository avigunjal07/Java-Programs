import java.util.*;
public class PrimeNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num=sc.nextInt();

        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("\n Number is Prime!");
        }
        else {
            System.out.println("\n Number is not Prime!");
        }
    }
}