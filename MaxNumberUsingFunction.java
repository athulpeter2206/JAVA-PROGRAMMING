//Implementation of Method Overloading in JAVA

import java.io.*;

class FunctionDemo{
    int maxNo;
    public int maxNum(int n1,int n2){
        if(n1>n2){
            return n1;
        }
        else{
            return n2;
        }  
    }
    public int maxNum(int num1,int num2,int num3){
        if(num1>num2){
            maxNo=maxNum(num1,num3);        //Nested Method
            return maxNo;
        }
        else{
            maxNo=maxNum(num2,num3);
            return maxNo;
        }
    }

}
class MaxNumberUsingFunction{
    public static void main(String args[]){
        int n1,n2,n3,MaxNum;
        DataInputStream din = new DataInputStream(System.in);
        try{
            FunctionDemo t = new FunctionDemo();
            System.out.println("Enter the 1st Number:");
            n1=Integer.parseInt(din.readLine());
            System.out.println("Enter the 2nd Number:");
            n2=Integer.parseInt(din.readLine());
            System.out.println("Enter the 3rd Number:");
            n3=Integer.parseInt(din.readLine());
            MaxNum = t.maxNum(n1,n2,n3);
            System.out.println("Max Num is :"+MaxNum);
            
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}