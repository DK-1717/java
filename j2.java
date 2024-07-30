import java.util.*;
class j2
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] ch={'A','B','C','D'};
        String[] s={"..._",".._.","._..","_..."};
        System.out.println("Enter 1 for converting string to Morse code");
        System.out.println("Enter 2 for converting Morse code to string");
        int n=sc.nextInt();
        sc.nextLine();
        switch(n)   
        {
            case 1:
            System.out.println("Enter the string");
            String c=sc.nextLine();
      
           for(int i=0;i<c.length();i++)
           {
            char curr=c.charAt(i);
           
            if(curr==ch[i]){
            System.out.println(s[i]);
            }
           }
           break;
           case 2:
           System.out.println("Enter the Morse code");
           String d=sc.nextLine();
           String[] e = new String[d.length() / 4];
           for (int i = 0; i < d.length() / 4; i++) {
            e[i] = d.substring(i * 4, i * 4 + 4);
           

            
            for (int j = 0; j < s.length; j++) {
                if (e[i].equals(s[j])) {
                    System.out.println(ch[j]);
                  
                    break; // Exit inner loop once match is found
                }
            }
        }


        }
    }
}
