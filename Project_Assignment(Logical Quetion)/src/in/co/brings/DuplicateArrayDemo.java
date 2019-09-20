package in.co.brings;//import package

//main class
public class DuplicateArrayDemo {
	
	//main method
	public static void main(String[] args) {
		
		//array declaration
		int arr[]= {1, 2, 5, 5, 6, 6, 7, 2};
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Enter Duplicate Array:-"+arr);
				}
			}
		}
		
	}

}
