/**
	calc.java
	by Chris Minich
	cfminich@gmail.com
	
	An rpn calculator.
 */

class calc {
	public static RegisterStack calcStack = new RegisterStack(4, "x");
	public static double x, y;
	
	private static void popTwo() {
		x = calcStack.pop();
		y = calcStack.pop();
	}
		
	private static void pushResult(double result) {
		calcStack.push(result);
		System.out.println(result);
	}
	
	public static void add() {
		popTwo();
		double result = y + x;
		pushResult(result);
	}
	
	public static void subtract() {
		popTwo();
		double result = y - x;
		pushResult(result);
	}
	
	public static void multiply() {
		popTwo();
		double result = y * x;
		pushResult(result);
	}
	
	public static void divide() {
		popTwo();
		double result = y / x;
		pushResult(result);
	}
	
	public static void showStack() {
		for (int i=0; i<calcStack.getCount(); i++)
			System.out.println(calcStack.show(i));
	}
	 
	// see if a string is numeric
	public static boolean isNumeric(String str) {  
		try {
			double d = Double.parseDouble(str);  
		}
		catch(NumberFormatException nfe) {  
			return false;  
		}  
		return true;  
	}
	
	public static void main(String args[]) {	
		inputBuffer stringBuffer = new inputBuffer();
		String entry;
		double d;
		
		do {
			entry = stringBuffer.getNextString();
			if (isNumeric(entry)) {
					d = Double.parseDouble(entry);
					calcStack.push(d);			
			}
			else {
				if (entry.equals("+")) add();
				if (entry.equals("-")) subtract();
				if (entry.equals("*")) multiply();
				if (entry.equals("/")) divide();
				if (entry.equals("s")) showStack();
			}	
		} while (!entry.equals("q"));
	}
}
