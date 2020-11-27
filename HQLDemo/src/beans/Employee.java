package beans;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String dept;
	private String desig;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee( String name, int salary, String dept, String desig) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.desig = desig;
	}
	@Override
	public String toString() {
		/*return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", desig=" + desig
				+ "]";*/
		return id+"\t"+name+"\t"+dept+"\t"+desig+"\t"+salary;
	}
	

}
