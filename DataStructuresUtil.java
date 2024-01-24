package com.sandbox.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class DataStructuresUtil 
{

	public int addLinkedList(LinkedList<Integer> l1, LinkedList<Integer> l2)
	{
		int x=0;
		l1.forEach(p-> 
		{
			//x = (x*10 + p.intValue());
		});

		int y=0;
		l1.forEach(p-> 
		{
		//	y = (y*10 + p.intValue());
		});		
		
		return 0;
	}
	
	public static void main(String[] args)
	{
		DataStructuresUtil btu = new DataStructuresUtil();
		btu.testStr("balaji","asdf","asdf");
		btu.testStr("balaji","asdf","asdf","234");
		//btu.lambdaExpr();
		//btu.genericsExpr();
		//btu.getRecords();
//		
//		int[] params = new int[]
//				{
//						10, 40,30,20, 50, 100,5,90,75, 20
//				};
//		System.out.println("before");
//		for(int i=0;i<params.length;i++) System.out.print(params[i]+",");
//		//int[] params1 = btu.sortIntegers( Arrays.stream(params).boxed().toArray(Integer[]::new));
//		int[] params1 = btu.insertionSort(params);
//		System.out.println("\nafter");
//		for(int i=0;i<params1.length;i++) System.out.print(params1[i]+",");
//		System.out.println("\n");
//		System.out.println(btu.binarySearch(100, params1));
//		
//		String[] str = new String[]
//				{
//						"abc",
//						"fgh",
//						"dcd",
//						"dc",
//						"abdef"
//				};
		
		//btu.sortIntegers( Arrays.stream(params).boxed().toArray(Integer[]::new));
		//btu.sortStrings(str);
		
//		DemoVolatile demoVolatile = new DemoVolatile();
//		Thread thrd = new Thread()
//				{
//					public void run()
//					{
//						try 
//						{
//							System.out.println("Thread 1 going to sleep: ");		
//							DemoVolatile.printParam();
//							DemoVolatile.updateThread1(20);
//							Thread.sleep(10000);
//							System.out.println("Thread 1 wakes up");
//							DemoVolatile.printParam();
//						}catch(InterruptedException ie)
//						{
//							ie.printStackTrace();
//						}
//					}
//				};
//		thrd.start();
//		try {
//		Thread.sleep(2000);
//		}catch(Exception e1) { e1.printStackTrace();}
//		Thread thrd1 = new Thread()
//		{
//			public void run()
//			{
//				try 
//				{
//					System.out.println("Thread 2 going to sleep");		
//					DemoVolatile.printParam();
//					DemoVolatile.updateThread1(30);
//					Thread.sleep(10000);
//					System.out.println("Thread 2 wakes up");
//					DemoVolatile.printParam();
//				}catch(InterruptedException ie)
//				{
//					ie.printStackTrace();
//				}
//			}
//		};
//		thrd1.start();		
 	}
	
	public int[] insertionSort(int[] inpStr)
	{
		int[] abc=new int[inpStr.length];
		
		//10,5,20,6,20
		
		for(int i=1;i<inpStr.length;i++)
		{
			int cVal = inpStr[i]; // 5  //20
			int j = i-1; // 0  //1
			while(j>=0 && inpStr[j] > cVal)   //0 & 10 > 5  // 1 & 10 > 20
			{
				inpStr[j+1] = inpStr[j]; // x, 10 //na //
				j--; //-1 //na
			}
			inpStr[j+1] = cVal;  //5 //20
			
			//5,10,20,6,20
			//5,10,20,6,20
			//
			
		}
		
		
		return inpStr;
	}
	
	public int binarySearch(int value, int[] list)
	{
		int start =0;
		int end = list.length-1;
		
		
		while(start <= end)
		{
			System.out.println(start + "<=" + end);
			int middlePosition = (start + end) / 2;
			if(list[middlePosition] == value) return middlePosition;
			if(value < list[middlePosition])  
				end=middlePosition-1; 
			else 
				start=middlePosition+1;
		}
		
		return -1;
	}
	
	public List<?> getRecords()
	{
		
		LinkedList<DataFile> lst = new LinkedList<>();
		
		DataFile emp1 = new DataFile("1","test", "01/20/2023");
		DataFile emp2 = new DataFile("2","test1", "01/20/2023");
		DataFile emp3 = new DataFile("1","test2", "01/20/2023");
		
		lst.add(emp1);
		lst.add(emp2);
		lst.add(emp3);
		
		lst.forEach((s)->
		{ 
			System.out.println(s);
			//if(s.equals(lst.))
		});
		
		return null;
	}
	
	public void sortStrings(String[] params)
	{
		List<String> lst=Arrays.asList(params);
		
		for(int i=0;i<lst.size();i++) 
		{
			System.out.print(lst.get(i) + ",");
		}			
		
		Collections.sort(lst);
		System.out.println("Sorting now \n");
		
		for(int i=0;i<lst.size();i++) 
		{
			System.out.print(lst.get(i) + ",");
		}
		
	}
	
	public void lambdaExpr()
	{
		GreetingsInterface hiMsg = s -> "Hi " + s;
		System.out.println(hiMsg.hiMessage("balaji"));
		System.out.println(hiMsg.hiMessage("abc"));
	}
	
	public void genericsExpr()
	{
		GenericsSample<String> gSample = new GenericsSample <>("balaji");
		GenericsSample<Integer> gSample1 = new GenericsSample <>(new Integer(50));
		gSample.printVal("bt");
		gSample.printVal(250);
		gSample.printVal(null);
		
		
		
		//gSample1.printVal(new Integer(250));
		
	}

	public void testStr(String...abc)
	{
		System.out.println("Length->"+ abc.length);
		
	}
	
	public void printList(List<?> lst)
	{
		lst.forEach(s -> System.out.println(s));
	}
	
	public int[] sortIntegers(Integer[] params)
	{
				
		ArrayList<Integer> al = new ArrayList(); 

		for(int i=0;i<params.length;i++) 
		{
			al.add(params[i]);
			System.out.print(params[i] + ",");
		}	
		Collections.sort(al, new CompareInt());
		
		System.out.println("Sorting now \n");
		int[] retVal = new int[al.size()];
		for(int i=0;i<al.size();i++) 
		{
			retVal[i]=al.get(i);
			System.out.print(al.get(i) + ",");
		}	
		return retVal;
	}

	public int binarySearch1(int value, int[] list)
	{
		int start =0;
		int end = list.length-1;
		
		
		while(start <= end)
		{
			//System.out.println(start + "<=" + end);
			int middlePosition = (start + end) / 2;
			if(list[middlePosition] == value) return middlePosition;
			if(value < list[middlePosition])  
				end=middlePosition-1; 
			else 
				start=middlePosition+1;
		}
		
		return -1;
	}	
	public int binarySearch(int[] list) //int value, int[] list)
	{
		//int[] list = this.insertionSort(list1);
		
		int start =1;
		int end = list.length;		
		
		System.out.println("list length ->"+list.length);
		
		int returnValue=-1;
		
		if(list.length==1) 
		{
			System.out.println("only one element");
			return list[0];
		}
		if(list.length==2)
		{
			System.out.println("only two elements");
			return (list[0]>list[1] ? list[1]:list[0]);
		}
//		while(start <= end)
//		{
			
			int middlePosition = (start-1 + end) / 2; //mid = 3, 			
			
			
			//if(list[list.length-1] > list[middlePosition])  //
			//System.out.println("middle position element->"+list[middlePosition]);
			//7,2,1  - is on the right side
			//System.out.println("checking if minimum on the right side: " + list[middlePosition] + ">" + list[middlePosition-1] + "&&" + list[middlePosition] +">"+ list[middlePosition+1] );
			if(list[middlePosition] > list[middlePosition-1] && list[middlePosition] > list[middlePosition+1])  //
			{
					//if(list[middlePosition] < list[middlePosition+1]) return list[middlePosition];
					//minimum is on the right side
					//call binarysearch with middlePosition+1..end
					
					//returnValue=this.binarySearch(this.getSliceOfArray(list, middlePosition>0? middlePosition-1: middlePosition, end));
					returnValue=this.binarySearch(this.getSliceOfArray(list, middlePosition, end));
			}		
			//7,1,2 -return the value
			//System.out.println("checking if minimum is the middle element " + list[middlePosition] + "<" + list[middlePosition-1] + "&&" + list[middlePosition] +">"+ list[middlePosition+1] );
			else if (list[middlePosition] < list[middlePosition-1] && list[middlePosition] < list[middlePosition+1])
			{
				System.out.println("minimum is the middle element: " + list[middlePosition] + "<" +list[middlePosition-1] + "&&" + list[middlePosition] +"<"+ list[middlePosition+1] );
				return list[middlePosition];
			}
			//2,1,7
			else
			{
				System.out.println("minimum on the left side: ");
				//minimum is on the left side
				//call binarysearch with middlePosition-1..start	
				returnValue=this.binarySearch(this.getSliceOfArray(list, 0, middlePosition));
			}

//		}
		
		return returnValue;
	}	
	
    public int[] getSliceOfArray(int[] arr,
            int start, int end)
{

// Get the slice of the Array
int[] slice = new int[end - start];

// Copy elements of arr to slice
for (int i = 0; i < slice.length; i++) {
slice[i] = arr[start + i];
System.out.print(slice[i]+",");
}
//System.out.println("");
// return the slice
return slice;
}		
}




class AnonymousInnerClassDemo
{
	
}

class DemoVolatile
{
	static volatile int param1=0;
	static int param2=0;
	public static void updateThread1(int x)
	{
		param1=x;
		param2=x;
	}
	
	public static void printParam()
	{
		System.out.println(param1);
		System.out.println(param2);
	}

}


class CompareInt implements Comparator<Integer>
{
	public int compare(Integer parm1, Integer parm2)
	{
		return parm1 - parm2;
	}
}
