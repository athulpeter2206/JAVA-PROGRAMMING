import java.io.*;

class calcArea{

    DataInputStream din = new DataInputStream(System.in);
    int r;
    public void calArea(){
        try{
            System.out.println("Enter the Radius of Circle");
            r=Integer.parseInt(din.readLine());
    
            double area=0;
    
            area=3.14*r*r;
            System.out.println("Area :"+area);
        }catch(Exception e){
            System.out.println("Error:"+e);
        } 

    }

}

class AreaCircleFuncDempo{
    public static void main(String args[]){

            calcArea cArea = new calcArea();
            cArea.calArea();
    }
}