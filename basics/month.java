package basics;

import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number from 1 to 12");
        int number=sc.nextInt();
        switch(number){
            case 1:System.out.println("january");
            break;
            case 2:System.out.println("february");
            break;
            case 3:System.out.println("march");
            break;
            case 4:System.out.println("april");
            break;
            case 5:System.out.println("may");
            break;
            default:
                System.out.println("enter the correct number");
                 sc.close();
        }
    
}
}