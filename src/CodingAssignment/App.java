package CodingAssignment;

public class App {
	
	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		Logger logger2 = new SpacedLogger();
		
		logger.Log("PUZZLE");
		logger.Error("Pieces Not Found");
		
		logger2.Log("SUPERCALIFRAGILISTICEXPIALIDOCIOUS");
		logger2.Error("EvEn ThOuGh ThE sIgHt Of It Is SoMeThInG qUiTe AtRoCiOuS!");

	}

}
