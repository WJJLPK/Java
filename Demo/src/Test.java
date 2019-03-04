interface Animal
{
	public abstract void CanCry();
}
class Dog implements Animal
{
	public void CanCry()
	{
		System.out.println("我是狗,我的叫声是汪汪汪");
	}
}
class Cat implements Animal
{
	public void CanCry()
	{
		System.out.println("我是猫，我的叫声是汪汪汪");
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
