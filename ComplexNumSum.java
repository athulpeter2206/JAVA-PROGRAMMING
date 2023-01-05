import java.io.*;

class ComplexNumber{
    int real;
    int img;
    

    public void InsertComplexNum(){
        DataInputStream din = new DataInputStream(System.in);
        try{
            System.out.println("Enter the Real Part:");
            real=Integer.parseInt(din.readLine());
            System.out.println("Enter the Imaginery Part:");
            img=Integer.parseInt(din.readLine());  
        }
        catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }

    public void display(){

        System.out.print(real);
        if(img>0){
            System.out.println("+"+img+"i");
        }
        else{
            System.out.println(img+"i");
        }
    }

    public void add(ComplexNumber c2){
        ComplexNumber c = new ComplexNumber();
        c.real = this.real + c2.real;
        c.img= this.img + c2.img;
        System.out.println("Sum of Two Complex Numbers:");
        System.out.print(c.real);
        if(c.img>0){
            System.out.println("+"+c.img+"i");
        }
        else{
            System.out.println(c.img+"i");
        } 
    }
}

class ComplexNumSum{
    public static void main(String[] args) {
        
        ComplexNumber c1 = new ComplexNumber();

        c1.InsertComplexNum();
        c1.display();

        ComplexNumber c2 = new ComplexNumber();

        c2.InsertComplexNum();
        c2.display();

        c1.add(c2);
    }
}