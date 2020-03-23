package com.epam.tddjunitremove;

public class RemoveFirst2Char {
	
	public String remove(String input) {
	    String no_as="";
	    for(int i=0;i<2;i++){
	        if(input.charAt(i)!='A'){
	            no_as+=input.charAt(i);
	        }
	    }
	    String result = no_as+input.substring(2,input.length());
	    return result;
	}
}
