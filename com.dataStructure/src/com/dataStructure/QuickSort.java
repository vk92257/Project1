package com.dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {

	static public void quickSort(int[]a,int start,int end) 
	{
		
		if (start >=end) 
		{
			
		}
		else{
			int lock = divide(a,start,end);
			quickSort(a,start,lock-1);
			quickSort(a,lock+1,end);
		}
	}
	static public int  divide(int []a,int  start ,int end ) 
	{
		
		int pivot = a[start];
		int p = start+1 ;
		int q = end;
		
		
		while(q>=p) 
		{
			while(  a[p]<pivot   )
			{
				
				p++;
				System.out.println("p is "+p);
				
			}
			while(a[q]>pivot )
			{
				q--;
				
			}
			if (q>p)
			{
				int temp =	a[p] ;
						a[p]=a[q];
				a[q]=temp;
			}
			
			}
		a[start]=a[q];
		a[q]=pivot;
		
	System.out.println("this is q"+q );
		
		return q ;
	}
	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// TODO Auto-generated method stub
		//int []a= {60,40,20,95,90,30,50,70};
		//int []a = {9,3,0,16,1};
		
		System.out.println("enter arry size");
		String s = br.readLine();
		int size =Integer.parseInt(s);
		
		int [] a = new int[size] ;
		System.out.println("enter the "+size+"  elemetnts  ");
		for(int loop =0 ;loop<size;loop++) 
		{
			System.out.println("enter "+loop+" =5");
			String s1 = br.readLine();
			a[loop]=Integer.parseInt(s1);
		}
		
		
		int start = 0 ;
		int end = a.length-1;
		
		for(int q1 = 0 ;q1<=a.length-1;q1++) 
		{
			System.out.println("list is = " +a[q1]);
		}
		
		quickSort(a,start,end);
		for(int q1 = 0 ;q1<=a.length-1;q1++) 
		{
			System.out.println("sorted list is = " +a[q1]);
		}
	
	}

	}
