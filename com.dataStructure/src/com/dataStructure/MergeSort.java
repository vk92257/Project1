package com.dataStructure;

public class MergeSort {
	public static void mergeSort(int []a,int n) 
	{	
		int L=1;int b[]= new int[n];
		while(L<n) 
		{
			mergePass(a,n,L,b);
		
		}
	}
	private static void mergePass(int[] a, int n, int L, int[] b) {
			int Q = n/2*L;
			int R = 2*L*Q;
			int S= n-R;
			for(int j = 0 ;j<Q;j++) 
			{
				int lb=(2*j)*L;
				merge(a,L,lb,A,L,lb+1,B,L);
			}
	}
	public static void merge() 
	{}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,10,21,465,31,5521,65,13,54,321,584,321,54,548,97,5};
		for(int i:a)
		{
			System.out.println(i);
		}
			int n= a.length-1;
		System.out.println(n);
			mergeSort(a,n);
	
	}

}
