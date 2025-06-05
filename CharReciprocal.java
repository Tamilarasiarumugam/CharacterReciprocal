package Practice;

public class CharReciprocal {
	
	public static String reciprocal(String s)
	{
		String ans="";
		int dif=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=97 && s.charAt(i)<=122 || s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				if(s.charAt(i)>=65 && s.charAt(i)<=90)
				{
					dif=(int)s.charAt(i)-65;
					ans+=(char)(90-dif);
				}
				else
				{
					dif=(int)s.charAt(i)-97;
					ans+=(char)(122-dif);
				}
			}
			else
			{
				ans+=s.charAt(i);
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args)
	{
		String s="ab C";
		System.out.println(reciprocal(s));
	}

}
