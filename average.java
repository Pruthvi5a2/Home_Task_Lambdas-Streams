package epamLambda;

import java.util.*;

public class average {
	public static int findAverage(int a[]) {
		int avg=0,sum=0;
		for(int i:a) {
			sum+=i;
		}
		avg = sum/a.length;
		return avg;
	}

		
	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		int n=o.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i]=o.nextInt();
		int average = findAverage(a);
		o.close();
		System.out.println("the average is "+average);
	}


}