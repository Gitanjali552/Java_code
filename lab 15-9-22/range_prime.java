import java.util.Scanner;

public class range_prime
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the Range: ");
      int p = scan.nextInt();
      int q = scan.nextInt();
      
      System.out.println("Prime Numbers from " + p + " to " + q);
      for(int i=p; i<=q; i++)
      {
         int r = 0;
         for(int x=2; x<i; x++)
         {
            if(i%x==0)
            {
               r++;
               break;
            }
         }
         if(r==0)
            System.out.println(i);
      }
   }
}


/* output

D:\anudip>javac range_prime.java

D:\anudip>java range_prime
Enter the Range: 9 90
Prime Numbers from 9 to 90
11
13
17
19
23
29
31
37
41
43
47
53
59
61
67
71
73
79
83
89

D:\anudip>
*/