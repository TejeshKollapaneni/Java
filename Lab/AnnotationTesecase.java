prepare junit test case with given below annotations
//BeforeClass//
//AfterClass//
//Before//
//After//
//Test//




package com.javatpoint.testCases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.javatpoint.junitLab.Calculator;

public class anotation 
{

	@BeforeClass//Before class
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Before class");
		
	}

	
		
	

	@Before//before
	public void setUp() throws Exception 
	{
		System.out.println("before annotation");
		
	}
	@Test//test
	public void test() 
	{
		System.out.println("Add method");
		AssertEquals(3,Calculator.add(2, 1));	
	}
	
	
	@Test//testcase
	public void test1() 
	{
		
		System.out.println("sub method");
		AssertEquals(6,Calculator.sub(6,3));	
	}
	
	@Test//testcase
	public void test2() 
	{
		
		System.out.println("multiplication method");
		AssertEquals(8,Calculator.mul(2, 4));	
	}
	
	@Test//testcase
	public void test3() 
	{
		System.out.println("division  method");
		
		AssertEquals(9,Calculator.div(18, 2));	
	}
	

	@After//after
	public void tearDown() throws Exception
	{
		
		System.out.println("After annotation");
	}


	@AfterClass//afterclass
	public static void setUpAfterClass() throws Exception 
	{
		System.out.println("After class");
		
	}

	

}