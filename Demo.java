class Demo
{
	public static void main(String args[])
	{
		String s="abc";
		char ch=s.charAt(0);
		String st=s.substring(0,0)+s.substring(0+1);
		System.out.println("char: "+ch);
		System.out.println(st);
		System.out.println("length: "+st.length());
	}
}