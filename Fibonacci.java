class Fibonacci
{
	public static void main(String argv[])
	{
		int[] n = new int[11];
		int[] x = new int[11];
		
		for(int i=1; i<=10; i++)
		{
			if(i==1)
			{
				n[i] = 1;
				x[i] = 1;
			}
			else if(i==2)
			{		
				n[i] = 1;
				x[i] = 3;
			}
			else
			{
				n[i] = n[i-1] + n[i-2];
				x[i] = x[i-1] + x[i-2];
			}
		}	
		for(int a=1; a<=10; a++)
		{
			System.out.println("フィボナッチ数列の第"+a+"項は"+n[a]);
		}
		for(int b=1; b<=10; b++)
		{
			System.out.println("リュカ数列の第"+b+"項は"+x[b]);
		}
		
	}
	
	

}