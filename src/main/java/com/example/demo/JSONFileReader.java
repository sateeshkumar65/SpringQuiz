package com.example.demo;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONFileReader {

	public static void main(String[] args) {
		
		try {
		JSONParser parser = new JSONParser();
		
		FileReader reader= new FileReader(new File("/Users/sapasupula/Documents/PivotalWorkspace/testdummy/src/main/resources/JSON.json"));
		Object obj=parser.parse(reader);
		
		JSONObject jObject = (JSONObject) obj;
		
		JSONArray companyList=(JSONArray)jObject.get("Company List");
		
		Iterator<JSONObject> cmpListIt=companyList.iterator();
		 while(cmpListIt.hasNext()) {
			 System.out.println(cmpListIt.next());

		 }
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
