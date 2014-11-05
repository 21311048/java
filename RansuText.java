import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Random;

class RansuText
{
	public static void main(String argv[])
	{
		int[] tensu=new int[100];
		Random rg = new Random();
		
		for(int i=0; i<=99; i++)
		{
			tensu[i]=rg.nextInt(100);
		}	
		
		try
		{
			File file = new File("RansuText.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for(int i=0; i<=99; i++)
			{
				pw.println(tensu[i]);
				pw.println(",");
			}
			pw.close();
		}catch(IOException e){
			System.out.println(e);
		}
			
	}
}