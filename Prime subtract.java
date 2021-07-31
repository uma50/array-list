import java.util.*;
class PrimeSubtract {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first value:");
		int n=sc.nextInt();
		System.out.print("Enter the last value:");
		int r=sc.nextInt();
		int prime[]=new int[r+1];
		for(int i=1;i<=r;i++)
			prime[i]=1;
			prime[1]=0;
		for(int p=2;p*p<=r;p++) {
			if(prime[p]==1)
				for(int i=p*p;i<=r;i+=p)
					prime[i]=0;
		}
		System.out.print("Enter the target value:");
		int target=sc.nextInt();
		int flag=0;
		for(int j=n;j<=target/2;j++) {
			if(prime[j]==1 && prime[target-j]==1)
				flag=1;
		}

		if(flag==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
