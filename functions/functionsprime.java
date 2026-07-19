import java.util.*;
public class functionsprime {
    public static void printPrime(int n){
        System.out.println(n);
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(i< n){
            if(n%i==0)
                break;
            i++;
        }
        if(i==n)
            System.out.println(n + "is prime");
        else
            System.out.println(n + "is not prime");
        
    }
    
}
