package com.biz1.swathi;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;

public class login 
{
	public static void main(String args[])
	{
				 
		// Here, we provide the cache configuration file
		Ignite obj1 = Ignition.start("F:\\Ignite\\apache-ignite-fabric-2.6.0-bin\\config\\default-config.xml");
 
		// create cache if not already existing
		IgniteCache<Integer, String> objCache1 = obj1.getOrCreateCache("myFirstIgniteCache");
 
		// Populating the cache with few values
		objCache1.put(1, "Bhavi");
		objCache1.put(2, "mani");
		objCache1.put(3, "Chandhu");
		objCache1.put(4, "Sravani");
		objCache1.put(5, "Anjali");
		objCache1.put(6, "mahi");
 
	      obj1.compute().broadcast(()->System.out.println(objCache1.get(1) + "\n " + objCache1.get(2)+ "\n " + objCache1.get(3)+ "\n " + objCache1.get(4)+ "\n " + objCache1.get(5)));

	}
}
