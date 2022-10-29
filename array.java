import java.util.Scanner;

public class array {
	public void displayArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int[] printOdd(int[] arr) {
		int n=arr.length;
		int oddCount=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				oddCount++;
			}
		}
		int[] result=new int[oddCount];
		int index=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]%2!=0) {
				result[index]=arr[j];
				index++;
			}
		}
		return result;
	}
	public int[] reverse(int[] arr,int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	public void findMinimumArray(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.print(min);
		System.out.println();
	}
	public void secondMax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int secMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secMax=max;
				max=arr[i];
			}else if(arr[i]>secMax && arr[i]!=max) {
				secMax=arr[i];
			}
		}
		System.out.println(secMax);
	}
	public static void moveZero(int[] arr,int n) {
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0 && arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	public static void main(String args[]) {
		array a=new array();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" element : ");
			arr[i]=s.nextInt();
		}
		a.displayArray(arr);
		int[] result=printOdd(arr);
		System.out.print("Odd numbers in an array : ");
		a.displayArray(result);
		int[]reverse=a.reverse(arr, 0, arr.length-1);
		System.out.print("Reverse of an array : ");
		a.displayArray(reverse);
		System.out.print("Minimum Number in an array : ");
		a.findMinimumArray(arr);
		System.out.println("Second maximum number in an array is : ");
		a.secondMax(arr);
		a.moveZero(arr, arr.length);
		a.displayArray(arr);
	}

}
