
public class NullPointerExceptionDemo 
{
	public static void callseyHello(Dummy d)
	{
		try
		{
			d.seyHello();
		}
		catch(NullPointerException ne)
		{
			System.out.println("Hello I hate you...");
		}
	}

	public static void main(String[] args) 
	{
		Dummy d = null;
		callseyHello(d);

	}
	
}
