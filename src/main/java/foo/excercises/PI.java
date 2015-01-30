package foo.excercises;

public class PI {
	public static void main(String args[]){
		double miner=0.0;
		double pluser=0.0;
		double ans=0.0;		
		double add1=0.0;

		
		for(int i=3; i<100000000; i+=4){
			add1=(double)4/i;
			miner=miner+ add1;
		}//end minus for
		
		for(int m=5; m<100000000; m+=4){
			pluser=pluser+(double)4/m;
		}//end pluser
		
		ans=4+pluser-miner;
		System.out.printf("%f\t%f",ans,Math.PI);
	}//end main
}//end class
