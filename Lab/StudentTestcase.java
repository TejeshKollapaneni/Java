3.prepare junit test case with students collection list

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


II.Student class


package com.javatpoint.junitLab;

import java.util.ArrayList;

public class Stu 
{
    public static int details(int sid)
    {
    	return sid;
    }
    

    public static String details1(String sname)
    {
    	return sname;
    }
}



III.testcase with collection



package com.javatpoint.testCases;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.javatpoint.junitLab.Stu;

public class StudentTesecase 
{

	@Test
	public void test() 
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		assertEquals(1,Stu.details(1));
	}
	
	@Test
	public void test1() 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("regi");
		assertEquals("regi",Stu.details1("regi"));
	}
	
}