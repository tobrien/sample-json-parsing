package com.discursive.answers;

import java.io.InputStream;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.commons.io.IOUtils;

public class GeneratingJson {

    public static void main(String[] args) throws Exception {

    	JSONObject json = new JSONObject();
    	
    	// Put a simple element
    	json.put( "aircraft", "A320");
    	
    	// Add a JSON Object
    	JSONObject pilot = new JSONObject();
    	pilot.put( "firstName", "John");
    	pilot.put( "lastName", "Adams");
    	json.put( "pilot", pilot);

    	// Accumulate values in an array
    	json.accumulate("passenger", "George Washington");
    	json.accumulate("passenger", "Thomas Jefferson");
    	
    	// Passing a number to toString() adds indentation
    	System.out.println( "JSON: " + json.toString(2) );
    }
}