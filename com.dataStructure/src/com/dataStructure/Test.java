package com.dataStructure;

public class Test {

	public static void quicSort(int [] a, int start,int end) 
	{
		if(start>=end)
		{
		System.out.println("stat is "+start +" end is "+end+"");	
		}
		
		else	{int lock = divide(a,start,end);
		quicSort(a,start,lock-1);
		quicSort(a,lock+1,end);
		}}
	public static  int divide(int []a,int start,int end) 
	{
		int p = start+1;
		int q=end;
		int pivot= a[start];
		while (q>p)
		{	if(p<=a.length-1){
			while(a[p]<=pivot) 
			{
				p++;
				if(p>=(a.length-1))
				{
					break;
				}
			}
		} 
		
		if(q>=0)
		{
			while(a[q]>=pivot) 
			 {
				 q--;
			 if(q<=0) 
			 {
				 break;
			 }
			 }
		}	
		if(q>=p)
			 {
				 int temp= a[q];
				 a[q]=a[p];
				 a[p]=temp;
			 }
		
		}
			a[start]=a[q] ;
			a[q]=pivot;
		return q ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [] a = {9,3,0,16,1};
		int []a= {50,2,0,12,55,45,59,95,90,30,75,7,0};
		int start = 0;
		int end= a.length-1;
		for (int loop = 0 ; loop<a.length;loop++) 
		{
			System.out.println(" llist is "+a[loop]);
		}
		quicSort(a,start,end);
		for (int loop = 0 ; loop<a.length;loop++) 
		{
			System.out.println(" Sorted list is  "+a[loop]);
		}
	}

}
