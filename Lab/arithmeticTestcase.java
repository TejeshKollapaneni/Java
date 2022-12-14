1.create calculator class with add,sub,mul,div and prepare junit test cases with assert classes


I.pom.xml


<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.javatpoint</groupId>
  <artifactId>junitLab</artifactId>
  <version>0.0.1-SNAPSHOT</version>
  <packaging>maven-plugin</packaging>

  <name>junitLab Maven Plugin</name>

  <!-- FIXME change it to the project's website -->
  <url>http://maven.apache.org</url>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
  </properties>

  <dependencies>
    
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.8.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
</project>



II.calculator class

package com.javatpoint.junitLab;

public class Calculator
{
    public static int add(int x,int y)
    {
    	return x+y;
    }
	
    public static int sub(int x,int y)
    {
    	return x-y;
    }
	
    public static int mul(int x,int y)
    {
    	return x*y;
    }
	
    public static int div(int x,int y)
    {
    	return x/y;
    }
	
}

III.Testcases with assert classes

package com.javatpoint.testCases;
import static org.junit.Assert.*;

import com.javatpoint.junitLab.Calculator;
import com.javatpoint.junitLab.Calculator.*;
import org.junit.Test;

public class TestCase {

	@Test
	public void test() 
	{
		System.out.println("Arithmetic operations");
		AssertEquals(5,Calculator.add(3,2));
		AssertEquals(2,Calculator.sub(4,2));
		AssertEquals(10,Calculator.mul(5,2));
		AssertEquals(8,Calculator.div(16,2));
	}
}
