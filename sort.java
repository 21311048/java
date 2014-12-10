import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class sort
{
	public static void main(String argv[])
	{
		String[] moji = new String[101];
		int[] mojiint = new int[101];
		mojiint[0] = 0;
				
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
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		 for(int a=1; a<101; a++){
            for(int b=a+1; b<101; b++){
                if(mojiint[b] > mojiint[a]){
                    int temp = mojiint[a];
                    mojiint[a] = mojiint[b];
                    mojiint[b] = temp;
                }
            }
        }
		
		///ファイル書き出しプログラム
		try
		{	
			File file = new File("RansuSortText.txt");
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			for(int c=1; c<=100; c++)
			{	
				pw.print(mojiint[c]+",");
			}
			pw.close();
		}catch(IOException e){
			System.out.println(e);
		}
    }
}