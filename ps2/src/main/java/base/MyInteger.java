package base;

 class MyInteger {

		int iValue;
		
		MyInteger(int newiValue) {
			iValue = newiValue;
		}
		
		public int getiValue(){
			return iValue;
		}
		
		public boolean isEven() {
			return (iValue % 2 == 0);
		}
		
		public boolean isOdd() {
			return (iValue % 2 != 0);
		}
		
		public boolean isPrime() {
			for(int i = 2; 2 * i < iValue; i++){
		        if(iValue % i == 0){
		            return false;
		        }
			}
		    return true;
		}
		
		public static boolean isEven(int n){
			return isEven(n);
		}
			
		public static boolean isOdd(int n){
			return isOdd(n);
		}
		
		public static boolean isPrime(int n){
			return isPrime(n);
		}
		
		public static boolean isEven(MyInteger n){
			return n.isEven();
		}
		
		public static boolean isOdd(MyInteger n){
			return n.isOdd();
		}

		public static boolean isPrime(MyInteger n){
			return n.isPrime();
		}
		
		public boolean equals(int n){
			return (iValue == n);
		}
		
		public boolean equals(MyInteger n){
			return equals(n.getiValue());
		}
		
				

	}


