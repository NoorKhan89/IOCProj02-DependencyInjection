package com.nt.client;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasionFinder;

public class DependencyInjectionTest {
public static void main(String args[])
{
	// IOC container 
	FileSystemXmlApplicationContext  ctx = 
			new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml"); 
	
	// get the target spring beans class object
	
	Object obj = ctx.getBean("sf");
	SeasionFinder finder=(SeasionFinder) obj;
	// invoke the b.methode
	String result = finder.findoutSeasnName("Noor Mohammed Khan ");
	System.out.println(result);
	
	ctx.close();
}
}
