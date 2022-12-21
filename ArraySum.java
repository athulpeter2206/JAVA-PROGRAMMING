import java.io.*;

class ArraySum{
    public static void main(String args[]){
        int a[][],r,c,i,j,rowSum=0,colSum=0;
        DataInputStream din;
        din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the Row Size of Array:");
            r=Integer.parseInt(din.readLine());
            System.out.println("Enter the Column Size of Array:");
            c=Integer.parseInt(din.readLine());
            a = new int[r][c];
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.println("Enter the Element for Position "+i+j+":");
                    a[i][j]=Integer.parseInt(din.readLine());
                }
            }
            //Display
            System.out.println("Array Elements Are: ");
            for(i=0;i<r;i++){
                for(j=0;j<c;j++){
                    System.out.print(a[i][j]+"\t");
                }
                System.out.print("\n");
            }
            //Sum Calculation
            for(i=0;i<r;i++){
                rowSum=0;
                for(j=0;j<c;j++){
                    rowSum=rowSum+a[i][j];
                    System.out.print(a[i][j]+"\t");
                }
                System.out.print(rowSum);
                System.out.print("\n");
            }

        }
        catch(Exception e){
            System.out.println("Error:"+e);
        }
    }
}