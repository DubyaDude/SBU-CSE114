public class primePrint {
	public static void main(String[]args) {
		int newLine = 0;
		int primePrinted = 0;
		
		for(int i=2;primePrinted<1000;i++) {
			if(isPrime(i) == true) {
				System.out.print(i + " ");
				newLine++;
				primePrinted++;
			}
			if(newLine==10) {
				System.out.println("");
				newLine = 0;
			}
		}
	}
	public static boolean isPrime(int num) {
		int check = 0;
    	for( int i=1;i<=num;i++) {
    		if(num%i == 0)
    			check+=1;
    	}
    	if(check>2) return false;
    	else return true;
	}
}
