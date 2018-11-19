package com.biz1.swathi;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCluster;
import org.apache.ignite.IgniteCompute;
import org.apache.ignite.Ignition;
import org.apache.ignite.cluster.ClusterGroup;

public class loginn
{
	public static void main(String args[])
	{
		Ignition.setClientMode(true);
		 
		// Here, we provide the cache configuration file
		try(Ignite ingite = Ignition.start("E:\\Bizruntime\\softwares\\apache-ignite-fabric-2.6.0-bin\\config\\itc-poc-config.xml"))
		{
			
			IgniteCluster cluster=ingite.cluster();
			ClusterGroup cg=cluster.forRemotes();
			
			IgniteCompute compute=ingite.compute(cg);
			
			compute.broadcast(() -> System.out.println("Hello Mahesh"));
		}
	}
}
