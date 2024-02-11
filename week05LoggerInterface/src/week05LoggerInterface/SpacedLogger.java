package week05LoggerInterface;


//3. Create two classes that implement the Logger interface (b. SpacedLogger)
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		// TODO Auto-generated method stub
		// a. If the log method received “Hello” as an argument, it should print H e l l o
        for (int i = 0; i < log.length(); i++) {
            System.out.print(log.charAt(i) + " ");
        }
        System.out.println();

	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		// b. The error method should do the same, but with “ERROR:” preceding the spaced out input
        System.out.print("ERROR: ");
        for (int i = 0; i < error.length(); i++) {
            System.out.print(error.charAt(i) + " ");
        }
        System.out.println();
    }

	}


