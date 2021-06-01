import java.util.Scanner;
import java.util.Vector;


public class ProductAssignment {
	
	
	
	public static void main(String[] args) {
		
		int n = 100;
		
		Scanner sc = new Scanner(System.in);
		
		Vector<Integer> vecObject = new Vector<Integer>(n);
		
		for(int i = 0; i <= n; i++) {
			vecObject.add(i);
			sc.nextInt();
		}
		System.out.println(vecObject);
		

		for(int i = 0; i <= n; i++) {
			vecObject.remove(i);
			sc.nextInt();
		}
		
		System.out.println(vecObject);
		
		System.out.println("List of items removed :" + vecObject);
		sc.close();
	}

}
