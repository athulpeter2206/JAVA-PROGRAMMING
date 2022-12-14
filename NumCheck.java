import java.io.*;
import java.util.*;

public class NumCheck{
    public static void main(String args[]){
        int num;
        System.out.println("Enter the Number to be Validated:");
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Num is:" +num);

        if(num%2==0){
            System.out.println("Num is Even:" +num);
        }
        else{
            System.out.println("Num is Odd:" +num);
        }
    }
}