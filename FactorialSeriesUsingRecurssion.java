import java.io.*;

class Recurssion{

    public int factorialOfNum(int num){
        
        if(num==0){
            return 1;
        }
        else{
            return num*factorialOfNum(num-1); //Recurssive Method; Method Calling itself until a certain end condition is met
        }
    }
}

class FactorialSeriesUsingRecurssion{
    public static void main(String args[]){
        int i=1,num,fact=1;
        DataInputStream din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the Number");
            num=Integer.parseInt(din.readLine());
            Recurssion r = new Recurssion();
            fact=r.factorialOfNum(num);
            System.out.println("Factorial :"+fact);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}