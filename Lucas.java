import java.math.*;

class Lucas
{
	public static void main(String argv[])
	{
		BigInteger[] x = new BigInteger[101];
		BigInteger goukei,bigi,bigb;
		goukei = new BigInteger("0");
		for(int i=1; i<=100; i++)
		{
			if(i==1){
				bigi = BigInteger.valueOf(i); 
				x[i] = new BigInteger("1");}
			else if(i==2){	
				bigi = BigInteger.valueOf(i); 
				x[i] = new BigInteger("3");}
			else{
				bigi = BigInteger.valueOf(i); 
				x[i] = x[i-1].add(x[i-2]);}
		}	

		for(int b=1; b<=100; b++)
		{
			bigb = BigInteger.valueOf(b); 
			goukei = goukei.add(x[b]);
		}	
		System.out.println(goukei);
	}
}
