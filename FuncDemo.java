import java.io.*;
import java.lang.*;

class test{

    public int sumOfDig(int num){

        int sum=0,rem;

        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }

        return sum;
    }
}

class FuncDemo{

    public static void main(String args[]){

        int n;
        DataInputStream din;
        din=new DataInputStream(System.in);
        try{
            System.out.println("Enter the Number to be validated:");
            n=Integer.parseInt(din.readLine());
            test t = new  test();
            int sum = t.sumOfDig(n);
            System.out.println("Sum of Digits is :"+sum);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }

    }


}