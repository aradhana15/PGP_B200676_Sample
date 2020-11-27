package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import beans.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessFact = cfg.buildSessionFactory();
		Session sess = sessFact.openSession();
		
		//Insert
		/*Employee ob1 = new Employee();
		ob1.setName("Abdul");
		ob1.setDept("IT");
		ob1.setSalary(22000);
		ob1.setDesig("Dev");
		
		Employee ob2 = new Employee("Sriram", 14000, "Accounts", "Jr Accountant");
		Employee ob3 = new Employee("Sahil", 54000, "IT", "Tester");
		
		sess.beginTransaction();
		sess.persist(ob1);
		sess.persist(ob2);
		sess.persist(ob3);
		
		sess.getTransaction().commit();
		System.out.println("Employee Persisted....");*/
		
		//Listing all the data using list()
		/*List<Employee> data = sess.createQuery("from Employee").list();
		for (Employee ob :data)
		{
			System.out.println(ob.getId()+"\t"+ob.getName()+"\t"+ob.getDept()+"\t"+ob.getSalary()+"\t"+ob.getDesig());
		}*/
		
		//Using Aggregate functions
		/*Query avg = sess.createQuery("select SUM(salary) from Employee");
		System.out.println("Sum = "+avg.list());*/
		
		//Using where clause
		/*Query query = sess.createQuery("from Employee where desig = 'Dev'");
		System.out.println(query.list());*/
		
		//Binding parameters in HQL
		/*Query query = sess.createQuery("from Employee where dept =:temp");
		String val = "IT";
		query.setString("temp", val);
		System.out.println(query.list());*/
		
		//Selecting first 'n' records
		/*Query query = sess.createQuery("from Employee");
		query.setFirstResult(3);
		System.out.println(query.list());*/
		
		//Creating Criteria
		/*Criteria cr = sess.createCriteria(Employee.class);
		System.out.println(cr.list());*/
		
		//Conditional Execution using Criteria
		Criteria cr = sess.createCriteria(Employee.class);
		//cr.add(Restrictions.eq("dept", "IT"));
		cr.add(Restrictions.gt("salary", 25000));
		System.out.println(cr.list());
	}
}
