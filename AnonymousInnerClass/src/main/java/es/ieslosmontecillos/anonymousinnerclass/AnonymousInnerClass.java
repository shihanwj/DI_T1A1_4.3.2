/**
 * 2º DAM DI
 * @author: Shihan Wei
 * Tema 1 Actividad 1
 * 4.3.2. AnonymousInnerClass
 * Fecha: 02/10/2024
 */

package es.ieslosmontecillos.anonymousinnerclass;

/* Importamos las librerías necesarias*/
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousInnerClass extends Application {
    @Override
    public void start(Stage primaryStage) {

        /* se crea el contenedor donde se van a situar los botones*/
        HBox root = new HBox();
        root.setSpacing(15);
        root.setPrefSize(300, 60);
        root.setAlignment(Pos.CENTER);

        /* se crean los botones requeridos*/
        Button btnNew = new Button("New");
        Button btnOpen = new Button("Open");
        Button btnSave = new Button("Save");
        Button btnPrint = new Button("Print");

        /* añadimos los botones al contenedor*/
        root.getChildren().addAll(btnNew, btnOpen, btnSave, btnPrint);

        /*manejadores de evento de los botones usando clases anónimas*/
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Nuevo proceso");
            }
        });

        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Abrir proceso");
            }
        });

        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Guardar proceso");
            }
        });

        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Imprimir proceso");
            }
        });

        Scene scene = new Scene(root);

        primaryStage.setTitle("Anonymous Inner Class");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}