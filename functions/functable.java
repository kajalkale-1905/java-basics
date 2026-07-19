import java.util.*;
public class functable {
    public static void printTable(int n,int i){
        System.out.println(n*i);
        return;  
}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i;
    for(i=1;i<=10;i++){
        printTable(n,i);
    }
    }
}
