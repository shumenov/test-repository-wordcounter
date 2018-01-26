package com.example.wordcounter;

import org.apache.commons.text.StrTokenizer;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
    	StrTokenizer token = new StrTokenizer(s, ' ');
		return token.size();
    }
}
