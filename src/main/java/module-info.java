module com.example.currencyconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.uniTech.currencyconverter to javafx.fxml;
    exports com.uniTech.currencyconverter;
}