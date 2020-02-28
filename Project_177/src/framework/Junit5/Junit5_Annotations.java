package framework.Junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Junit5_Annotations 
{

	

	@Test //Invoke method without object cration
	void Tc001() 
	{
		System.out.println("Tc001 executed");
	}
	
	@Test //Invoke method without object cration
	void Tc002() 
	{
		System.out.println("Tc002 executed");
	}
	
	@Test //Invoke method without object cration
	void Tc003() 
	{
		System.out.println("Tc003 executed");
	}
	
	
	@BeforeAll//Invoke before execution of first @Test annotation
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("precondition for class");
	}

	@AfterAll//invoke after last @Test annoataion
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("Post-condition class");
	}

	@BeforeEach//Invoke before each @Test annotaion
	void setUp() throws Exception
	{
		System.out.println("Method_precondition");
	}

	@AfterEach //Invoke After each @Test annotation
	void tearDown() throws Exception 
	{
		System.out.println("Method post condition"+"\n");
	}

}
