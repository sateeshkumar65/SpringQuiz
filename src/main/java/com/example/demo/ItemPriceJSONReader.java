package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ItemPriceJSONReader {

	public static void main(String[] args) {
	
		JSONParser parser = new JSONParser();
		List<Item> itemsList= null;
		
		try {
			JSONArray jsonArray =(JSONArray)parser.parse(new FileReader("/Users/sapasupula/Documents/PivotalWorkspace/testdummy/src/main/resources/itemPrices.json"));
			 for(Object Object : jsonArray) {
				 JSONObject jsonObject= (JSONObject) Object;
				 Item item = new Item();
			 }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
