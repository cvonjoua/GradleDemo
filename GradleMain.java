
public class GradleMain
{
	public int echoNum(int num)
	{
		return num;
	}
	
	public static void main(String[] args)
	{
		GradleMain b = new GradleMain();
		System.out.println("My Lucky Number: " + b.echoNum(13));
	}
}
