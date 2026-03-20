import java.util.*;
public class cf11
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		for(int x=1;x<=t;x++)
		{
			int n=in.nextInt();
			int k=in.nextInt();
			in.nextLine();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=in.nextInt(); 
			}
			
			int c=0;
			for(int i=0;i<k-1;i++)
			{
				if(c!=i)
				{
					c=i;
					i=n;
					break;
				}
				for(int j=0;j<n;j++)
				{
					if(arr[j]==i)
					{
					j=n;
					c++;
					break;
				}
				}
			}
			System.out.println(c);
		}
	}
}