package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application{
	
	int startX = 300;
	int startY = 300;

	@Override
	public void start(Stage stage) throws Exception {

		
		
		Group root = new Group();
		Scene scene = new Scene(root, 600, 600, Color.BEIGE);
		
		Button up = new Button("Up");
		up.setLayoutX(300);
		up.setLayoutY(0);
		Button down = new Button("Down");
		down.setLayoutX(300);
		down.setLayoutY(560);
		Button left = new Button("Left");
		left.setLayoutX(0);
		left.setLayoutY(300);
		Button right = new Button("Right");
		right.setLayoutX(540);
		right.setLayoutY(300);
		
		Image redball = new Image("redball.png");
		
		Circle circle = new Circle();
		circle.setCenterX(300);
		circle.setCenterY(300);
		circle.setRadius(50);
		circle.setFill(Color.RED);
		circle.setStroke(Color.BLUE);
		circle.setStrokeWidth(5);
		
		root.getChildren().add(circle);
		root.getChildren().add(up);
		root.getChildren().add(down);
		root.getChildren().add(left);
		root.getChildren().add(right);



		stage.getIcons().add(redball);
		stage.setTitle("Java FX Circle Game");
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
		
		up.setOnAction(e->{
			if(circle.getCenterY() > 60)
			{
				startY = startY - 20;
				circle.setCenterY(startY);
			}
			
			/*
			circle.setCenterX(300);
			circle.setCenterY(60);*/

		});
		
		down.setOnAction(e ->{
			if(circle.getCenterY() < 540)
			{
				startY = startY + 20;
				circle.setCenterY(startY);
			}
			/*
			circle.setCenterX(300);
			circle.setCenterY(540);*/
		});
		
		left.setOnAction(e->{
			
			if(circle.getCenterX() > 60)
			{
				startX = startX - 20;
				circle.setCenterX(startX);
			}
			/*
			circle.setCenterX(60);
			circle.setCenterY(300);*/
		});
		
		right.setOnAction(e->{
			if(circle.getCenterX() < 540)
			{
				startX = startX + 20;
				circle.setCenterX(startX);
			}
			/*
			circle.setCenterX(540);
			circle.setCenterY(300);*/
		});
		
		scene.setOnKeyPressed(e->{
			if(e.getCode() == KeyCode.W || e.getCode() == KeyCode.UP)
			{
				if(circle.getCenterY() > 60)
				{
					startY = startY - 20;
					circle.setCenterY(startY);
				}
			}
			if(e.getCode() == KeyCode.S || e.getCode() == KeyCode.DOWN)
			{
				if(circle.getCenterY() < 540)
				{
					startY = startY + 20;
					circle.setCenterY(startY);
				}
			}
			if(e.getCode() == KeyCode.A || e.getCode() == KeyCode.LEFT)
			{
				if(circle.getCenterX() > 60)
				{
					startX = startX - 20;
					circle.setCenterX(startX);
				}
			}
			if(e.getCode() == KeyCode.D || e.getCode() == KeyCode.RIGHT)
			{
				if(circle.getCenterX() < 540)
				{
					startX = startX + 20;
					circle.setCenterX(startX);
				}
			}
		});
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}

}
