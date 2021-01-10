class RemoveDuplicate{
	static void duplicate(int [] arr) {
		int l=arr.length;
		for (int i=l-2;i>=0 ;i-- ) {
			if (arr[i]==arr[i+1]) {
				for (int j=i+1;j<l;j++ ) {
					arr[j-1]=arr[j];
				}
				l--;
			}
		}
		for (int k :arr) {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		int arr []={0,0,1,1,1,2,2,3,3,4};
		duplicate(arr);
	}
}