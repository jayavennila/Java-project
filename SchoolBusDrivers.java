package school;

public class SchoolBusDrivers {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public SchoolBusDrivers(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
		
	}
	public int getId() {
		return id;
	}
    public String getName() {
    	return name;
    
    }
    public int getSalary() {
    	return salary;
    }
    public int setSalary(int Salary, int salary) {
		return 0;
    }
    public void receiveSalary(int salary) {
    	salaryEarned+=salary;
    }
    @Override
    public String toString() {
    	return"name of the driver:"+name+"total salary earned :"+salaryEarned;
    }
}
