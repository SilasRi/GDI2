import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class Uebung_8_1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		HBox hBox = new HBox();
		hBox.setPrefWidth(400);
		hBox.setPadding(new Insets(10, 10, 10, 10));
		hBox.setSpacing(10);
		Button b1 = new Button("Open");
		Button b2 = new Button("Save");
		Button b3 = new Button("Help");
		Region r1 = new Region();
		HBox.setHgrow(r1, Priority.ALWAYS);
		hBox.getChildren().addAll(b1, b2, r1, b3);

		Scene scene1 = new Scene(hBox);
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Übung 8 - Aufgabe1");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
