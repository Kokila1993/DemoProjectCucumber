package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	public static void generateReports(String json) {
		
		File file = new File("C:\\Users\\kokpa\\eclipse-workspace\\new\\CucumberTestingAugust\\target");
		
		Configuration con = new Configuration(file, "DemoSite");
		
		con.addClassifications("User", "Kokila");
		con.addClassifications("Tool", "Eclipse-Oxygen 3a");
		con.addClassifications("Java Version", "jdk 1.8");
		
		List<String> li = new LinkedList<String>();
		li.add(json);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();

	}

}
