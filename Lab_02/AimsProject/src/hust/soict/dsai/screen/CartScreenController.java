package hust.soict.dsai.screen;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.*;

import hust.soict.dsai.Aims.Aims.Aims;
import hust.soict.dsai.Aims.cart.Carts.Carts;
import hust.soict.dsai.Aims.media.Media;
import hust.soict.dsai.Aims.media.Playable;

import java.io.IOException;
import hust.soict.dsai.execption.*;
public class CartScreenController {
    private Carts cart;
    @FXML
    private TableColumn<Media, String> colMediaCost;
    @FXML
    private TableColumn<Media, String> colMediaTitle;
    @FXML
    private TableColumn<Media, String> colMediaCategory;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnRemove;
    @FXML
    private Button btnDetails;
    @FXML
    private RadioButton radioBtnFilterId;
    @FXML
    private RadioButton radioBtnFilterTitle;
    @FXML
    private TextField tfFilter;
    @FXML
    private TableView<Media> tblMedia;

    @FXML
    private ToggleGroup filterCategory;

    @FXML
    private Button btnPlaceOrder;
    @FXML
    private Label lblCost;
    public CartScreenController(Carts cart) {
        super();
        this.cart = cart;
    }
    @FXML
    private void initialize() {
        colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
        colMediaCategory.setCellValueFactory(new PropertyValueFactory<Media, String>("category"));
        colMediaCost.setCellValueFactory(new PropertyValueFactory<Media, String>("cost"));
        tblMedia.setItems(cart.getItemsOrdered());
        btnDetails.setVisible(false);
        
        btnPlay.setVisible(false);
        btnRemove.setVisible(false);
        tblMedia.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Media>() {
            @Override
            public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue) {
                if (newValue != null) {
                    updateButtonBar(newValue);
                }
            }
        });
        
        tfFilter.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                showFilteredMedia(newValue);
            }

        });
        updateCost();
    }
    
    void updateCost() {
        lblCost.setText(String.format("%.2f $", cart.totalCost()));
    }
   
    void updateButtonBar(Media media) {
        btnRemove.setVisible(true);
        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
        }
        btnDetails.setVisible(true);
    }
    
    void showFilteredMedia(String input) {
        if (input == "") {
            tblMedia.setItems(cart.getItemsOrdered());
            return;
        }

        FilteredList<Media> filteredList = new FilteredList<>(Carts.getItemsOrdered());
        if (radioBtnFilterId.isSelected())
            filteredList.setPredicate((it) -> it.getId() == Integer.parseInt(input));
        else
            filteredList.setPredicate((it) -> it.isMatch(input));

        tblMedia.setItems(filteredList);
    }

    @FXML
    void btnSortPressed(ActionEvent event) {
        tblMedia.getSortOrder().clear();

        colMediaCost.setSortType(TableColumn.SortType.DESCENDING);

        if (event.getSource().toString().split("\'")[1].equals("Sort by Title")) {
            tblMedia.getSortOrder().add(colMediaTitle);
            tblMedia.getSortOrder().add(colMediaCost);
        } else {
            tblMedia.getSortOrder().add(colMediaCost);
            tblMedia.getSortOrder().add(colMediaTitle);
        }

        tblMedia.sort();
    }

    @FXML
    void btnDetailsPressed(ActionEvent event) {
        new DetailScreen(tblMedia.getSelectionModel().getSelectedItem());
    }
   
    @FXML
    void btnPlayPressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        ((Playable) media).play();
    }
    
    @FXML
    void btnRemovePressed(ActionEvent event) {
        Media media = tblMedia.getSelectionModel().getSelectedItem();
        cart.removeMedia(media);
        updateCost();
    }
   
    @FXML
    void btnPlaceOrderPressed(ActionEvent event) {
        if (Carts.getItemsOrdered().isEmpty())
            JOptionPane.showMessageDialog(null, "Cart is empty!", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            new PlaceOrderScreen();
            updateCost();
        }
    }

    @FXML
    void menuAddBook(ActionEvent event) {
        new AddBookToStoreScreen();
    }

    @FXML
    void menuAddCd(ActionEvent event) {
        new AddCompactDiscToStoreScreen();
    }

    @FXML
    void menuAddDvd(ActionEvent event) {
        new AddDigitalVideoDiscToStoreScreen();
    }

    @FXML
    void menuViewStore(ActionEvent event) {
        Aims.closeCartScreen();
        Aims.openStoreScreen();
    }
}