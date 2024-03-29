package week05LoggerInterface;

//6. Create a class named App that has a main method.
	class App {
	    public static void main(String[] args) {
	        // a. In this class instantiate an instance of each of your logger classes that implement the Logger interface.
	        Logger asteriskLogger = new AsteriskLogger();
	        Logger spacedLogger = new SpacedLogger();

	        // b. Test both methods on both instances, passing in Strings of your choice.
	        asteriskLogger.log("Hello");
	        asteriskLogger.error("Hello");

	        spacedLogger.log("Hello");
	        spacedLogger.error("Hello");
	    }
	}