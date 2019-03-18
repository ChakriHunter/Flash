import java.util.HashSet;
import java.util.Set;

//import java.util.HashSet;
//import java.util.Set;

public class Abc {
	public static void main(String args[]) {
	int a[]= {1,1,1,1};
	//Brute Force Method
	for(int i=0;i<a.length-1;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.print("duplicats="+a[i] +" ");
				
			}//end of if
		}//end of inner loop
	}//ne of outer loop

	
	
	Set s=new HashSet();
	for(int q:a) {
		if(s.add(q)==false) {
			System.out.println("duplicats="+q);
		}
		
	}
	System.out.println("unique="+s);
	}
}
