package com.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {	List<String> lists = null ;               //定义List
    	lists = new ArrayList<String>();          //实例化List
    	int[] numbers = new int[50];
    	for (int i = 0; i < 50; i++) {
    		int num = (int)(Math.random() * 100);
    		lists.add(String.valueOf(num));
		}
    	
    	
    	
    	System.out.println(lists);
        
    }
}
