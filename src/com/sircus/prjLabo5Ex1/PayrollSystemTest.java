package com.sircus.prjLabo5Ex1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PayrollSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create subclass objects
		
		
		
		GregorianCalendar dateToday = new GregorianCalendar(); 
        
		            
		    GregorianCalendar dateEmbauche = new GregorianCalendar(1995,2,4,0,0,0);

		    int ans  = dateEmbauche.get(Calendar.YEAR)-dateToday.get(Calendar.YEAR);
		    dateToday.add(Calendar.YEAR, ans);
		    if(dateToday.after(dateEmbauche))
		    {
		    dateToday.add(Calendar.YEAR, -1);
		    ans--;
		    }

		    double SalaireBase = 1000;
			double Salaire = 0;
			
		    if (ans <= -5 && ans > -10)
		    {
		    	Salaire = SalaireBase * (1.03);
		    }
		    if ( ans <= -10 && ans > -20)
		    {
		    	Salaire = SalaireBase * (1.04);

		    }
		    if ( ans <= -20)
		    {
		    	Salaire = SalaireBase * (1.05);
		    	
		    	
		    }
		  
	      SalariedEmployee salariedEmployee = 
	         new SalariedEmployee( "John", "Smith", "111-11-1111", dateEmbauche, Salaire );
	      HourlyEmployee hourlyEmployee = 
	         new HourlyEmployee( "Karen", "Price", "222-22-2222", dateEmbauche, 16.75, 40 );
	      CommissionEmployee commissionEmployee = 
	         new CommissionEmployee( 
	         "Sue", "Jones", "333-33-3333", dateEmbauche, 10000, .06 );
	      BasePlusCommissionEmployee basePlusCommissionEmployee = 
	         new BasePlusCommissionEmployee( 
	         "Bob", "Lewis", "444-44-4444", dateEmbauche, 5000, .04, 300 );
	      Reparateur EmployeeReparateur = 
	    	 new Reparateur("Jean-Claude", "Van Damme", "514-000-9999",dateEmbauche, 20, 50);

	      System.out.println( "Employees processed individually:\n" );
	      
	      System.out.printf( "%s\n%s: $%,.2f\n\n", 
	         salariedEmployee, "earned", salariedEmployee.earnings() );
	      
	      System.out.printf( "%s\n%s: $%,.2f\n\n",
	         hourlyEmployee, "earned", hourlyEmployee.earnings() );
	      
	      System.out.printf( "%s\n%s: $%,.2f\n\n",
	         commissionEmployee, "earned", commissionEmployee.earnings() );
	      
	      System.out.printf( "%s\n%s: $%,.2f\n\n",
	         basePlusCommissionEmployee, 
	         "earned", basePlusCommissionEmployee.earnings() );
	      
	      System.out.printf( "%s\n%s: $%,.2f\n\n",
	    		  EmployeeReparateur, "earned", EmployeeReparateur.earnings() );

	      // create four-element Employee array
	      Employee employees[] = new Employee[ 5 ]; 

	      // initialize array with Employees
	      employees[ 0 ] = salariedEmployee;
	      employees[ 1 ] = hourlyEmployee;
	      employees[ 2 ] = commissionEmployee; 
	      employees[ 3 ] = basePlusCommissionEmployee;
	      employees[ 4 ] = EmployeeReparateur;


	      System.out.println( "Employees processed polymorphically:\n" );
	      
	      // generically process each element in array employees
	      for ( Employee currentEmployee : employees ) 
	      {
	         System.out.println( currentEmployee ); // invokes toString

	         // determine whether element is a BasePlusCommissionEmployee
	         if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
	         {
	            // downcast Employee reference to 
	            // BasePlusCommissionEmployee reference
	            BasePlusCommissionEmployee employee = 
	               ( BasePlusCommissionEmployee ) currentEmployee;

	            double oldBaseSalary = employee.getBaseSalary();
	            employee.setBaseSalary( 1.10 * oldBaseSalary );
	            System.out.printf( 
	               "new base salary with 10%% increase is: $%,.2f\n",
	               employee.getBaseSalary() );
	         } // end if

	         System.out.printf( 
	            "earned $%,.2f\n\n", currentEmployee.earnings() );
	      } // end for

	      // get type name of each object in employees array
	      for ( int j = 0; j < employees.length; j++ )
	         System.out.printf( "Employee %d is a %s\n", j, employees[ j ].getClass().getName() ); 
	   } // end main
	} // end class PayrollSystemTest

