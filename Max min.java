import java.util.*;
class MaxMin {
	public static void main(String args[]) {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value:");
		int n=sc.nextInt();
		Stack st = new Stack<>();
		System.out.println("Enter " + n + " values");
		for(int i=0;i<n;i++) {
			st.push(sc.nextInt());
		}
		System.out.println("Maximum Value : "+Collections.max(st));
		System.out.println("Minimum Value : "+Collections.min(st));
	}
}
