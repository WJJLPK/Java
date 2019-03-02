
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
				s1.setName("����");
				s1.setSex('��');
				s1.setAge(18);
				s1.setXuehao("a2018110");
				s2.setName("���");
				s2.setSex('Ů');
				s2.setAge(17);
				s2.setXuehao("a2018420");
				System.out.println("������"+s1.getName()+",�Ա�"+s1.getSex()+",���䣺"+s1.getAge()+",ѧ�ţ�"+s1.getXuehao()+",ѧ�֣�"+s1.getXuefen());
				System.out.println("������"+s2.getName()+",�Ա�"+s2.getSex()+",���䣺"+s2.getAge()+",ѧ�ţ�"+s2.getXuehao()+",ѧ�֣�"+s2.getXuefen());
			    System.out.println("���ߵ�ѧ���Ƿ���ͬ��"+s1.equals(s2));
						
		}


}
