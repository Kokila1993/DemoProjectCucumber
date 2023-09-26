package org.login;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature\\luma.feature",glue="org.demo",
snippets=SnippetType.CAMELCASE, 
monochrome=true,
dryRun=false,
plugin = {"html:target\\html Report",
		  "junit:target\\junit Report.xml",
		  "json:target\\json Report.json"
}
)

public class RunnerClass {
	
	@AfterClass
	
	public static void tc01() {
		
		ReportingClass.generateReports("target\\json Report.json");
	}
	

}
