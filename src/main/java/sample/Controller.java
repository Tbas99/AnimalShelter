package sample;

import Animals.Animal;
import Animals.Gender;
import javafx.beans.property.BooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Reservation reservations = new Reservation();

    @FXML
    private ComboBox<String> SpeciesCB;

    @FXML
    private TextField NameTB;

    @FXML
    private RadioButton MaleRB;

    @FXML
    private RadioButton FemaleRB;

    @FXML
    private TextField BadHabbitsTB;

    @FXML
    private Button AddAnimalBT;

    @FXML
    private ListView<Animal> AnimalsLV;

    @FXML
    private TextField ReserveAnimalTB;

    @FXML
    private Button ReserveAnimalButton;

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        // Populate the listbox
        ObservableList<String> options = FXCollections.observableArrayList(
                "Cat",
                "Dog"
        );
        SpeciesCB.getItems().clear();
        SpeciesCB.setItems(options);

        // Add event handling to the radiobuttons
        MaleRB.setOnAction(this::handleMaleRadioButton);
        FemaleRB.setOnAction(this::handleFemaleRadioButton);

        // Event handling for combobox
        SpeciesCB.setOnAction(this::comboBoxChanged);

        // Set the event for adding an animal
        AddAnimalBT.setOnAction(this::addAnimal);

        // Set the event for reserving an animal
        ReserveAnimalButton.setOnAction(this::reserveAnimal);
    }

    private void addAnimal(ActionEvent actionEvent)
    {
        Gender gender;

        if (MaleRB.isSelected()) {
            gender = Gender.Male;
        }
        else {
            gender = Gender.Female;
        }

        if (SpeciesCB.getValue() == "Cat")
        {
            reservations.NewCat(NameTB.getText(), gender, BadHabbitsTB.getText());
        }
        else if (SpeciesCB.getValue() == "Dog")
        {
            reservations.NewDog(NameTB.getText(), gender);
        }

        RefreshControls();
    }

    private void reserveAnimal(ActionEvent actionEvent)
    {
        Animal animal = AnimalsLV.getSelectionModel().getSelectedItem();

        if (animal != null)
        {
            animal.Reserve(ReserveAnimalTB.getText());
            RefreshControls();
        }
    }

    private void comboBoxChanged(ActionEvent actionEvent)
    {
        if (SpeciesCB.getValue() == "Cat")
        {
            BadHabbitsTB.setEditable(true);
        }
        else
        {
            BadHabbitsTB.setEditable(false);
            BadHabbitsTB.clear();
        }

    }

    private void handleFemaleRadioButton(ActionEvent actionEvent)
    {
        FemaleRB.setSelected(true);
        if (MaleRB.isSelected())
        {
            MaleRB.setSelected(false);
        }
    }

    private void handleMaleRadioButton(ActionEvent actionEvent)
    {
        MaleRB.setSelected(true);
        if (FemaleRB.isSelected())
        {
            FemaleRB.setSelected(false);
        }
    }

    private void RefreshControls()
    {
        AnimalsLV.getItems().clear();
        for (Animal animal : reservations.Animals)
        {
            AnimalsLV.getItems().add(animal);
        }
    }
}

