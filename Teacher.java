package school;

public class Teacher {
	private int id;
	private String name;
	private int salary;
	
	
	public Teacher(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	
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
      public void setSalary(int Salary) {
		  this.salary=salary;
      }
      public void receiveSalary(int salary) {
    	      	  School.updateTotalMoneySpent(salary);
      }
      @Override
      public String toString() {
    	  return "Name of the Teacher:"+name+"Total salary earned so far $"+salary;
      }
}
