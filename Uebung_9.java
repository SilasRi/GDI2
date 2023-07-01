import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Uebung_9 extends Application {

	private TextField t1;
	private TextField t2;
	private TextField t3;

	@Override
	public void start(Stage primaryStage) {
		GridPane g1 = new GridPane();
		// g1.setGridLinesVisible(true);
		g1.getStyleClass().add("gridpane");
		g1.getStyleClass().add("root");

		HBox h1 = new HBox();
		h1.getStyleClass().add("hbox");

		Region r1 = new Region();
		r1.getStyleClass().add("hbox");

		Label l1 = new Label("Operand 1");
		Label l2 = new Label("Operand 2");
		Label l3 = new Label("Ergebnis");

		Button b1 = new Button("+");
		b1.setOnAction(e -> rechnen('+'));
		Button b2 = new Button("-");
		b2.setOnAction(e -> rechnen('-'));
		Button b3 = new Button("*");
		b3.setOnAction(e -> rechnen('*'));
		Button b4 = new Button("/");
		b4.setOnAction(e -> rechnen('/'));

		h1.getChildren().addAll(b1, b2, b3, b4);

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		t3.setEditable(false);

		g1.add(l1, 0, 0);
		g1.add(t1, 2, 0);
		g1.add(l2, 0, 1);
		g1.add(t2, 2, 1);
		g1.add(r1, 1, 0);
		g1.add(h1, 0, 2, 3, 1);
		g1.add(l3, 0, 3);
		g1.add(t3, 2, 3);

		Scene scene1 = new Scene(g1);
		scene1.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		primaryStage.setScene(scene1);
		primaryStage.setTitle("Übung 8 - Aufgabe 2");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}

	public void rechnen(char operator) {
		try {
			double zahl1 = Double.parseDouble(t1.getText());
			double zahl2 = Double.parseDouble(t2.getText());
			switch (operator) {
			case '+':
				t3.setText(Double.toString(zahl1 + zahl2));
				break;
			case '-':
				t3.setText(Double.toString(zahl1 - zahl2));
				break;
			case '*':
				t3.setText(Double.toString(zahl1 * zahl2));
				break;
			case '/':
				t3.setText(Double.toString(zahl1 / zahl2));
			}

		} catch (NumberFormatException e) {
			t1.clear();
			t2.clear();
			t3.clear();
			Alert alert = new Alert(Alert.AlertType.ERROR);

			alert.setTitle("Eingabefehler");
			alert.setHeaderText("Fehler Eingabeformat");
			alert.setContentText("Eingabeformat ist falsch");
			alert.showAndWait();
		}

	}
}
