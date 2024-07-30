import java.util.Scanner;
class employee
{
    Scanner sc=new Scanner(System.in);
    String fn;
    String ln;
    double sal;
    public
    employee()
    {
        fn="";
        ln="";
        sal=0.0;
    }
    void setfn()
    {
        System.out.println("Enter first name:");
        fn=sc.nextLine();


    }
void setln()
{
    System.out.println("Enter last name:");
    ln=sc.nextLine();

}
void setsal()
{
    System.out.println("Enter monthly Salary");
    sal=sc.nextDouble();
    if(sal<0)
    {
        sal=0.0;
    }
}
void getfn()
{
    System.out.println("First name:"+fn);
}
void getln()
{
    System.out.println("Last Name:"+ln);
}
void getsal()
{
    System.out.println("Yearly salary :"+(12*sal));
    System.out.println("After Rise of 10%");
    sal=sal+sal*0.1;
    System.out.println("Yearly salary :"+(12*sal));
}
};
class p13{
public static void main(String[] args)
{
    employee e1=new employee();
    employee e2=new employee();
    System.out.println("Enter the details of first employee");
    e1.setfn();
    e1.setln();
    e1.setsal();
    System.out.println("Enter the details of second employee");
    e2.setfn();
    e2.setln();
    e2.setsal();

    e1.getfn();
    e1.getln();
    e1.getsal();
    e2.getfn();
    e2.getln();
    e2.getsal();


}
}