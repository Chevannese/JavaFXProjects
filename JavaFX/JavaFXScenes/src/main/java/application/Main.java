package application;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception 
	{
	
		Group root = new Group();
		//Equivalent to JPanel
		Scene scene = new Scene(root, 600, 600, Color.SKYBLUE);
		Text text = new Text("This is a scene from a stage show");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 20));
		text.setFill(Color.GREEN);
		
		Line line = new Line();
		line.setStartX(200);
		line.setEndX(600);
		line.setStartY(200);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);
		line.setRotate(45);
		
		Rectangle rt = new Rectangle();
		//Set Rectangle
		rt.setX(100);
		rt.setY(100);
		//Set Rectangle Size properties
		rt.setWidth(100);
		rt.setHeight(100);
		//Set Rectangle Background properties
		rt.setFill(Color.ORANGE);
		//Set Rectangle Outline properties
		rt.setStroke(Color.YELLOW);
		rt.setStrokeWidth(5);
		rt.setRotate(45);
		
		
		  Polygon triangle = new Polygon();
		  triangle.getPoints().setAll(
		    200.0,200.0,
		    300.0,300.0,
		    200.0,300.0
		    );
		  triangle.setFill(Color.BLUE);
		  
		  Circle circle = new Circle();
		  circle.setCenterX(350);
		  circle.setCenterY(350);
		  circle.setRadius(50);
		  circle.setFill(Color.RED);
		  
		  ImageView pizza = new ImageView("pizza2.png");
		  pizza.setX(400);
		  pizza.setY(400);
		  pizza.setFitWidth(100);
		  pizza.setFitHeight(100);
		
		
		//Add components or leaf node to root
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rt);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(pizza);
		
		stage.setResizable(false);
		stage.setScene(scene);
		stage.setTitle("JavaFX Scenes");
		stage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	/*public void addToRoot(Object component, int x, int y)
	{
		component.setX(x);
		component.setY(y);
	}*/

}
