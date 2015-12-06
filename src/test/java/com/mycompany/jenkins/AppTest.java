package com.mycompany.jenkins;

import static org.junit.Assert.*;
import org.junit.*;


public class AppTest {
	
	String str1 = "Amor";
	String str2 = "Amar";
	
	@Before
	public void setUp()
	{
		System.out.print("Comienza el test: ");
	}

	
	@org.junit.Test
	public void TestCreaObjeto() {
		System.out.println("Creación correcta Objeto");
		assertNotNull("EL Objeto ha sido creado Correctamente",new App());
	}
	
	@org.junit.Test
	public void TestSonDistintos() {
		
		System.out.println("Son Distintos");
		System.out.println("\""+str1+"\" y \""+str2+"\" se diferencian en:  1\n");
		assertEquals("\""+str1+"\" y \""+str2+"\" se diferencian en: ", 1, 
					App.computeLevenshteinDistance(str1,str2));
	}
	
	@org.junit.Test
	public void TestSonIguales() {
		
		System.out.println("Son Iguales");
		System.out.println("\""+str1+"\" y \""+str1+"\" no se diferencian\n");
		assertNotEquals("\""+str1+"\" y \""+str1+"\" son iguales", 1, App.computeLevenshteinDistance(str1,str1));
	}


}

