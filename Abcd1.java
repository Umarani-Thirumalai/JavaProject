
public class Abcd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0,l;
		char  a[]={'a','b','c','d','e','f','g','h','i'};
		for(i=0,l=8;i<=4;i++,l--){
			for(j=0;j<=8;j++){
				if(i==j||l==j){
				System.out.print(a[j]);
				}
				else
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}

