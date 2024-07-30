import java.util.*;
class p3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile number: ");
       String m=sc.nextLine();
       System.out.println("operator code is: "+ m.substring(0,2));
       System.out.println("MSD code is: "+m.substring(2,5));
       System.out.println("unique code is: "+m.substring(5,10));
       }
       



}

