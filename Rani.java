package javabasic;

import java.util.Scanner;

public class Rani {
	int i,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rani r=new Rani();
		Scanner s=new Scanner(System.in);
		r.i=s.nextInt();
		r.j=s.nextInt();
		r.add();
	    sub();
	}

	void add(){
		System.out.println(i+j);
	}
	static void sub(){
		Rani r=new Rani();
		r.i=6;
		r.j=4;
		System.out.println(r.i-r.j);
	}
}
