class StaticReintilizer 
{
	static int i=221;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(i);
		int i=88;
		System.out.println(i);
		System.out.println(StaticReintilizer.i);
	}
}
