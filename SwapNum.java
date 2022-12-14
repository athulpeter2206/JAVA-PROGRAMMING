import java.io.*;

class SwapNum{
    public static void main(String args[]){
        int num1,num2,temp;
        DataInputStream din;
        din=new DataInputStream(System.in);
        try{
            System.out.println("Enter the 1st Number:");
            num1=Integer.parseInt(din.readLine());
            System.out.println("Enter the 2nd Number:");
            num2=Integer.parseInt(din.readLine());  
            
            System.out.println("1st Number is:"+num1);
            System.out.println("2nd Number is:"+num2);

            System.out.println("After swapping");

            temp=num1;
            num1=num2;
            num2=temp;
            System.out.println("1st Number is:"+num1);
            System.out.println("2nd Number is:"+num2);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}