package dad.javafx.ByR;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application{

	private Label BuscarLabel, ReemplazarLabel;
	private TextField BuscarField, ReemplazarField;
	private Button BuscarButton, ReemplazarButton, TodoButton, CerrarButton, AyudaButton;
	private CheckBox mayus_minus, atras, regular, resultados;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		BuscarLabel = new Label("Buscar: ");
		ReemplazarLabel = new Label("Reemplazar con: ");
		
		BuscarField = new TextField();
		ReemplazarField = new TextField();
		
		BuscarButton = new Button("Buscar");
		ReemplazarButton = new Button("Reemplazar");
		TodoButton = new Button("Reemplazar todo");
		CerrarButton = new Button("Cerrar");
		AyudaButton = new Button("Ayuda");
		
		mayus_minus = new CheckBox("Mayúsculas y minúsculas");
		atras = new CheckBox("Buscar hacia atrás");
		regular = new CheckBox("Expresión regular");
		resultados = new CheckBox("Resaltar resultados");
		
		GridPane cajas = new GridPane();
		cajas.setPadding(new Insets(5));
		cajas.setHgap(5);
		cajas.setVgap(5);
		cajas.add(mayus_minus, 0, 0);
		cajas.add(regular, 0, 1);
		cajas.add(atras, 1, 0);
		cajas.add(resultados, 1, 1);
		
		
		VBox botones = new VBox();
		botones.setPrefWidth(110);
		botones.setAlignment(Pos.CENTER);
		botones.setSpacing(5);
		BuscarButton.setMinWidth(botones.getPrefWidth());
		ReemplazarButton.setMinWidth(botones.getPrefWidth());
		TodoButton.setMinWidth(botones.getPrefWidth());
		CerrarButton.setMinWidth(botones.getPrefWidth());
		AyudaButton.setMinWidth(botones.getPrefWidth());
		botones.getChildren().addAll(BuscarButton, ReemplazarButton, TodoButton, CerrarButton, AyudaButton);
		
		
		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
		//root.setGridLinesVisible(true);
		root.addRow(0, BuscarLabel);
		root.addRow(1, ReemplazarLabel);
		root.addColumn(1, BuscarField);
		root.addColumn(1, ReemplazarField);
		root.add(cajas, 1, 2);
		root.addColumn(2, botones);
		
		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints(),
		};
		root.getColumnConstraints().setAll(cols);
		
		cols[1].setHgrow(Priority.ALWAYS);
		
		RowConstraints [] rows = {
				new RowConstraints(), 
				new RowConstraints(), 
				new RowConstraints(),
		};
		root.getRowConstraints().setAll(rows);
		
		root.setRowSpan(botones, 3);
		
		
		Scene scene = new Scene(root, 550, 370);
		
		primaryStage.setTitle("Buscar Y Reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
