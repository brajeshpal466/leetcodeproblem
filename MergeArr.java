class MergeArr	{

	public static void main(String[] args) {
     int arr1 []=new int[] {1,5,7};
     int arr2 []=new int [] {2,3,6};
     int n=arr1.length;
     int m=arr2.length;
     merge(arr1,arr2,n,m);
     
     }	
     	static void merge(int arr1 [],int arr2 [],int n,int m){
		int arr []=new int [n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<n){
			if(arr1[i]<arr2[j]){
				arr[k++]=arr1[i++];
			}else{
				arr[k++]=arr2[j++];
			}
		}
		while(i<n){
			arr[k++]=arr1[i++];
		}
		while (j<m) {
			arr[k++]=arr2[j++];
		}
		for (k=0;k<n+m ;k++ ) {
		System.out.println(arr[k]);	
		}
		
	}	
	
}