package com.practices;

public class Employee {
  public void  getEmpld(int id) {
	  System.out.println("Employee id is :"+id);
  }
   public static void main(String args[]) {
	     //By creating a object of class
	   Employee employee = new Employee();
	   employee.getEmpld(96);
  } 
}
