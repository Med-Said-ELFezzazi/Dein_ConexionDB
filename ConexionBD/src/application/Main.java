package application;

import dao.AvionDao;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import model.Avion;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            AvionDao avionDao = new AvionDao();
            ObservableList<Avion> aviones = FXCollections.observableArrayList();
            aviones=avionDao.cargarAviones();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Aviones");
            alert.setContentText(aviones.toString());
            alert.showAndWait();
        } catch(Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Ha ocurrido un error:\n"  + e.getMessage());
            alert.showAndWait();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}