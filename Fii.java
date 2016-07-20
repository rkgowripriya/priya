
class Fii{
	
		public static void main(String args[])
		{
		
		
		int i=0;
	int	n=Integer.parseInt(args[0]);
		int len=Integer.toString(n).length();
		int b[]=new int[len];
		for(i=0;i<len;i++)
		{
			b[i]=n%10;
			System.out.println(b[i]);
			n=n/10;
		}
	}
}
