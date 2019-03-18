import java.util.ArrayList;

public class TwoArryList {
	public static void main(String args[]) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	ArrayList<Integer> al2=new ArrayList<Integer>();
	al2.add(10);
	al2.add(20);
	al2.add(20);
	al2.add(20);
	al2.add(50);
	al2.add(80);
	for(int i=0;i<=al.size()-1;i++) {
		for(int j=0;j<=al2.size()-1;j++) {
			if(al.get(i)==al2.get(j)) {
				System.out.println("duplicts="+al.get(i));
				break;
			}
		}
			
	}
	
	}
}
