package com.example.demo;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CarJSONReader {

	public static void main(String[] args) {
		
		JSONParser parser= new JSONParser();
		
		try {	
		JSONArray jsonArray =(JSONArray)parser.parse(new FileReader("/Users/sapasupula/Documents/PivotalWorkspace/testdummy/src/main/resources/TestJSON.json"));
		
		 for(Object jObject : jsonArray) {
			 JSONObject jsonObject= (JSONObject) jObject ;
			 
			String name=(String) jsonObject.get("name");
			System.out.println(name);
			
			String city=(String) jsonObject.get("city");
			System.out.println(city);
			
			 JSONArray carArray=(JSONArray)jsonObject.get("cars");
			 Iterator carIterator= carArray.iterator();
			 while(carIterator.hasNext()) {
				 System.out.println(carIterator.next());
			 }
			
			String job=(String) jsonObject.get("job");
			System.out.println(job);
			
			
		 }
		} catch (ParseException e) {
			
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
