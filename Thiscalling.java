package thisandsuper;

public class Thiscalling 
{
	Thiscalling ()
	{
		System.out.println("hi this is my first constructor");
	}
	Thiscalling (int a,int b)
	{
		this();
		System.out.println("hi this is my second constructor");
	}
	Thiscalling (int c,double d)
	{
		this(9.8f,8.7f);
		System.out.println("hi this is my third constructor");
	}
	Thiscalling (char a,boolean e)
	{
		this(89,92);
		System.out.println("hi this is my forth constructor");
		
	}
	Thiscalling (float a,float b)
	{   
		this('a',true);
		System.out.println("hi this is my fifth constructor");
	}

	public static void main(String[] args) 
	{
		new Thiscalling (8,5.8);

	}

}
