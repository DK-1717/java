import java.util.*;
public class p16 {
    public static void main(String[] args) {
        int real ,imag , real1, imag1;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the real: ");
        real = obj.nextInt();
        System.out.println("Enter the imag: ");
        imag = obj.nextInt();

        System.out.println("Enter the real2: ");
        real1 = obj.nextInt();
        System.out.println("Enter the imag2: ");
        imag1 = obj.nextInt();

        complex c1= new complex(real,imag);
        complex c2= new complex(real1,imag1);
        complex c3= new complex();
        complex c4= new complex();
        c4=c3.sum(c1, c2);
        c4.print();
    }
}

class complex{
    int r1 , i1;

    complex(){
        r1=0;
        i1=0;
    }
    complex(int r, int i){
        r1=r;
        i1=i;
    }

    complex sum(complex c , complex c1){
        complex temp = new complex();
        temp.r1= c.r1+c1.r1;
        temp.i1= c.i1+c1.i1;
        return temp;
    }

    void print(){
        System.out.println("SUM IS: " + r1 + "+" + i1);
    }


    
}