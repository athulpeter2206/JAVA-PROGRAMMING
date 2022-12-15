import java.io.*;

class MaxNum{
    public static void main(String args[]){
        int a,b,c;
        DataInputStream din;
        din=new DataInputStream(System.in);
        try{
            System.out.println("Enter the 1st Number:");
            a=Integer.parseInt(din.readLine());
            System.out.println("Enter the 2nd Number:");
            b=Integer.parseInt(din.readLine());
            System.out.println("Enter the 3rd Number:");
            c=Integer.parseInt(din.readLine()); 
            
            if(a>b){
                if(a>c){
                    System.out.println("Greatest Number is "+a);
                }
                else{
                    System.out.println("Greatest Number is "+c);
                }
            }
            else{
                System.out.println("Greatest Number is "+b);
            }
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
        
    }
}