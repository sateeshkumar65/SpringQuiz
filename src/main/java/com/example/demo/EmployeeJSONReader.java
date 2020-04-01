package com.example.demo;


import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class EmployeeJSONReader {

	public static void main(String[] args) {
	
		JSONParser parser = new JSONParser();
		
		try {
			JSONArray jArray =(JSONArray)parser.parse(new FileReader("/Users/sapasupula/Documents/PivotalWorkspace/testdummy/src/main/resources/EMPJSONDATA.json"));
		    
			for(Object object :jArray) {
				JSONObject jObject = (JSONObject) object;
				Long empNo=(Long)jObject.get("EMPNO");
				System.out.println(empNo);
				
				String empName=(String)jObject.get("EMP_NAME");
				System.out.println(empName);
				
				String dob=(String)jObject.get("DOB");
				System.out.println(dob);
				
				String doj=(String)jObject.get("DOJ");
				System.out.println(doj);
				
				String role=(String)jObject.get("ROLE");
				System.out.println(role);
				
				
			}
			
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
