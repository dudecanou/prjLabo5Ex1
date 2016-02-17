package com.sircus.prjLabo5Ex1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Employee {

	   private String firstName;
	   private String lastName;
	   private String socialSecurityNumber;
	   protected Calendar embauche;
	   SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

	   // three-argument constructor
	   public Employee( String first, String last, String ssn, Calendar date )
	   {
	      firstName = first;
	      lastName = last;
	      socialSecurityNumber = ssn;
	      embauche = date;
	   } // end three-argument Employee constructor

	   // set first name
	   public void setFirstName( String first )
	   {
	      firstName = first;
	   } // end method setFirstName

	   // return first name
	   public String getFirstName()
	   {
	      return firstName;
	   } // end method getFirstName

	   // set last name
	   public void setLastName( String last )
	   {
	      lastName = last;
	   } // end method setLastName

	   // return last name
	   public String getLastName()
	   {
	      return lastName;
	   } // end method getLastName

	   // set social security number
	   public void setSocialSecurityNumber( String ssn )
	   {
	      socialSecurityNumber = ssn; // should validate
	   } // end method setSocialSecurityNumber

	   // return social security number
	   public String getSocialSecurityNumber()
	   {
	      return socialSecurityNumber;
	   } // end method getSocialSecurityNumber
	   
	   public String getEmbauche()
	   {
		   String simpleDate = format1.format(embauche.getTime());
		   return simpleDate;
	   }

	   // return String representation of Employee object
	   public String toString()
	   {
	      return String.format( "%s %s\nsocial security number: %s\nemployed since: %s", 
	         getFirstName(), getLastName(), getSocialSecurityNumber(), getEmbauche() );
	   } // end method toString

	// abstract method overridden by subclasses
	   public abstract double earnings(); // no implementation here
	} // end abstract class Employee

