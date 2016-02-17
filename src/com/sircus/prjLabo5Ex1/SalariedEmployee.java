package com.sircus.prjLabo5Ex1;

import java.util.Calendar;

public class SalariedEmployee extends Employee{
	
	   private double weeklySalary;
	   private double prime;
	   public Calendar date;


	   // four-argument constructor
	   public SalariedEmployee( String first, String last, String ssn, Calendar date, 
	      double salary )
	   {
	      super( first, last, ssn, date ); // pass to Employee constructor
	      setWeeklySalary( salary ); // validate and store salary
	   } // end four-argument SalariedEmployee constructor

	   // set salary
	   public void setWeeklySalary( double salary )
	   {
	      weeklySalary = salary < 0.0 ? 0.0 : salary;
	   } // end method setWeeklySalary

	   // return salary
	   public double getWeeklySalary()
	   {
	      return weeklySalary;
	   } // end method getWeeklySalary

	   // calculate earnings; override abstract method earnings in Employee
	   public double earnings()
	   {
	      return getWeeklySalary();
	   } // end method earnings

	   // return String representation of SalariedEmployee object
	   public String toString()
	   {
	      return String.format( "salaried employee: %s\n%s: $%,.2f", 
	         super.toString(), "weekly salary", getWeeklySalary() );
	   } // end method toString
	   

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}
	} // end class SalariedEmployee

