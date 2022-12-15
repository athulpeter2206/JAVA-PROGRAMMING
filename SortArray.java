import java.io.*;
import java.lang.*;

class SortArray{
    public static void main(String args[]){
        int n,i,j;
        int a[],temp=0;

        DataInputStream din;
        din= new DataInputStream(System.in);
        try{
            System.out.println("Enter the Size of Array:");
            n=Integer.parseInt(din.readLine());
            a=new int[n];
            for(i=0;i<n;i++){
                System.out.println("Enter the Elements of Array:"+i);
                a[i]=Integer.parseInt(din.readLine());
            }
            for(i=0;i<n;i++){
                for(j=i+1;j<n;j++){
                    if(a[j]>a[i]){
                        temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }
                }  
            }
        System.out.println("Sorted Array:");    
            for(i=0;i<n;i++){
                System.out.println(a[i]);
            }
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
        
    
    }
}