import java.io.*;

class MethodDemo{
    public int checkEven(int num){
        if(num%2==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public int sumOfNum(){
        int num,evenchk,sum=0;
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the Limit");
            num=Integer.parseInt(din.readLine());
            for(int i=1;i<=num;i++){
                evenchk=checkEven(i);
                if(evenchk==0){
                    sum=sum+i;
                }
            }
            return sum;
        }
        catch(Exception e){
            System.out.println("Error:"+e);
            return sum;
        }

    }

}
class SumOfEvenNum{
    public static void main(String args[]){
        int sum;
        MethodDemo d = new MethodDemo();
        sum=d.sumOfNum();
        System.out.println("Sum of Even Numbers ="+sum);
    }
}