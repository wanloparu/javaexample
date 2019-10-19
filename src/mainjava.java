/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wanloparuntammanak
 */
public class mainjava {
    public static void main (String[]args){
        Employee e1 = new Employee("1","wanlop",30000);
        e1.displayEmployee();
         Employee e2 = new Employee();
         Employee e3 = new Employee("3","john");
         int result = Employee.minsalary;
         System.out.print(result);
         System.out.println(company.name+" : "+company.at);
         company.service();
       /* e1.setId("T1"); 
        e1.setName("Wanlop"); 
        e1.setsalary(30000);
        e1.displayEmployee();
        System.out.println(e1.getId()+" : "+ e1.getName());
        System.out.print(e1.getsalary());
        Employee e2 = new Employee();
        e2.setId("T1"); 
        e2.setName("Wanlop"); 
        e2.setsalary(30000); */
       
       programer p1 = new programer();
       p1.setId("3");
       p1.setName("Sala");
       p1.setsalary(40000);
       p1.displayEmployee();
    }
}
