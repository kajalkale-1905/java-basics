package functions;
import java.util.Scanner;

public class funage {
    public static void printAge(int age){
         if(age>18){
            System.out.println("eligible to vote");
        } else{
            System.out.println("not eligible");
        }

    }
    
   
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
        printAge(age);
       sc.close();
    }
    
}

