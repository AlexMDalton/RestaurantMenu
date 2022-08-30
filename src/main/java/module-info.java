module com.example.restaurantmenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.restaurantmenu to javafx.fxml;
    exports com.example.restaurantmenu;
}