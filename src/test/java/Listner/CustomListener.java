package Listner;

import org.testng.IExecutionListener;

public class CustomListener implements IExecutionListener {
	
	public void onexecutionstart()
	{
		long starttime = System.currentTimeMillis();
		System.out.println("Finish execution" + starttime + "   ");
	}
	
	
	public void onexecutionfinish()
	{
		long Endtime = System.currentTimeMillis();
		System.out.println("Finish execution" + Endtime + "   ");
	}

}
