package application;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception 
	{
		Image icon = new Image("logo.png");
		Group root = new Group();
		Scene scene = new Scene(root, Color.RED);
		
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("Press q to exit fullscreen");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		stage.setScene(scene);
		stage.getIcons().add(icon);
		stage.setTitle("JavaFX Demo");
		stage.show();
		
	}
	
	public static void main(String [] args)
	{
		launch(args);

	}

}
