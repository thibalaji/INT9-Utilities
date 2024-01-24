package com.sandbox.util;

import java.util.Stack;
import java.util.stream.Stream;

/**
 * Simple utilities to help compiler design.
 * 
 * @author Balaji
 * 
 *
 */

public class LexiconHelperUtil {
	
	public static void main(String args[])
	{
		LexiconHelperUtil lUtil = new LexiconHelperUtil();
		
		String abc = "main{abc;jkl;for(i<10{print x}}abc";
				
		System.out.println(lUtil.preCompilerValidation(abc, '{', '}'));
		System.out.println(lUtil.getCompilableBlock(abc));
	}
	
	
    public boolean preCompilerValidation(String program, char delimiterStart, char delimiterEnd)
    {
    	Stack<Character> stck = new Stack<>();
    	char[] chars = program.toCharArray();
    	for(int i=0;i<chars.length;i++)
    	{
    		if(chars[i] == delimiterStart)
    		{
    			stck.push(new Character(chars[i]));
    		}
    		if(chars[i] == delimiterEnd)
    		{
    			stck.pop();
    		}    		
    	}
    	
    	
    	return stck.isEmpty();
    }

    public static String getCompilableBlock(String inputStr)
    {
    	StringBuffer jsonStr = new StringBuffer();
    	Stack<Character> stck = new Stack<>();
    	char[] chars = inputStr.toCharArray();
    	boolean start=false;
    	for(int i=0;i<chars.length;i++)
    	{
 
    		if(chars[i] == '{' && stck.isEmpty())
    		{
    			stck.push(new Character(chars[i]));
    			start=true;
    		}
    		if(start)  jsonStr.append(chars[i]);
    		if(chars[i] == '}' &&stck.size()==1)
    		{
    			stck.pop();
    			start=false;
    		}
    		

    		
    	}    	
    	
    	return jsonStr.toString();
    }
}
