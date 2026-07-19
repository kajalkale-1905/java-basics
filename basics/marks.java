package basics;

import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number '1'or'0' ");
        int n =sc.nextInt();
           System.out.println("enter the number marks");
        int marks=sc.nextInt();
        if(n==1){
            
            if(marks>90){
                System.out.println("this is good");
            }else if(marks<=89 && marks>=60){
                System.out.println("this is also good");

            }else if (marks<=59 && marks>=0){
                 System.out.println("this is good as well");

            }
        }else{
                System.out.println("stop");
                 sc.close();
            }

        
          
    }
}