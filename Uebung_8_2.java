
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Uebung_8_2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(10));
		vbox.setSpacing(10);
		
		Label l1=new Label("Essensmarkenautomat");
		
		Separator s1=new Separator();
		Separator s2=new Separator();
		
		HBox h1=new HBox();
		HBox h2=new HBox();
		h1.setSpacing(10);
		h2.setSpacing(10);
		
		Button b1=new Button("Essen 1");
		Button b2=new Button("Essen 2");
		Button b3=new Button("10 Cent");
		Button b4=new Button("50 Cent");
		
		h1.getChildren().addAll(b1,b2);
		h2.getChildren().addAll(b3,b4);
		
		vbox.getChildren().addAll(l1,s1,h1,s2,h2);
		
		Scene scene1 = new Scene(vbox);
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Übung 8 - Aufgabe 2");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
