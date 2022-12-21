import java.io.*;

class ArraySearch{
    public static void main(String args[]){
        int a[],n,i,el,count=0;
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the Size of Array:");
            n=Integer.parseInt(din.readLine());
            a = new int[n];
            for(i=0;i<n;i++){
                System.out.println("Enter the Element for Position "+i+":");
                a[i]=Integer.parseInt(din.readLine());
            }
            //Display
            System.out.println("Array Elements Are: ");
            for(i=0;i<n;i++){
                System.out.print(a[i]+"\t");
            }
            System.out.println("\n");
            //For Search
            System.out.println("Enter the Element to be searched: ");
            el=Integer.parseInt(din.readLine());
            for(i=0;i<n;i++){
                if(a[i]==el){
                    System.out.print("Element Found at Position "+ i);
                    count++;
                }
            }
            if(count==0){
                System.out.print("Element not Found");
            }

        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}