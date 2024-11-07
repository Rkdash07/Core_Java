package day9;

public class Test {

	void Reg(Student s)
	{
		System.out.println(s.getName());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s=new Student();
        s.setName("Rupesh");
        System.out.println(s.getName());
        s.setId(7177117);
        System.out.println(s.getId());
        s.setCourse("Rupesh");
        System.out.println(s.getCourse());
//        Test t= new Test();
//        t.Reg(s);
	}

}
