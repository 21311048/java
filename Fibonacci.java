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
			System.out.println("�t�B�{�i�b�`����̑�"+a+"����"+n[a]);
		}
		for(int b=1; b<=10; b++)
		{
			System.out.println("�����J����̑�"+b+"����"+x[b]);
		}
		
	}
	
	

}