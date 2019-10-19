/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wanloparuntammanak
 */
public class Employee {
    private String id;
    private String name;
    private double salary;
    
    //Static attribue
    static int minsalary = 12000;
    
    //default constructor
    public Employee(){
        
    }
    public Employee(String id,String name){
       this.id =id;
       this.name = name;
    }
    public Employee(String id,String name,double salary){
       this.id =id;
       this.name = name;
       this.salary = salary;
       /*this.id="1";
       this.name="Wanlop";
       this.salary=30000;*/
    }
    //method
    public void setId(String id){
        this.id=id;
    } 
    public String getId(){
        return this.id; 
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name; 
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public double getsalary(){
        return this.salary; 
    }
    public void displayEmployee(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.salary);
    }
}
