package rcas.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RCASListViewController {

    @FXML
    private void createNewCar() throws IOException {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RCASCarView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setTitle("Create new car");
            stage.setScene(new Scene(root1));
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public void editCar(){

    }

    @FXML
    public void deleteCar(){

    }

    @FXML
    public void showInformation(){

    }


}
