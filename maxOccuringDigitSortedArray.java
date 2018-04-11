package Arrays;

public class maxOccuringDigitSortedArray {

	public static void main(String[] args) 
	{
		int arr[]= {1,1,1};
		int key=1;
		System.out.println("count: "+maxOccuranceWithBinary(arr,key,arr.length));

	}
	static int maxOccuringWithoutBinary(int[]arr,int key) 
	{
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]==key) 
			{
				count++;
			}
			else 
			{
				break;
			}
		}
		if(count==0) 
		{
			System.out.println("Element doesnt exist in the array");
		}
		return count;
	}
	static int maxOccuranceWithBinary(int arr[],int x,int n) 
	{
		int firstoccurance;
		int lastoccurance;
		firstoccurance=firstOccur(arr,0,n-1,x,n);
		if(firstoccurance==-1) 
		{
			return firstoccurance;
		}
		else 
		{
			lastoccurance=lastOccur(arr,firstoccurance,n-1,x,n);
		}
		
		return lastoccurance-firstoccurance+1;
		
	}
	static int firstOccur(int arr[],int low,int high,int x,int n) 
	{
		
		if(high>=low) 
		{
			int mid = (high+low)/2;
			if((mid==0||x>arr[mid-1])&&arr[mid]==x) 
			{
				return mid;
			}
			else if(x>arr[mid]) 
			 {
				return firstOccur(arr,(mid+1),high,x,n);
			 }
			else 
			{
				return firstOccur(arr,low,(mid-1),x,n);
			}
		}
		
		return -1;
	}

	static int lastOccur(int arr[],int low,int high,int x,int n) 
	{
		
		if(high>=low) 
		{
			int mid = (high+low)/2;
			if((mid==n-1||x<arr[mid+1])&&arr[mid]==x) 
			{
				return mid;
			}
			else if(x<arr[mid]) 
			 {
				return lastOccur(arr,low,(mid-1),x,n);
			 }
			else 
			{
				return lastOccur(arr,(mid+1),high,x,n);
			}
		}
		
		return -1;
	}
}
