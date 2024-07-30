
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class p10.1 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        System.out.println("The string is: "+s);
        char ch[]=s.toCharArray();
        int size=s.length();
        int c=0;
int c1[]=new int[size];
int i;
int j;
        for( i=0;i<size;i++)
        {
            for(j=i+1;j<size;j++)
            if(ch[i]==ch[j])
            {
                c1[i]=ch[i];
                c++;
               
            }
            System.out.println(c1[i]+"is times "+c) ;
c=0;
        }
                               
        }
    }
}
