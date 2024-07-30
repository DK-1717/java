import java.util.*;
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[]=new int[5];
        int c=0;
        for(int i=0;i<5;i++)
        {
            n[i]=sc.nextInt();
            
        }
        
        for(int i=0;i<5;i++)
        {
            if(n[i]==9)
            c++;
        }
        System.out.println(c);
    
}
}