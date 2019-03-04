interface CanCry
{
	public void cry();
}
class Dog implements CanCry
{
	public void cry()
	{
		System.out.println("���ǹ�,�ҵĽ�����������");
	}
}
class Cat implements CanCry
{
	public void cry()
	{
		System.out.println("����è���ҵĽ�����������");
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
