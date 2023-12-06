package com.winter.study1;

public class ArrayStudy2 {

	public static void main(String[] args) {
		//배열선언
		int [] ar = {2,4,5};
			
		int [] ar2 =new int[2];
		
		for(int i = 0 ; i <ar2.length; i++) {
			ar2[i]=ar[i];
		}
		
		
		for(int i = 0; i <ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
