import java.util.*;

class factorial1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter a number");
    		int no=sc.nextInt();
    		int factorial = fact(no);
    		System.out.println("Factorial of "+no+" = "+factorial);
		
	}

	static int fact(int n)
	{
		int i,f=1;
    		for(i=1;i<=n;i++)
    		{
        		f=f*i;
    		}	
    		return f;
	}
}