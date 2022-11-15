package school;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		Teacher teacher1=new Teacher(1,"poovizi",10000);
		Teacher teacher2=new Teacher(2,"elavarasi",15000);
		Teacher teacher3=new Teacher(3,"vennila",20000);
		List<Teacher>teacherList=new ArrayList<>();
		
		int poovizi=10000;
		int elavarasi=15000;
		int vennila=20000;
		
		
		
		
		Student jayalakshmi=new Student(1,"jayalakshmi",4);
        Student rajalakshmni=new Student(2,"rajalakshmi",6);
		Student kalaivani=new Student(3,"kalaivani",8);
		 List<Student> studentList=new ArrayList<>();
		 
		 studentList.add(jayalakshmi);
		 studentList.add(rajalakshmni);
		 studentList.add(kalaivani);
		 
		 
		 SchoolBusDrivers Rajendiran=new SchoolBusDrivers(1,"Rajendiran",3500);
		 SchoolBusDrivers Murugan=new SchoolBusDrivers(2,"murugan",4000);
		 SchoolBusDrivers Driver=new SchoolBusDrivers(3,"driver",4500);
		 List<SchoolBusDrivers>DriverList=new ArrayList<>();
		 
	int	Rajendiran1=3500;
		int Murugan1=4000;
		int Driver1=4500;
       
		  
		 School School1  =new School(teacherList,studentList);
		 Teacher teacher4=new Teacher(6,"teacher4",899);
		School1.addTeacher(teacher4);
		 
		jayalakshmi.payFees(5000);
		rajalakshmni.payFees(6000);
		kalaivani.payFees(9000);
		 
		 teacher1.receiveSalary(teacher1.getSalary());
		
		 
		 teacher3.receiveSalary(teacher3.getSalary());
		 
		 teacher2.receiveSalary(teacher2.getSalary());
		 System.out.println("--------Making School pay salary------");
	
		System.out.println("school has spent for salary to"+teacher1.getName()+"and now has $"+poovizi);
		 System.out.println("school has spent for salary to"+teacher3.getName()+"and now has $"+elavarasi);
		 System.out.println("school has spent for salary to"+teacher2.getName()+"and now has $"+vennila);
		 System.out.println("------------------------------------------");
		 System.out.println("--------Making School pay salary for drivers------");
		 System.out.println("the Driver earned:"+Rajendiran1);
		 
		 System.out.println("the Driver earned:"+Murugan1);
		 
		 System.out.println("the Driver earned:"+Driver1);
		 
		 System.out.println("------------------------------------------");
		 
		 System.out.println("-------------students paid fees-----------------");
		 System.out.println("the student paid:"+jayalakshmi);
		 System.out.println("the student paid:"+rajalakshmni);
		 System.out.println("the student paid:"+kalaivani);
		 System.out.println("-------------------------------------------------");

		

	}

	

}
