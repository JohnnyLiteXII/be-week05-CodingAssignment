package week05LoggerInterface;



//3. Create two classes that implement the Logger interface(a. AsteriskLogger)
public class AsteriskLogger implements Logger {	
	
	// 4. Implement the AsteriskLogger methods
	@Override
	// a. The log method on the AsteriskLogger should print out the String it receives between 3 asterisks on either side of the String
	public void log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***" + log + "***");
	}

	@Override
	// b. The error method on the AsteriskLogger should print the String it receives inside a box of asterisks, with the String preceded by the word “ERROR:”
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("****************");
        System.out.println("***Error: " + error + "***");
        System.out.println("****************");
    }

	}


