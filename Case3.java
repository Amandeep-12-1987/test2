package thisandsuper;
class case3333
{
case3333(int c)
{
	
	System.out.println("hi i am greatgrand parent constructor with parameters");
}
}

class case333 
{
	case333()
	
	{
		//super(10);
		System.out.println("hi i am grandparent constructor with no parameters");
	}
}

class case33 extends case333
{
	case33()
	{
     System.out.println("hi i am parent class with parameterized constructor");
}
}

public class Case3 extends case33
{
Case3()
{
	//super();
	System.out.println("hi i am child class constructor with no parameter");
}
	public static void main(String[] args)
	{
		new case3333(10);
		new Case3();
		new case3333(10);

	}

}
