
public class Student 
{
		private String name;
		private char sex;
		private int age;
		private String xuehao;
		private double xuefen;
		public void setName(String name)
		{
			this.name=name;
		}
		public String getName()
		{
			return name;
		}
		public void setSex(char sex)
		{
			this.sex=sex;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Student))
				return false;
			Student other = (Student) obj;
			if (Double.doubleToLongBits(xuefen) != Double.doubleToLongBits(other.xuefen))
				return false;
			return true;
		}
		public char getSex()
		{
			return sex;
		}
		public void setAge(int age)
		{
			this.age=age;
		}
		public int getAge()
		{
			return age;
		
		}
		public void setXuehao(String xuehao)
		{
			this.xuehao=xuehao;
		}
		public String getXuehao()
		{
			return xuehao;
		}
		public void setXuefen(double xuefen)
		{
			this.xuefen=xuefen;
		}
		public double getXuefen()
		{
			return xuefen;
		}
 
		
		public static void main(String[] args)
		{
				Student s1=new Student();
				Student s2=new Student();
				s1.setXuefen(3.7);
				s2.setXuefen(4.1);
				//boolean b=s1.compare(s2);
				s1.setName("明明");
				s1.setSex('男');
				s1.setAge(18);
				s1.setXuehao("a2018110");
				s2.setName("红红");
				s2.setSex('女');
				s2.setAge(17);
				s2.setXuehao("a2018420");
				System.out.println("姓名："+s1.getName()+",性别："+s1.getSex()+",年龄："+s1.getAge()+",学号："+s1.getXuehao()+",学分："+s1.getXuefen());
				System.out.println("姓名："+s2.getName()+",性别："+s2.getSex()+",年龄："+s2.getAge()+",学号："+s2.getXuehao()+",学分："+s2.getXuefen());
			    System.out.println("二者的学分是否相同："+s1.equals(s2));
						
		}


}
