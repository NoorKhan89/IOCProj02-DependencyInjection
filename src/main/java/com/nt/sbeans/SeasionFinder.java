package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasionFinder {
	@Autowired
private LocalDate date;
	public SeasionFinder()
	{
	System.out.println("SeasionFinder :: 0 Param Constructore");
	}
	
	public String findoutSeasnName(String user)
	{
		System.out.println("Seans Finder : Findout Season name() ");
		// get current months values;
		int month =date.getMonthValue();
		//show the season name 
		if (month >= 3 && month <=6) {
			return "Hot summer wishess to user :: -> "+user;
		}
		else if (month >=7 && month <=10) {
			return "Cool winter monsoon :: -> "+user;
		}
		else {
			return " Drizzilng monsoon wishes ::-> "+user;
		}
	}
}
