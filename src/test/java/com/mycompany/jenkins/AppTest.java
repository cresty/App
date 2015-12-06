package com.mycompany.jenkins;

import static org.junit.Assert.*;
import org.junit.*;


public class AppTest {
	
	String str1 = "Vaca";
	String str2 = "Baca";
	
        /**
         *Clausula @Before, crea un mensaje que será ejecutado antes de cada uno de los test
         */
        
	@Before
	public void setUp()
	{
		System.out.print("Comienza el test: ");
	}

	/**
         * Prueba para saber si crea bien el objeto del objeto.
         */
        
	@org.junit.Test
	public void TestCreaObjeto() {
		System.out.println("Creación correcta Objeto");
		assertNotNull("EL Objeto ha sido creado Correctamente",new App());
	}
	
        /**
         *  Prueba para ver si el algoritmo reconoce dos valores diferentes
         */
        
	@org.junit.Test
	public void TestSonDistintos() {
		
		System.out.println("Son Distintos");
		System.out.println("\""+str1+"\" y \""+str2+"\" se diferencian en:  1\n");
		assertEquals("\""+str1+"\" y \""+str2+"\" se diferencian en: ", 1, 
					App.computeLevenshteinDistance(str1,str2));
	}
        
        /**
         *  Prueba para ver si el algoritmo reconoce dos valores iguales
         */
	
	@org.junit.Test
	public void TestSonIguales() {
		
		System.out.println("Son Iguales");
		System.out.println("\""+str1+"\" y \""+str1+"\" no se diferencian\n");
		assertNotEquals("\""+str1+"\" y \""+str1+"\" son iguales", 1, App.computeLevenshteinDistance(str1,str1));
	}


}

