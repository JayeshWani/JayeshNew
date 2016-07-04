package com.yash.trainning.first;

public class Exzersize1StarPrint {

	public static void main(String[] args) {
		int row;
		
		for(row=1; row<=5; row++){
			if(row%2==0){
				System.out.print(" ");
			}
			for(int col=1; col<=5; col++){
				System.out.print(" * ");
			}
				System.out.println(" ");
		}
	}
}
