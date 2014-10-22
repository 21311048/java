class keisan
{
	public static void main(String argv[])
	{
		int number1,number2,tasu,hiku,kakeru,waru,amari;
		
		System.out.println("計算を行います、計算したい数値1を入力してください。");
		number1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("計算したい数値2を入力してください。");
		number2 = new java.util.Scanner(System.in).nextInt();
		
		tasu = number1 + number2;
		hiku = number1 - number2;
		kakeru = number1 * number2;
		waru = number1 / number2;
		amari = number1 % number2;
		
		
		System.out.println("数値1+数値2は"+tasu+"です。");
		System.out.println("数値1-数値2は"+hiku+"です。");
		System.out.println("数値1×数値2は"+kakeru+"です。");
		System.out.println("数値1÷数値2は"+waru+"です。");
		System.out.println("数値1から数値2を割った余りは"+amari+"です。");
	}	
		
}