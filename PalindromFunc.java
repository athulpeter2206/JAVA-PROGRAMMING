import java.io.*;

class test{
    public void CheckPalindrome(int n){
        int s,rev=0,rem,num;
        num=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(num==rev){
            System.out.println("Entered Element is Palindrome");
        }
        else{
            System.out.println("Entered Element is Not Palindrome");
        }

    }
}

class PalindromFunc{

public static void main(String args[]){
    int n;
    DataInputStream din;
    din=new DataInputStream(System.in);
    try{
        System.out.println("Enter the Number to be Validated:");
        n=Integer.parseInt(din.readLine());
        test t=new test();
        t.CheckPalindrome(n);
    }
    catch(Exception e){
        System.out.println("Error:"+e);
    }

}

}
