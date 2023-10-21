package thisandsuper;
class parent
{
	int a=40;
	void display()
	{
		System.out.println("parent class");
	}
}


class child extends parent
{

	int a=30;
	 void display()
	{
		System.out.println("child class");
		System.out.println(a);
		System.out.println(super.a);
		super.display();
		
		
	}
}


public class Parentchild 
{

	public static void main(String[] args)
	{
	child c1=new child();
	c1.display();

	}

}
