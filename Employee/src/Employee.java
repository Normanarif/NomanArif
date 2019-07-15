
public class Employee {
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	public Employee() {
		id=027;
		firstname="Nouman";
		lastname="Ali";
		salary=25000;
		
	}
	public Employee(int id,String firstname, String lastname,int salary) {
		id=027;
		firstname="Nouman";
		lastname="Ali";
		salary=25000;
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return firstname+lastname;
	}
	
	public int getAnnualsalary() {
		return salary*12;
	}
	

}
