import java.io.*;

class DisplayNum{
    public static void main(String args[]){
        int m,n;
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the Starting Number");
            m=Integer.parseInt(din.readLine());
            System.out.println("Enter the Ending Number");
            n=Integer.parseInt(din.readLine());
            while(m<=n){
                System.out.print(m+"\t");
                m++;
            } 

        }catch(Exception e){
            System.out.println("Error:"+e);
        }   


    }
}