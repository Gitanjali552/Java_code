public class StarPattern2 {

	public static void main(String[] args) {

    for(int i=0;i<5;i++)  
    {  
      for(int j=0;j<5;j++)  
      {        
       if(i==j || i+j==5-1)  
       {  
         System.out.print("*");  
       }  
       else  
       System.out.print(" ");  
    }  
			System.out.println();
		}	
	}

}





/*
output
D:\anudip>javac StarPattern2.java

D:\anudip>java StarPattern2
*   *
 * *
  *
 * *
*   *

D:\anudip>
*/