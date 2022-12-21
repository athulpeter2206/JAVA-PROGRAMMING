import java.io.*;

class MinNum{

    public static void main(String args[]) {
        int a,b,c,res;
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the 1st Number:");
            a=Integer.parseInt(din.readLine());
            System.out.println("Enter the 2nd Number:");
            b=Integer.parseInt(din.readLine());
            System.out.println("Enter the 3rd Number:");
            c=Integer.parseInt(din.readLine());
            //(a<b) ? (a<c) ? System.out.println("Min :"+a); : System.out.println("Min :"+c); : System.out.println("Min :"+b);
    
            res = (a<b) ? (a<c) ? a : c : (b<c) ? b : c;
            System.out.println("Min :"+res);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}