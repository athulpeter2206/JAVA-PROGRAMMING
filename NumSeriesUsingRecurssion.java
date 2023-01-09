import java.io.*;

class NumSeries{
    public int dispNumDesc(int num){
        if(num==0){
            return 0;
        }
        else{
            System.out.println(num);
            return dispNumDesc(num-1);   
        }
    }

    // public int dispNumAsc(int num,int itr){
    //     if(itr==num){
    //         return 1;
    //     }
    //     else{
    //         itr++;
    //         System.out.println(itr);
    //         return dispNumAsc(num,itr);   
    //     }
    // }
}
class NumSeriesUsingRecurssion{
    public  static void main(String args[]) {
        int num,i=0;
        DataInputStream din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the limit:");
            num=Integer.parseInt(din.readLine());
            NumSeries n =new NumSeries();
            System.out.println("Descending Order:");
            num=n.dispNumDesc(num);
            // System.out.println("Ascending Order:");
            // num=n.dispNumAsc(num,i);
        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }

    
}