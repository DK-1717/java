import java.util.*;
class date
{
    Scanner sc=new Scanner(System.in);
    int m,d,y;
    public
    date()
    {
        m=0;
        d=0;
        y=0;
    }
    void getmonth()
    {
        System.out.println("Enter Month");
        m=sc.nextInt();
    }
    void getdate()
    {
        System.out.println("Enter Date");
        d=sc.nextInt(); 
    }
    void getyear()
    {
        System.out.println("Enter Year");
        y=sc.nextInt();
}
void setdate()
{
    System.out.println("the day is:"+d);
}
void setmonth()
{
    System.out.println("the month is :"+m);
}
void setyear()
{
    System.out.println("the year is :"+y);
}
void displaydate()
{
    System.out.println("Date is "+d+"/"+m+"/"+y);
}
}
class p14
{
public static void main(String[] args)
{
date d=new date();
d.getdate();
d.getmonth();
d.getyear();
d.setdate();
d.setmonth();
d.setyear();
d.displaydate();
}
};