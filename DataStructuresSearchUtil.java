package com.sandbox.util;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

class Product 
{
	public Product(int i, String name, float value)
	{
		this.value=value;
		this.name=name;
	}
	float value;
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class DataStructuresSearchUtil {
	
	

	
	
	public void testVarArgs(String...args)
	{
		for(String arg:args)
		{
			System.out.println(arg);
		}
	}
	
	private List filterByValue(List<Product> lst, int value)
	{
		Stream<Product> filteredList = lst.stream().filter(p -> p.value > value);
		filteredList.forEach(p->System.out.println(p.name));
		
		return null;
	}
	
	private String testLambdaExpr2()
	{
		
		String str="";
		
		//args.forEach((n)-> str + n);
		Runnable rn=()->{
			System.out.println("Thread created");
		};
		
		Thread thr= new Thread(rn);
		thr.start();
		
		return str;	
	}	

	private void testLambdaExpr(List<String>...listArgs1)
	{
		for(List<String> lstArgs:listArgs1)
		{		
			lstArgs.forEach((n)->{				
				System.out.println(n);
			});
		}
	}
	
	@SafeVarargs
	private void testListVarArgs(List<String>...listVarArgs)
	{
		for(List<String> lst:listVarArgs)
		{
			Iterator<String> itr=lst.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());				
			}
		}
	}
	
	private void testAnno()
	{
		CustomAnnotatedEmployee employee = new CustomAnnotatedEmployee(1,"test");
		Annotation anno=employee.getClass().getAnnotation(Company.class);
		Company company = (Company) anno;
		System.out.println(company.city());		
	}
	
	public boolean checkPalindrome(String abc)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=abc.length();i>0;i--)
		{
			sb.append(abc.charAt(i-1));			
		}
		
		return abc.equals(sb.toString());
	}
	
	public void sortIntegers(Integer[] params)
	{
		
		
		ArrayList<Integer> al = new ArrayList(); 

		for(int i=0;i<params.length;i++) 
		{
			al.add(params[i]);
			System.out.print(params[i] + ",");
		}	
		Collections.sort(al, new CompareInt1());
		
		System.out.println("Sorting now \n");
		
		for(int i=0;i<al.size();i++) 
		{
			System.out.print(al.get(i) + ",");
		}	
	}

	public void findSqRtOfArray(int[] params)
	{
		int[] params1 = new int[params.length];
		for(int i=0;i<params.length;i++)
		{
			params1[i] = (int) Math.sqrt(params[i]);
			System.out.println(params1[i]+",");
		}
		
	}
	
	
	public void findHigherNumberOfRepeatedStrings(List<String> lst)
	{
		String[][] abc=new String[lst.size()][];
		Map<String, Integer> hm=new HashMap<String, Integer>();
		Iterator itr=lst.iterator();
		int count1=0;
		String maxStr="";
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			Object val = hm.get(key);
			Integer count = Integer.sum(val==null ? 0:((Integer)val).intValue(), 1);
			hm.put(key, count);
			if(count1<count.intValue()) { count1=count.intValue(); maxStr=key;}
		}		
		
		System.out.println(maxStr + "occurs "+count1+" times");

	}
	
	public void test111()
	{
		DataStructuresSearchUtil bt = new DataStructuresSearchUtil();
		//bt.testVarArgs("balaji","testing","values","of","functions");
		List<String> lst1=Arrays.asList("balaji","testing","values","balaji","balaji","values","no");
		List<String> lst2=Arrays.asList("of","functions");
//		bt.testListVarArgs(lst1,lst2);
		//bt.testLambdaExpr(lst2,lst1);
		//bt.testLambdaExpr2();
		
	      List<Product> list=new ArrayList();  
	        list.add(new Product(1,"Samsung A5",17000f));  
	        list.add(new Product(3,"Iphone 6S",65000f));  
	        list.add(new Product(2,"Sony Xperia",25000f));  
	        list.add(new Product(4,"Nokia Lumia",15000f));  
	        list.add(new Product(5,"Redmi4 ",26000f));  
	        list.add(new Product(6,"Lenevo Vibe",19000f));  		
		//bt.filterByValue(list, 16000);
		
		String abc="madaam";
		//bt.findHigherNumberOfRepeatedStrings(lst1);
		//System.out.println(bt.checkPalindrome(abc));
		//bt.testAnno();
		
		int[] params = new int[]
				{
						10,75, 40,30,20, 50,20, 100,5,90,75, 20
				};
		//bt.sortIntegers( Arrays.stream(params).boxed().toArray(Integer[]::new));
		bt.findSqRtOfArray(params);		
	}
	
	public static void main(String[] args)
	{

		int[] beforePivot = { 1,2,3,4,5,6,7};
		int[] afterPivot1 = { 5,6,7,1,2,3,4};
		int[] afterPivot2 = { 4,5,6,7,1,2,3};
		DataStructuresSearchUtil abc=new DataStructuresSearchUtil();
		int searchVal=1;
		System.out.println("Minimum value in Pivot 1 is "+ (abc.binarySearch( afterPivot1)+1));
		System.out.println("Position of "+ searchVal+"in Pivot 2 is "+ (abc.binarySearch( afterPivot2)+1));
	}
	
	
	public int binarySearch1(int value, int[] list)
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
	
	
	public int binarySearch(int[] list) //int value, int[] list)
	{
		//int[] list = this.insertionSort(list1);
		
		int start =0;
		int end = list.length-1;		
		
		int returnValue=-1;
		
		if(list.length==1) return list[0];
		if(list.length==2) return list[0]>list[1] ? list[1]:list[0];
//		while(start <= end)
//		{
			
			int middlePosition = (start + end) / 2; //mid = 3, 
			
			System.out.println(list[list.length-1] + ">" + list[middlePosition]); 
			if(list[list.length-1] > list[middlePosition])  //
			{
				//minimum is on the right side
				//call binarysearch with middlePosition+1..end
				System.out.println("minimum on the right side");
				returnValue=binarySearch(this.getSliceOfArray(list, middlePosition>0? middlePosition-1: middlePosition, end));
			}			
			else
			{
				System.out.println("minimum on the left side");
				//minimum is on the left side
				//call binarysearch with middlePosition-1..start	
				returnValue=binarySearch(this.getSliceOfArray(list, 0, middlePosition));
			}

//		}
		
		return returnValue;
	}
	
    // Function to get slice of a primitive array in Java
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
        System.out.println("");
        // return the slice
        return slice;
    }
	
	
}

class CompareInt1 implements Comparator<Integer>
{
	public int compare(Integer parm1, Integer parm2)
	{
		return parm2 - parm1;
	}
}
