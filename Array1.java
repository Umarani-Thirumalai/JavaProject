import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,x=4;
		char a[]=new char[x];
		for(i=0;i<x;i++){
			Scanner s=new Scanner(System.in);
			a[i]=s.next().toCharArray()[0];
		}
		for(i=0;i<x;i++){
			System.out.println(a[i]);
		}
			
		

	}

}
