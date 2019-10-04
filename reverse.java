package TestFiles;

public class reverse {
			public static String revString(String str)
			{
				char ch[]=str.toCharArray();
				String rev="";
				for (int i=ch.length-1;i>=0;i--)
				{
					rev=rev+ch[i];
				}
				return rev;
			}
}
