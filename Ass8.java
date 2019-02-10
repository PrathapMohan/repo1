public class Ass8 {

	public static void main(String[] args)
	{
		int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++ )
			{
				int m=i+j;
				if(m>=5)
				System.out.print(k++ +" ");
				else
				System.out.print(" ");	
				
			}
			
			System.out.println();  	
		}
		
	}

}
