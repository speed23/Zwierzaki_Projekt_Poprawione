package com.pilecki1;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;



public class Main {

	
private static Logger logger= Logger.getLogger(Main.class);
	
public static void main(String[] args) {

	
PropertyConfigurator.configure("log4j.properties");
	
Zoo z= new Zoo("Zoo w Gdansku");

z.DodajZwierze(new Zwierzeta(ZwierzetaRodzaj.¯yrafa,"ssak", 10));
z.DodajZwierze(new Zwierzeta(ZwierzetaRodzaj.Zebra,"Ssak", -2));
z.DodajZwierze(new Zwierzeta(ZwierzetaRodzaj.¯aba,"P³az", 4));
z.DodajZwierze(new Zwierzeta(ZwierzetaRodzaj.Krokodyl,"Gad", 5 ));

Zwierzeta zw=new Zwierzeta(ZwierzetaRodzaj.Lew,"ssak", 10);

z.wypiszZwierzeta();


try {
zw.UstalWiek(-1.0);
} catch (MyException e) {

logger.error(e);

logger.info(e);

}

System.out.println(z);
}

}

