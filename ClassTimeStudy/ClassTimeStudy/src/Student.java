public class Student {
    private String name;
	private int birthYear;
	private String dept;
	private String address;
  //public으로 생성자 만들기
	public Student(String name, int birthYear, String dept, String address ){    
		this.name = name;
		this.birthYear =birthYear;
		this.dept = dept;
		this.address = address ;
	}
	public void getName() {
		System.out.println(name);
	}
}
