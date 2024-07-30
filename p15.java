
import java.util.Scanner;

class area
{
    int l,b;
    public
    area(int l1,int b1)
    {
        l=l1;
        b=b1;
    }
int returnarea()
{
    System.out.println("The area of rectangle is:");
    return l*b;
}
}
class p15
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int ll,bb;
        System.err.println("Enter length and breadth");
        ll=sc.nextInt();
        bb=sc.nextInt();
        area a=new area(ll,bb);
        System.out.println(a.returnarea());
    }
}