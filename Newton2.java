class Newton2{
	static void matrix(int n){
	   for (int i=0;i<n ;i++ ) {
	   	 for (int j=0;j<n ;j++ ) {
	   	 	System.out.print(j*4+i*6+" ");
	   	 }
	   	 System.out.println();
	   }
	}
	public static void main(String[] args) {
	int n=5;
	matrix(n);
	}
}