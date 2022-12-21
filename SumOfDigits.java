import java.io.*;

class NumTest{

    public int sumDig(int num){
        int sum=0,rem;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }

}
class SumOfDigits{
    public static void main(String args[]){
        int n,sum;
        DataInputStream din;
        din= new DataInputStream(System.in);
        try{
            System.out.println("Enter the number to be Validated: ");
            n=Integer.parseInt(din.readLine());
            NumTest t=new NumTest();
            sum=t.sumDig(n);

            System.out.println("Sum : "+sum);
        }catch (Exception e) {
            System.out.println("Error:"+e);
        }
        

    }
}