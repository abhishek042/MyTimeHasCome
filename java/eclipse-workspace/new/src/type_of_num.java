import java.util.Scanner; 
public class type_of_num {
	public static void main(String[] args)
	{
		int n,flag=0;
		Scanner nu = new Scanner(System.in);
		n=nu.nextInt();
		if(n%2==0)
		{
			System.out.print("even and");//even
		}
		else
		{
			System.out.print("odd and");//odd
		}
		if(n==0||n==1)
			  {  
			   System.out.println(" is not prime number");      
			  }
		 for(int i=2;i<=(n/2);i++){      
			    if(n%i==0){      
			     System.out.println(" is not a prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(" is a prime number"); }  
	}

}
