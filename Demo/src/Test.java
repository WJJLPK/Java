interface CanCry
{
	public void cry();
}
class Dog implements CanCry
{
	public void cry()
	{
		System.out.println("我是狗,我的叫声是汪汪汪");
	}
}
class Cat implements CanCry
{
	public void cry()
	{
		System.out.println("我是猫，我的叫声是汪汪汪");
	}
}
class Test 
{
	void makeCry(CanCry c)
	{
		c.cry();
	}
	public static void main(String[] args)
	{
		Dog dog=new Dog(); 
		Cat cat=new Cat();
		Test test=new Test();
		test.makeCry(dog);
		test.makeCry(cat);
	}

}
