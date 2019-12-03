package com.cj.ald;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	
	public static void main(String[] args)
	{
       List<Object> al=new ArrayList();
        al.add("12");
        al.add(12.0);
        al.add(12);
        al.add(true);
        System.out.println(al);
        List al1=Collections.synchronizedList(al);
        System.out.println(al1);
        
		
	}
}
