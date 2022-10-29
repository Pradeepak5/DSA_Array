import java.util.Scanner;

public class resizeArray {
	public void displayArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public int[] resizeAnArray(int[] arr,int capacity) {
		int[] temp=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}
	public static void main(String args[]) {
		resizeArray a=new resizeArray();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" Element : ");
			arr[i]=s.nextInt();
		}
		a.displayArray(arr);
		System.out.println("Size of an array before Resizing : "+arr.length);
		arr=a.resizeAnArray(arr, arr.length*2);
		System.out.println("Size of an array after Resizing : "+arr.length);
	}

}
