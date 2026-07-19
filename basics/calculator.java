package basics;

import java.util.Scanner;
public class calculator {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();

int b=sc.nextInt();
System.out.print(a);
System.out.println(b);
System.out.println("enter the operator +,-,*,/,%");
char operator=sc.next().charAt(0);//this line is imp 
int result;
switch(operator){
    case '+':
    result=a+b;
    System.out.println(result);
    break;
    case '-':
    result=a-b;
    System.out.println(result);
    break;
    case '*':
    result=a*b;
    System.out.println(result);
    break;
    case'/':
    if(a/b==0){
        System.out.println("division by zero is not allowed");

    }else{
        result=a/b;
        System.out.println(result);
    }
    break;
    case '%':
        result=a%b;
        System.out.println(result);
        break;



}
sc.close();


}
}