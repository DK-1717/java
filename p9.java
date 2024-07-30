/*import java.util.Scanner;
public class p9 {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            String s;
           
            System.out.println("Enter string");
            s = sc.nextLine(); */
            import java.util.Arrays;
public class p9 {
    public static void main(String[] args) {
        String s="Divy Kalathiya";
        System.out.println(s.length());
     //    System.out.println(s.toLowerCase());
        int  x;
        for(int i=0;i<s.length();i++)
        {
            x = s.charAt(i)+32;
         if(x>=97 && x<=122)
         System.out.print((char)x);
         else
         System.out.print(s.charAt(i));
        }
        System.out.println(" ");
        for(int i=0;i<s.length();i++)
        {
            x = s.charAt(i)-32;
         if(x>=65 && x<=90)
         System.out.print((char)x);
         else
         System.out.print(s.charAt(i));
        }
        System.out.println(" ");
     //    System.out.println(s.toUpperCase());
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
         str+=s.charAt(i);
        }
        System.out.println(str);
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
             a[i]=s.charAt(i);
        }
        Arrays.sort(a);
        String st=new String(a);
        System.out.println(st);
    }
 

            
           
           
            
           /* int size=s.length();
            System.out.println("Lower case");
            System.out.println(s.toLowerCase());
            System.out.println("upeer case");
            System.out.println(s.toUpperCase());
            System.out.println("length");
            System.out.println(s.length());
           String str="";
           
           for(int i=size-1;i>=0;i--)
           {    
           
           str=str+s.charAt(i);
        
           }
           System.out.println("Reversed string :"+str);
           char ch[]=new char[size];
           for(int i=0;i<size;i++)
           {
            ch[i]=s.charAt(i);
           }
          // with out using inbuilt sorting function.....
           for(int i=0;i<size;i++)
           {
               for(int j=i+1;j<size;j++)
               {
                   if(ch[i]>ch[j])
                   {
                       char temp=ch[i];
                       ch[i]=ch[j];
                       ch[j]=temp;
                   }
               }
           } 
           Arrays.sort(ch);
           String sort=new String(ch);
           System.out.println("Sorted string is: "+sort);
           */
            
           




        }
    

