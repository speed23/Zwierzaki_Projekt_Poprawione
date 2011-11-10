package com.pilecki1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;

import org.apache.log4j.Logger;

public class Zoo {
	
	
private List<Zwierzeta> Zwierzeta = new ArrayList<Zwierzeta>();
private Logger logger=Logger.getLogger(Zoo.class);
private String nazwa;

private Collection<?> z;

public Zoo(String nazwa) 
{
		
	super();
	this.Zwierzeta=new ArrayList<Zwierzeta>();
	this.nazwa=nazwa;
		
}
	
	
public void wypiszZwierzeta()
{
	for (Zwierzeta z : Zwierzeta)
	{
		z.WypiszZwierze();
	}
}
	
	
public void DodajZwierze(Zwierzeta z)
{
		
	Zwierzeta.add(z);
	PropertyConfigurator.configure("Log4J.properties");
	String zw;
	logger.info("Zwierze " + z + "Zosta³o dodane " + this);

}
	
public void UsunZwierze(Zwierzeta z)
{
	Zwierzeta.remove(z);
}
	
	
	
public int IstniejeZwierze(Zwierzeta z)
{
	return Zwierzeta.indexOf(z);
}

public void UsunWszystkieZwierzeta()
{
	Zwierzeta.removeAll(z);	
	
}

public void DodajWszystkieZwierzeta()
{
	Zwierzeta.addAll((Collection<? extends com.pilecki1.Zwierzeta>) z);
}
	
public List<Zwierzeta> ZwrocZwierzeta() 
{
	return Zwierzeta;
}
	

public Zwierzeta ZnajdzpoNazwie(ZwierzetaRodzaj nazwa){

for (Zwierzeta z : Zwierzeta)
{	
	if (z.nazwa().equals(nazwa))
{		
	return z;
}
}
	return null;
}
	
  
public void zmienZwierze(Zwierzeta z, String noweZwierze, String nowyRodzaj)
{
	this.nazwa= noweZwierze;	
}
	
	
}
