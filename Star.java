
public class Star {

	public static void main(String[] args) {
		int a=1;
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++){
			for(int k=3-i;k>0;k--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}

	}

}
