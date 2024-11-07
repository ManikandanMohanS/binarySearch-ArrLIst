import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
	    System.out.println(" enter arr size : " );
	    int size=sc.nextInt();
	    System.out.println(" enter arr elements : " );
	    int arr[]=new int[size];
	    for(int i=0;i<size;i++) {
	    	arr[i]=sc.nextInt();
	    	}
	    System.out.println(" inter key to search");
	    int key=sc.nextInt();
	    int lb=0;
	    int ub=size-1;
	    int flag=0;
	    while(lb<=ub) {
	    	int mid =(lb+ub)/2;
	    	if(arr[mid]==key) {
	    		System.out.println("key fount at "+mid+ " th index");
	    		flag=1;
	    		break;
	    	}
	    	else if(key<mid){
	    		ub=mid-1;
	    		
	    	}
	    	else {
	    		lb=mid+1;
	    	}
	    	
	    }
	    
	    if(flag==0) {
	    	System.out.println("key not found");
	    }
	    
	    
	}
 
}
