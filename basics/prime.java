package basics;

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();
        for (int i=1;i<=number;i++){
            if(number%i==0){
                System.out.println("prime");

            }else{
                System.out.println("not prime");
                 sc.close();

            }
        }

        
    }

    
}