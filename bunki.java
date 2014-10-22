class bunki
{
	public static void main(String argv[])
	{
		int number1,number2,answer;
		String kigou;
		
		System.out.println("計算を行います、計算したい数値1を入力してください。");
		number1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("計算を行う際の計算方法を、+ - * / %で入力してください。");
		kigou = new java.util.Scanner(System.in).nextLine(); 
		System.out.println("計算したい数値2を入力してください。");
		number2 = new java.util.Scanner(System.in).nextInt();
		
		if(kigou.equals("+"))
		{
			answer = number1 + number2;
			System.out.println(number1+"＋"+number2+"は"+answer+"です。");
		}
		else if(kigou.equals("-"))
		{
			answer = number1 - number2;
			System.out.println(number1+"－"+number2+"は"+answer+"です。");
		}
		else if(kigou.equals("*"))
		{
			answer = number1 * number2;
			System.out.println(number1+"×"+number2+"は"+answer+"です。");
		}
		else if(kigou.equals("/"))
		{
			if(number2==0)
			{
				System.out.println("0で割ることはできません。");
			}
			else
			{
			answer = number1 / number2;
			System.out.println(number1+"÷"+number2+"は"+answer+"です。");
			}
		}
		else if(kigou.equals("%"))
		{
			if(number2==0)
			{
				System.out.println("0で割ることはできません。");
			}
			else
			{
			answer = number1 % number2;
			System.out.println(number1+"と"+number2+"の商の余りは"+answer+"です。");
			}
		}
		else
		{
			System.out.print("+ - * / %のいずれかを入力してください。");
		}
	}
}