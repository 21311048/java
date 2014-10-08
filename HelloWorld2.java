class HelloWorld2 
{ 
	public static void main(String argv[]) 
	{ 
		String name; 
 
		System.out.println("あなたの名前はなんですか？"); 
		name = new java.util.Scanner(System.in).nextLine(); 
		System.out.println(name+"さん、こんにちは。");
	} 
}