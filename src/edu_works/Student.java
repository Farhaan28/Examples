package edu_works;

public class Student {
	private int rollno ;
	private String name ;
	private float cgpa ;

    public Student() {
	 name = "Khan";
}
    public  Student(int rollno) {
	this.rollno = rollno;
}
    public Student(int rollno,String name) {
		this.rollno=rollno;
		this.name= "Farhaan";
	}
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public  Student(int rollno,String name, float cgpa) {
		this.rollno=rollno;
		this.name=name;
		this.cgpa=cgpa;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	
	

}
