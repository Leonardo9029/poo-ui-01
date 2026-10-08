package com.argandona.sintitulo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Los 5 componentes requeridos
        Label titulo = new Label("Registro de Tutorías Matemáticas");
        titulo.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        TextField campoNombre = new TextField();
        campoNombre.setPromptText("Nombre del alumno");
        campoNombre.setMaxWidth(200);
        CheckBox checkConfirmacion = new CheckBox("Clase confirmada");
        Label mensajeRespuesta = new Label();
        Button botonAgendar = new Button("Agendar");

        botonAgendar.setOnAction(e -> {
            if (checkConfirmacion.isSelected()) {
                mensajeRespuesta.setText("¡Clase agendada para " + campoNombre.getText() + "!");
            } else {
                mensajeRespuesta.setText("Debes confirmar la clase primero.");
            }
        });

        // Contenedor principal y Escena
        VBox root = new VBox(15, titulo, campoNombre, checkConfirmacion, botonAgendar, mensajeRespuesta);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 400, 300); // Se crea la escena con los componentes[cite: 6]

        primaryStage.setTitle("Gestión de Clases");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}