package lemda;
@FunctionalInterface
interface MyInterface{
	void show();
}
class Child{
	public static void main(String arg[])
	{
		int x=100;
		//using lambda expression
		MyInterface m1=()->{
			System.out.println("value of x:"+x);
		};
		m1.show();	}
}