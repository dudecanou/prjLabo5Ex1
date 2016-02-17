package com.sircus.prjLabo5Ex1;

import java.util.Calendar;

public class Reparateur extends Employee{
	
	private int nbrAppareil;
	private double tarifRep;

	public Reparateur(String first, String last, String ssn, Calendar date, int nbr, double tarif) {
		super(first, last, ssn, date);
		setNbrAppareil(nbr);
		setTarifRep (tarif);
		
		// TODO Auto-generated constructor stub
	}

	//------------------------------ Nombre Appareil -----------------------------
	public int getNbrAppareil() {
		return nbrAppareil;
	}

	public void setNbrAppareil(int nbrAppareil) {
		this.nbrAppareil = ( nbrAppareil < 0 ) ? 0 : nbrAppareil;
	}

	//------------------------------ Nombre Appareil -----------------------------

	public double getTarifRep() {
		return tarifRep;
	}

	public void setTarifRep(double tarifRep) {
		this.tarifRep = ( tarifRep < 0.0 ) ? 0.0 : tarifRep;
	}

	
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return getNbrAppareil() * getTarifRep() ;
	}
	
	public String toString()
	{
		return String.format( "%s: %s\n%s: %d; %s: $%.2f",
				"Reparateur", super.toString(),
				"Appareils", getNbrAppareil(), 
				"Tarif", getTarifRep());
	}

}
