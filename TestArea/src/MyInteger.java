import java.util.Scanner;
public class MyInteger {
	
	public static void main(String[]args){
		Scanner input = new Scanner (System.in);
		//String userInput="";
		System.out.print("Enter a positive integer to create a MyInteger object or <enter> to move on to next part of program:");
		String userInput=input.nextLine();
		while(userInput.compareTo("")!=0) {
			int intInput = parseInt(userInput);
			System.out.println("MyInteger obj0 = new MyInteger("+intInput+");");
			MyInteger obj0 = new MyInteger(intInput);
			System.out.println("obj0.getValue() = " + obj0.getValue());
			System.out.println("obj0.isEven() = " + obj0.isEven());
			System.out.println("obj0.isOdd() = " + obj0.isOdd());
			System.out.println("obj0.isPrime() = " + obj0.isPrime());
			System.out.print("Enter a positive integer to create a MyInteger object or <enter> to move on to next part of program:");
			userInput=input.nextLine();
		}
		
		System.out.print("Enter a positive integer to test static isXXX(int) methods or <enter> to move on to next part of program:");
		userInput=input.nextLine();
		while(userInput.compareTo("")!=0) {
			int intInput = parseInt(userInput);
			System.out.println("MyInteger.isEven("+intInput+") = " + isEven(intInput));
			System.out.println("MyInteger.isOdd("+intInput+") = " + isOdd(intInput));
			System.out.println("MyInteger.isPrime("+intInput+") = " + isPrime(intInput));
			System.out.print("Enter a positive integer to test static isXXX(int) methods or <enter> to move on to next part of program:");
			userInput=input.nextLine();
		}
		
		System.out.print("Enter a positive integer to test static isXXX(MyInteger) methods or <enter> to move on to next part of program:");
		userInput=input.nextLine();
		while(userInput.compareTo("")!=0) {
			int intInput = parseInt(userInput);
			System.out.println("MyInteger obj1 = new MyInteger("+intInput+");");
			System.out.println("obj1.getValue() = " + intInput);
			System.out.println("MyInteger.isEven(obj1) = " + isEven(intInput));
			System.out.println("MyInteger.isOdd(obj1) = " + isOdd(intInput));
			System.out.println("MyInteger.isPrime(obj1) = " + isPrime(intInput));
			System.out.print("Enter a positive integer to test static isXXX(MyInteger) methods or <enter> to move on to next part of program:");
			userInput=input.nextLine();
		}

		System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(int) or <enter> to move on to next part of program:");
		userInput=input.nextLine();
		while(userInput.compareTo("")!=0) {
			int intInput = parseInt(userInput);
			System.out.println("MyInteger obj2 = new MyInteger("+intInput+");");
			System.out.println("obj2.getValue() = " + intInput);
			System.out.print("Enter a the second of two positive integers to test obj2.equals(int):");
			int intInput2=parseInt(input.nextLine());
			System.out.println("obj2.equals(" + intInput2 + ") = " + (intInput2==intInput));
			System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(int) or <enter> to move on to next part of program:");
			userInput=input.nextLine();
		}
		
		System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(MyInteger obj3) or <enter> to move on to next part of program:");
		userInput=input.nextLine();
		while(userInput.compareTo("")!=0) {
			int intInput = parseInt(userInput);
			System.out.println("MyInteger obj2 = new MyInteger("+intInput+");");
			System.out.println("obj2.getValue() = " + intInput);
			System.out.print("Enter a the second of two positive integers to create obj3 and test obj2.equals(MyInteger obj3):");
			int intInput2=parseInt(input.nextLine());
			System.out.println("MyInteger obj3 = new MyInteger("+intInput2+");");
			System.out.println("obj3.getValue() = " + intInput2);
			System.out.println("obj2.equals(obj3) = " + (intInput2==intInput));
			System.out.print("Enter a the first of two positive integers to create obj2 and test obj2.equals(MyInteger obj3) or <enter> to move on to next part of program:");
			userInput=input.nextLine();
		}
		
		System.out.print("Enter a positive integer that will be placed into a char[] array to demonstrate the MyInteger.parseInt(char[]):");
		userInput=input.nextLine();
		while(userInput.compareTo("")!=0) {
			int intInput = parseInt(userInput);
			System.out.println("MyInteger obj4 = new MyInteger(MyInteger.parseInt(char []);");
			System.out.println("obj4.getValue() = " + intInput);
			System.out.println("obj4.isEven() = " + isEven(intInput));
			System.out.println("obj4.isOdd() = " + isOdd(intInput));
			System.out.println("obj4.isPrime() = " + isPrime(intInput));
			System.out.print("Enter a positive integer that will be placed into a char[] array to demonstrate the MyInteger.parseInt(char[]):");
			userInput=input.nextLine();
		}
		
		System.out.print("Enter a positive integer that will be placed into a String to demonstrate the MyInteger.parseInt(String):");
		userInput=input.nextLine();
		while(userInput.compareTo("")!=0) {
			int intInput = parseInt(userInput);
			System.out.println("MyInteger obj5 = new MyInteger(MyInteger.parseInt(String);");
			System.out.println("obj5.getValue() = " + intInput);
			System.out.println("obj5.isEven() = " + isEven(intInput));
			System.out.println("obj5.isOdd() = " + isOdd(intInput));
			System.out.println("obj5.isPrime() = " + isPrime(intInput));
			System.out.print("Enter a positive integer that will be placed into a String to demonstrate the MyInteger.parseInt(String):");
			userInput=input.nextLine();
		}
	}
	
    private int value;

    public MyInteger(int value){
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        if (value<2) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        for (int i = 3; i * i <= value; i += 2)
            if (value % i == 0) return false;
        return true;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
        if (value<2) return false;
        if (value == 2) return true;
        if (value % 2 == 0) return false;
        for (int i = 3; i * i <= value; i += 2)
            if (value % i == 0) return false;
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInteger) {
        return this.value == myInteger.value;
    }

    public static int parseInt(char[] value) {

        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char aValue : value) {

            valueDouble += Math.pow(10, toPower--) * (aValue - '0');
        }

        return (int)valueDouble;
    }

    public static int parseInt(String value) {

        return MyInteger.parseInt(value.toCharArray());
    }
}