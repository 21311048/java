class Lucas
{
	public static void main(String argv[])
	{
		long[] x = new long[101];
		long goukei;
		goukei = 0;
		for(int i=1; i<=100; i++)
		{
			if(i==1){
				x[i] = 1;}
			else if(i==2){		
				x[i] = 3;}
			else{
				x[i] = x[i-1] + x[i-2];}
		}	

		for(int b=1; b<=100; b++)
		{
			goukei = goukei + x[b];
		}	
		System.out.println(goukei);
	}
}
//long型の変数で参照可能な数値は「9223372036854775807」である
//しかし、今回のプログラムで求める数は22桁と非常に多い数であるため、intやlong型だとオーバーフローを起こす。
//そのため、long型より多くの数を参照できるデータ型が必要である。
