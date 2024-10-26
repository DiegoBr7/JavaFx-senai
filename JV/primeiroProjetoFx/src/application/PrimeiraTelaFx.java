package application;

import javafx.application.Application;
		
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.Group;

public class PrimeiraTelaFx  extends Application{
	@Override
	public void start(Stage palco1) throws Exception{ // cria o metodo start
		Group raiz = new Group();					 //     Group vai preparar a Scene graph , que vai agrupar os nos da aplicacao
		Scene cena = new Scene(raiz, 600 , 300);	// Criar o objeto que recebe a raiz e tamanho definido
		cena.setFill(Color.BROWN);                 // Definir a cor do preenchimento
		palco1.setTitle("Exemplo com JavaFx");	  // Definir o titulo da janela
		palco1.setScene(cena);                   // Definir a cena a ser exibida na janela
		palco1.show();                          // Exibir a tela

	}
	public static void main(String[] args) {
		launch();

	}
}
