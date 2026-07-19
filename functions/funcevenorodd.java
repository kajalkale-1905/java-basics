package functions;
import java.util.*;
public class funcevenorodd {
    public static void printEvenOdd(int n){
        System.out.println(n);
        return;   
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        
        if(n%i==0)
            System.out.println(n + "is even");
        else
            System.out.println(n + "is odd");
        
    }

}