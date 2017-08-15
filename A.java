import java.util.Scanner;
import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		star();
	}
	public static void star(){
		int i,j;
		Scanner s=new Scanner(System.in);
				int a=s.nextInt();				
	for(i=0;i<=a;i++){
		for(j=0;j<=a;j++){
		if(j==0||j==a||i==0||i==a)
			System.out.print("*");
		else
			System.out.print(" ");
	}
		System.out.println("");
		
	}

}
}