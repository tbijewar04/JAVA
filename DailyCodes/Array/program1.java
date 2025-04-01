class ArrayDemo{

	public static void main(String[] args){
	
		int arr1[] = new int[] {10,20,30};
		Integer arr2[] = new Integer[] {10,20,30};

		System.out.println(arr1);
		System.out.println(arr2);


		int x = 10;
		Integer y = 10;

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

		int z = 30;
		 System.out.println(System.identityHashCode(z));
	}

}
