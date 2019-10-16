import java.util.Scanner;
class One
{
	public static void main(String []ar)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the tbable name");
		int n=sc.nextInt();
		int i=1;
		while (i<=10)
		{
			System.out.println(n+" x"+i+" ="+(i*n));
			i++;
		}
	}
}
