 class  As
{
	private As(){
		System.out.println("super class constructor");
	}
	public 
		static void main(String[] args) 
	{
		System.out.println("As method");
	}
}
class Bs extends As
{
	public static void main(String[] args) 
	{
		System.out.println("Bs method");
		System.out.println("Bs method 1");
		System.out.println("Bs method 2");
	}
}
