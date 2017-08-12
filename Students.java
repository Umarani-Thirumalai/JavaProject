
public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int child=5;
		int intervel=3;
		int sum=50;
		int min=0;
		for(int i=0;i<=4;i++){
		min=min+(intervel*i);
		System.out.println(min);
		}
		min=((sum-min)/child);
		System.out.println("Min age:"+min);
	}

}
