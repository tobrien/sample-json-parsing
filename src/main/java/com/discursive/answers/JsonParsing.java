package com.discursive.answers;

import java.io.InputStream;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.commons.io.IOUtils;

public class JsonParsing {

    public static void main(String[] args) throws Exception {
    	InputStream is = 
    		JsonParsing.class.getResourceAsStream( "sample-json.txt");
    	String jsonTxt = IOUtils.toString( is );
    	
    	JSONObject json = (JSONObject) JSONSerializer.toJSON( jsonTxt );    	
    	double coolness = json.getDouble( "coolness" );
    	int altitude = json.getInt( "altitude" );
    	JSONObject pilot = json.getJSONObject("pilot");
    	String firstName = pilot.getString("firstName");
    	String lastName = pilot.getString("lastName");
    	
    	System.out.println( "Coolness: " + coolness );
    	System.out.println( "Altitude: " + altitude );
    	System.out.println( "Pilot: " + lastName );
    }
}