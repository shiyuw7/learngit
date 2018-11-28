package review;

import java.util.Scanner;

public class testFrame {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n=in.nextInt();
	int[] height=new int[n];
	int[] numOfchild=new int[n];
	height[0]=1;
	int max=0;
	for(int i=0;i<n-1;i++) {
		int parent=in.nextInt();
		int child = in.nextInt();
		numOfchild[parent]+=1;
		if(numOfchild[parent]<3) {
			height[child]=height[parent]+1;
			}
		max=Math.max(max, height[child]);
		}
	System.out.println(max);
	}
}


