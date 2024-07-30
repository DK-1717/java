import java.util.*;
class p4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list={"Motor","Fan","Tube","Wire"};
        float[] price={1000,500,200,50};
        int o;
        do{
            System.out.println("Enter 1 for motor");
            System.out.println("Enter 2 for Fan");
            System.out.println("Enter 3 for Tube");
            System.out.println("Enter 4 for Wire");
            int n=sc.nextInt();
           
            switch(n)
            {
                case 1:
                float price1= 1000+1000*0.08f;
                System.out.println("price for motor is: "+price1 );
                break;
                case 2:
                float price2=500+500*0.12f;
                System.out.println("price for fan is: "+price2 );
                break;
                case 3:
                float price3=200+200*0.075f;
                System.out.println("price for tube is: "+price3 );
                break;
                case 4:
                float price4=50+
                50*0.03f;
                System.out.println("price for wire is: "+price4 );
                break;



            }
            System.out.println("do you want to buy more?? 1/0");
            o=sc.nextInt();


        }while(o==1);


       

    }
}