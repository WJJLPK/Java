interface Animal
{
	public abstract void CanCry();
}
class Dog implements Animal
{
	public void CanCry()
	{
		System.out.println("���ǹ�,�ҵĽ�����������");
	}
}
class Cat implements Animal
{
	public void CanCry()
	{
		System.out.println("����è���ҵĽ�����������");
	}
}
class Test 
{
	public static void main(String[] args)
	{
		Dog a=new Dog(); 
		Cat b=new Cat();
		Test c=new Test();
		a.CanCry();
		b.CanCry();
	}

}
