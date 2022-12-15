import java.io.*;
import java.lang.*;

class SumElements{
    public static void main(String args[]){
        int n,i;
        float a[],sum=0;

        DataInputStream din;
        din= new DataInputStream(System.in);
        try{
            System.out.println("Enter the Size of Array:");
            n=Integer.parseInt(din.readLine());
            a=new float[n];
            for(i=0;i<n;i++){
                System.out.println("Enter the Elements of Array:"+i);
                a[i]=Float.parseFloat(din.readLine());
            }
             for(i=0;i<n;i++){
                 sum=sum+a[i];
            }
            System.out.println("Sum is"+sum);

        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
        
    
    }
}