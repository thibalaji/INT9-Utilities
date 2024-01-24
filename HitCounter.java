package com.sandbox.util;

import java.util.Date;

/**
 * Implementation to track hits in the last 5 minutes.
 * @author Balaji
 *
 */

public class HitCounter {
	public static int[] count=new int[5];
	static int TRACK_DURATION=5;
  static int SLEEP_DURATION=1000;  //in milliseconds

	public static void recordHit(Date tmpstmp)
	{
		
		
		count[tmpstmp.getMinutes()%HitCounter.TRACK_DURATION]++; 
		for(int i=0;i<count.length;i++)
		{
			System.out.println("index="+i+",count="+count[i]);
		}
		
			//  58/5=
			//int epoch = tmpstmp.getMinutes() / 5;
			
	}
	
	public static void main(String[] args)
	{
		Thread thread = new Thread()
		{
			public void run()
			{
				for(int i=0;i<300;i++)
				{
					try 
					{
						Thread.sleep(HitCounter.SLEEP_DURATION);
					}catch(Exception e1) 
					{
						e1.printStackTrace();
					}
					HitCounter.recordHit(new Date());
				}
			}
		};
		thread.start();
	}
}
