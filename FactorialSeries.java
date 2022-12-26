import java.io.*;

class test{
    public int factorialFunc(int num){
        int fact=1,i=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
class FactorialSeries{
    public static void main(String args[]){
        int n;
        float quat;
        int fact;
        double result=0;
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            test t = new test();
            System.out.println("Enter the Limit");
            n=Integer.parseInt(din.readLine());
            for(int i=1;i<=n;i++){
                fact=t.factorialFunc(i);
                System.out.println("factorial="+fact);
                quat=(float)i/fact;
                System.out.println("Quationt="+quat);
                result=result+quat; 
            }
            System.out.println("Result="+result);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}