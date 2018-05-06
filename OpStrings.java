package com.myproject;
import java.util.*;
import java.lang.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Opstrings {
    
    public static String vertMirror (String strng) 
    {
        // Parse string, add to array. Reverse each component of the array in place. 
        // create a new string and return it
    	String[] tokens = strng.split("\n");
    	List<String> fin = Arrays.stream(tokens).map(a -> new StringBuilder(a).reverse().toString()).collect(Collectors.toList());
    	return String.join("\n", fin);
    }
    
    public static String horMirror (String strng)
    {
        // change the order of the string
    	String[] horArray = strng.split("\n");
    	Collections.reverse(Arrays.asList(horArray));
    	return String.join("\n", horArray);
    	
    }
    
    public static String oper(Function<String, String> operator, String s) 
    {
        return operator.apply(s);
    }
}
