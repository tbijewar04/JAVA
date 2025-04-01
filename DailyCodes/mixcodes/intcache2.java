class IntegerCache2{

	public static void main(String[] args){
	        
                /*  (System.identityHashCode(variable); this is used to show address of class variables not primitive types so whenever it is used on primitive types then internally while execution the primitive "int" is converted into class "Integer" and shows output accoding to the concept of Integer Cache  */


		Integer x = 128;
		Integer y = 128;

	        System.out.println(System.identityHashCode(x));    // different addresses
	        System.out.println(System.identityHashCode(y));


		int a = 10;
                int b = 10;

                System.out.println(System.identityHashCode(a));    // same addresses
                System.out.println(System.identityHashCode(b)); 
	}
}
