import java.util.Scanner;

public class funcircumcircle {
    public static void printCircum(int r){
        System.out.println(2*3.14*r);
    }
    
   
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        printCircum(r);
       sc.close();
    }
    
}
