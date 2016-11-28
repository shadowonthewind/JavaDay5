package test;

import java.util.ArrayList;

import Student.NameComparator;
import Student.Student;

public class TestStudent
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student s1 = new Student("LIN SIYIN", "SA43-01", null, "pleasant", 20.00);
		Student s2 = new Student("MATTHEW", "SA43-02", null, "pleasant", 40.00);
		Student s3 = new Student("IMRAN", "SA43-03", null, "pleasant", 80.00);
		Student s4 = new Student("MANISHA", "SA43-04", null, "pleasant", 10.00);
		
		if(s1.equals(s2))
		{
			System.out.println("Same person");
		}
		else
		{
			System.out.println("Different person");
		}
		
		ArrayList<Student> stuArr = new ArrayList<Student>();
		stuArr.add(s1);
		stuArr.add(s2);
		stuArr.add(s3);
		stuArr.add(s4);
		System.out.println(stuArr);
		stuArr.sort(null);
		System.out.println(stuArr);
		stuArr.sort(new NameComparator());
		System.out.println(stuArr);
	}

}
