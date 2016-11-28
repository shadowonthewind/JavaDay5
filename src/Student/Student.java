package Student;

import java.util.Comparator;
import java.util.Date;

public class Student implements Comparable<Student>
{
	private String name;
	private String matricNumber;
	private Date dob;
	private String nickname;
	private double fee;

	public Student()
	{
		super();
	}

	public Student(String name, String matricNumber, Date dob, String nickname, double fee)
	{
		super();
		this.name = name;
		this.matricNumber = matricNumber;
		this.dob = dob;
		this.nickname = nickname;
		this.fee = fee;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMatricNumber()
	{
		return matricNumber;
	}

	public void setMatricNumber(String matricNumber)
	{
		this.matricNumber = matricNumber;
	}

	public Date getDob()
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}

	public double getFee()
	{
		return fee;
	}

	public void setFee(double fee)
	{
		this.fee = fee;
	}

	@Override
	public String toString()
	{
		return "Student [name=" + name + ", matricNumber=" + matricNumber + ", dob=" + dob + ", nickname=" + nickname
				+ ", fee=" + fee + "]";
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (((Student) obj).getMatricNumber() == this.getMatricNumber())
			return true;
		else
			return false;
	}
	
	public int compareTo (Student o)
	{
		if (this.fee == o.getFee())
			return 0;
		else if (this.fee < o.getFee())
			return -1;
		else
			return +1;
	}
}
