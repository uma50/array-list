import java.util.*;
class PrimeReverse {
	public static void main(String[] args) {
	  int i,j,flag=0;
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the highest number to check:");
	  int n = sc.nextInt();
	  for(i=n; i>1; i--) {
	      for (j = i/2; j >= 1; j--) {
	         if(i%j==0 && j!=1) {
	            flag = 0;
	            break;
	         }
	         else
	           flag = 1;
	      }
	      if(flag == 1) {
	         System.out.print(i + " ");
	      }
	   }	
	}
}
