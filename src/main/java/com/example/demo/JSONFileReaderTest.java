package com.example.demo;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONFileReaderTest {

	public static void main(String[] args) {
		
		try {
		JSONParser parser = new JSONParser();
		
		Object object= parser.parse(new FileReader("/Users/sapasupula/Documents/PivotalWorkspace/testdummy/src/main/resources/JSON.json"));
		 JSONObject jsonObject = (JSONObject) object;
		 JSONArray jsonArray= (JSONArray)jsonObject.get("Company List");
		 Iterator jsonIterator =jsonArray.iterator();
		 while(jsonIterator.hasNext()) {
			String company=(String) jsonIterator.next();
			System.out.println(company);
		 }
		
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
