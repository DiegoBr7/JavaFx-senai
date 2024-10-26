package application;
	
//import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	public void start(Stage estagio) {
		String javaVersion = System.getProperty("java.version");
		String javafxVersion = System.getProperty("javafx.version");
		Label l = new Label("Ola JAVAFAX " + javafxVersion + ", rodando no Java " + javaVersion + "");
	}
	
	
	public static void main(String[] args) {
		launch();
	}
}
