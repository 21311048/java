class keisan
{
	public static void main(String argv[])
	{
		int number1,number2,tasu,hiku,kakeru,waru,amari;
		
		System.out.println("�v�Z���s���܂��A�v�Z���������l1����͂��Ă��������B");
		number1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("�v�Z���������l2����͂��Ă��������B");
		number2 = new java.util.Scanner(System.in).nextInt();
		
		tasu = number1 + number2;
		hiku = number1 - number2;
		kakeru = number1 * number2;
		waru = number1 / number2;
		amari = number1 % number2;
		
		
		System.out.println("���l1+���l2��"+tasu+"�ł��B");
		System.out.println("���l1-���l2��"+hiku+"�ł��B");
		System.out.println("���l1�~���l2��"+kakeru+"�ł��B");
		System.out.println("���l1�����l2��"+waru+"�ł��B");
		System.out.println("���l1���琔�l2���������]���"+amari+"�ł��B");
	}	
		
}