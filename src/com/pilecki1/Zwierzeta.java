package com.pilecki1;

public class Zwierzeta {

		

public Zwierzeta(ZwierzetaRodzaj nazwa, String rodzaj, double wiek)
{
	this.nazwa=nazwa;
	this.rodzaj=rodzaj;
	this.wiek=wiek;
}


public void WypiszZwierze()
{
	System.out.println("Nazwa: "+nazwa+"\tRodzaj: "+ rodzaj);
}
	

public void UstalWiek(double wiek) throws MyException
{
	if(wiek < 0)
	throw new MyException("Wiek nie moze byc mniejsze od 0 bo wtedy zwierzatko nie urodzi³o sie");
	else
	this.wiek=wiek;
}
	
	
public double Wiek() 
{
	return wiek;
}
	
	
public ZwierzetaRodzaj nazwa()
{
	return this.nazwa;
}

public void ustawNazwe(ZwierzetaRodzaj nazwa)
{
	this.nazwa=nazwa;
}
	
public String toString()
{
	return this.nazwa + " "+this.rodzaj;
}
	
public String pobierzRodzaj()
{
	return this.rodzaj;
}
	
	
private double wiek;
	
private ZwierzetaRodzaj nazwa;
	
private String rodzaj;

}
