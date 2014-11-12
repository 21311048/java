import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

class RansuText
{
	public static void main(String argv[])
	{
		int[] ransu=new int[100];
		String[] moji = new String[101];
		int[] mojiint = new int[101];
		mojiint[0] = 0;
		int goukei;
		goukei = 0;
		Random rg = new Random();
		
		for(int i=0; i<=99; i++)
		{
			ransu[i]=rg.nextInt(100);
		}	
		
		///ファイル書き出しプログラム
		try
		{
			
			File file = new File("RansuText.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for(int i=0; i<=99; i++)
			{	
				pw.println(ransu[i]+",");
			}
			pw.close();
		}catch(IOException e){
			System.out.println(e);
		}
		
		///ファイル読み込み＆計算プログラム
		try 
		{
			FileReader fr = new FileReader(new File("RansuText.txt"));
			BufferedReader br = new BufferedReader(fr);
					
			for(int i=1; i<=100; i++)
			{
				moji[i] = br.readLine();
				moji[i] = moji[i].replaceAll(",","");
				mojiint[i] = Integer.parseInt(moji[i]);
				goukei = goukei + mojiint[i];
			}
			System.out.println(goukei);
		} catch (IOException e) {
			System.out.println(e);
		}
			
	}
}