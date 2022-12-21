import java.io.*;

class CalcSumOfSeries{
    public static void main(String args[]){
        int n,i,j,sum=0;
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the Limit:");
            n=Integer.parseInt(din.readLine());
            for(i=1;i<=n;i++){
                // System.out.println(i);
                // sum=sum+i;
                System.out.print("(");
                for(j=1;j<=i;j++){
                    if(j!=1){
                        System.out.print("+");
                    }
                    System.out.print(j);
                    sum=sum+j;
                }
                System.out.print(")");
            
            }
            System.out.println("\n");
            System.out.println("Sum is :"+sum);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
    
}