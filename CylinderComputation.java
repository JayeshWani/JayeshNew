package com.yash.trainning.first;
public class CylinderComputation {
	public static void main(String[] args) {
		double r=2, h=10;
		double area,volume;
		area=2*Math.PI*r*(r+h);
		volume=(Math.PI)*r*r*h;
		System.out.println("Radius of Cylinder : "+r);
		System.out.println("Height of Cylinder : "+h);
		System.out.println("Area of Cylinder : " +area);
		System.out.println("Volume of Cylinder is : "+volume);
	}
}
