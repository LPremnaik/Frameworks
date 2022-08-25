//package org.jvmreports;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.List;
//
//import net.masterthought.cucumber.Configuration;
//import net.masterthought.cucumber.ReportBuilder;
//
//public class Reporting {
//	public static void generateReport(String json) {
//		File f=new File("C:\\Users\\91833\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\Selenium\\Cucumberframeworks\\target");
//		Configuration con=new Configuration(f, "Facebook validation");
//
//		con.addClassifications("Operating system", "Windows");
//		con.addClassifications("Version", "11");
//		List<String> a = new ArrayList();
//		a.add(json);
//		ReportBuilder r = new ReportBuilder(a, con);
//		r.generateReports();
//
//
//	}
//
//}
