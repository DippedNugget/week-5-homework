package CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		System.out.println(" ");
	}

	@Override
	public void Error(String error) {

		String border = "******************";
		System.out.println(border);
		System.out.println("***" + "Error: " + error +"***");
		System.out.println(border);
		System.out.println(" ");
		
	}



	

}
