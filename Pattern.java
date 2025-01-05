package Pattern_Practice;

public class Pattern {
	private static final char A = 0;
	public static void P1()
	{
		System.out.println("Simple");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void P2()
	{
		System.out.println("2 Dungar");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void P3()
	{
		System.out.println("3 Dungar (1,2,3)");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void P4()
	{
		System.out.println("3 Dungar (111,22)");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void P5()
	{
		System.out.println("Undo ungar");
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void P6()
	{
		System.out.println("Undho (1,2,3 )");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void P7()
	{
		System.out.println("Undho (111,22,33 )");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void P8()
	{
		System.out.println("Paramid");
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(" ");
			}
			//*
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			//space
			for(int l=1;l<=5-i+1;l++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void P9()
	{
		System.out.println("Paramid");
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			//*
			for(int k=1;k<=2*5-(2*i-1);k++)
			{
				System.out.print("*");
			}
			//space
			for(int l=1;l<i;l++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void P10()
	{
		System.out.println("Dimond");
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=1;j<=5-i+1;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			//space
			for(int l=1;l<=5-i+1;l++){
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int l=1;l<=2*5-(2*i-1);l++)
			{
				System.out.print("*");
			}
			//space
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static void P11()
	{
		System.out.println("adho paramite");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<5;i++)
		{
			for(int k=1;k<5-i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void P12()
	{
		System.out.println("Odd and Even");
		int start=1;
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				start=0;
			}
			else
			{
				start=1;
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(start);
				start=1-start;
			}
			System.out.println();
		}
	}
	public static void P13()
	{
		System.out.println("number,space,number");
		int space= 2*(5-1);
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			//space
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			//number
			for(int l=i;l>=1;l--)
			{
				System.out.print(l);
			}
			space=space-2;
			System.out.println();
		}
	}
		public static void P14()
		{
			int num=1;
			System.out.println("Increment nuber");
			//outerloop
			for(int i=1;i<=5;i++)
			{
				//increment
				for(int j=1;j<=i;j++)
				{
					System.out.print(num+" ");
					num=num+1;
				}
				System.out.println();
			}
			
			
		
	}
	public static void P15()
	{
		System.out.println("Abcd");
		for(int i=1;i<=5;i++)
		{
			for(char ch='A';ch<'A'+i;ch++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public static void P16()
	{
		System.out.println("Reverse ABCD");
		for(int i=1;i<=5;i++)
		{
			for(char j='A';j<'A'+5-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void P17()
	{
		System.out.println("ABBBCCC");
		for(int i=0;i<5;i++)
		{
			//char ch=(char) ('A'+i);
			for(int j=0;j<=i;j++)
			{
				System.out.print((char)((int)('A'+i)) + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		P1();
		P2();
		P3();
		P4();
		P5();
		P6();
		P7();
		P8();
		P9();
		P10();
		P11();
		P12();
		P13();
		P14();
		P15();
		P16();
		P17();
	}
}
