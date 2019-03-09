package com.bridgeit.designpattern;


public class ProxyDPExecution {

	public static void main(String[] args) 
	{
		
		CommandExecutorProxy executor = new CommandExecutorProxy("Admin", "123456");
	        try {
	            executor.runCommand("ls -ltr");
	            executor.runCommand("rm -rf abc.pdf");
	        } catch (Exception e) {
	            System.out.println("Exception Message:: " + e.getMessage());
	        }
		
	}

}
