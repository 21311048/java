class bunki
{
	public static void main(String argv[])
	{
		int number1,number2,answer;
		String kigou;
		
		System.out.println("�v�Z���s���܂��A�v�Z���������l1����͂��Ă��������B");
		number1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("�v�Z���s���ۂ̌v�Z���@���A+ - * / %�œ��͂��Ă��������B");
		kigou = new java.util.Scanner(System.in).nextLine(); 
		System.out.println("�v�Z���������l2����͂��Ă��������B");
		number2 = new java.util.Scanner(System.in).nextInt();
		
		if(kigou.equals("+"))
		{
			answer = number1 + number2;
			System.out.println(number1+"�{"+number2+"��"+answer+"�ł��B");
		}
		else if(kigou.equals("-"))
		{
			answer = number1 - number2;
			System.out.println(number1+"�|"+number2+"��"+answer+"�ł��B");
		}
		else if(kigou.equals("*"))
		{
			answer = number1 * number2;
			System.out.println(number1+"�~"+number2+"��"+answer+"�ł��B");
		}
		else if(kigou.equals("/"))
		{
			if(number2==0)
			{
				System.out.println("0�Ŋ��邱�Ƃ͂ł��܂���B");
			}
			else
			{
			answer = number1 / number2;
			System.out.println(number1+"��"+number2+"��"+answer+"�ł��B");
			}
		}
		else if(kigou.equals("%"))
		{
			if(number2==0)
			{
				System.out.println("0�Ŋ��邱�Ƃ͂ł��܂���B");
			}
			else
			{
			answer = number1 % number2;
			System.out.println(number1+"��"+number2+"�̏��̗]���"+answer+"�ł��B");
			}
		}
		else
		{
			System.out.print("+ - * / %�̂����ꂩ����͂��Ă��������B");
		}
	}
}