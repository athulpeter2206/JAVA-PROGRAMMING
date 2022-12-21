import java.io.*;

class test{
    public void revNum(int n){
        int s,rev=0,rem;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reversed Number:"+rev);
    }
}

class RevFuncWithoutReturnType{

public static void main(String args[]){
    int n;
    DataInputStream din;
    din=new DataInputStream(System.in);
    try{
        System.out.println("Enter the Number to be Validated:");
        n=Integer.parseInt(din.readLine());
        test t=new test();
        t.revNum(n);
    }
    catch(Exception e){
        System.out.println("Error:"+e);
    }

}

}
