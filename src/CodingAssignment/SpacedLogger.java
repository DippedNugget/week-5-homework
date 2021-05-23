package CodingAssignment;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		StringBuilder spacedOut = new StringBuilder();
		for (int s = 0; s < log.length(); s++) {
		   if (s > 0) {
		      spacedOut.append(" ");
		    }

		   spacedOut.append(log.charAt(s));
		}

		System.out.println(spacedOut.toString());
		System.out.println(" ");
	}

	@Override
	public void Error(String error) {
		StringBuilder errorOut = new StringBuilder();
		for (int s = 0; s < error.length(); s++) {
		   if (s > 0) {
		      errorOut.append(" ");
		    }

		   errorOut.append(error.charAt(s));
		}

		System.out.println("ERROR: " + errorOut.toString());
		System.out.println(" ");
	}

}
