package com.uniTech.currencyconverter;
/*
* Bsc-com-10-19
* Ezekiel Banda Computer Science student at University of Malawi
*
* Currency converter interface JavaFx Project, it will be
* functional in few days to come
* */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorInterface extends Application {

    private final Label headerLabel = new Label();
    private final Label myLabel = new Label("USD:");
    private final Label eurLabel = new Label("EUR:");
    private final TextField myTextField = new TextField();
    private final TextField eurTextField = new TextField();

    @Override
    public void start(Stage stage) throws IOException {

        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: skyblue");

        headerLabel.setText("Currency Converter");
        headerLabel.setPadding(new Insets(40,10,1,70));
        headerLabel.setFont(Font.font(15));

        //Flow pane for laying out label and text field
        FlowPane flowPane1 = new FlowPane();
        flowPane1.setPadding(new Insets(50,12,15,30));
        flowPane1.setHgap(5);
        flowPane1.setVgap(5);
        myLabel.setFont(Font.font(16));

        FlowPane flowPane2 = new FlowPane();
        flowPane2.setPadding(new Insets(40,12,20,30));
        flowPane2.setHgap(5);
        flowPane2.setVgap(5);
        eurLabel.setFont(Font.font(16));

        //Placing the label and text field in the flow pane
        flowPane1.getChildren().addAll(myLabel,myTextField);
        flowPane2.getChildren().addAll(eurLabel,eurTextField);

        //HBox for laying out buttons
        HBox firstButtons = new HBox();
        Button button0 = new Button("7");
        button0.setStyle("-fx-background-color: lightblue");
        button0.setPrefSize(90,30);
        button0.setFont(Font.font(20));

        Button button1 = new Button("8");
        button1.setStyle("-fx-background-color: lightblue");
        button1.setPrefSize(90,30);
        button1.setFont(Font.font(20));

        Button button2 = new Button("9");
        button2.setStyle("-fx-background-color: lightblue");
        button2.setPrefSize(90,30);
        button2.setFont(Font.font(20));

        //Placing Buttons into the First HBox
        firstButtons.getChildren().addAll(button0,button1,button2);

        HBox secondButtons = new HBox();
        Button button3 = new Button("4");
        button3.setStyle("-fx-background-color: lightblue");
        button3.setPrefSize(90,30);
        button3.setFont(Font.font(20));


        Button button4 = new Button("5");
        button4.setStyle("-fx-background-color: lightblue");
        button4.setPrefSize(90,30);
        button4.setFont(Font.font(20));

        Button button5 = new Button("6");
        button5.setStyle("-fx-background-color: lightblue");
        button5.setPrefSize(90,30);
        button5.setFont(Font.font(20));

        //Placing Buttons into the Second HBox
        secondButtons.getChildren().addAll(button3,button4,button5);

        HBox thirdButtons = new HBox();
        Button button6 = new Button("1");
        button6.setStyle("-fx-background-color: lightblue");
        button6.setPrefSize(90,30);
        button6.setFont(Font.font(20));

        Button button7 = new Button("2");
        button7.setStyle("-fx-background-color: lightblue");
        button7.setPrefSize(90,30);
        button7.setFont(Font.font(20));

        Button button8 = new Button("3");
        button8.setStyle("-fx-background-color: lightblue");
        button8.setPrefSize(90,30);
        button8.setFont(Font.font(20));

        //Placing Buttons into the third HBox
        thirdButtons.getChildren().addAll(button6,button7,button8);

        HBox lastButtons = new HBox();
        Button button9 = new Button("C");
        button9.setStyle("-fx-background-color: lightblue");
        button9.setPrefSize(90,30);
        button9.setFont(Font.font(20));

        Button button10 = new Button("0");
        button10.setStyle("-fx-background-color: lightblue");
        button10.setPrefSize(90,30);
        button10.setFont(Font.font(20));

        Button button11 = new Button(".");
        button11.setStyle("-fx-background-color: lightblue");
        button11.setPrefSize(90,30);
        button11.setFont(Font.font(20));

        //Placing Buttons into the last HBox
        lastButtons.getChildren().addAll(button9,button10,button11);

        //Placing the nodes into the main container
        vBox.getChildren().addAll(headerLabel,flowPane1,flowPane2,
                firstButtons,secondButtons,thirdButtons,lastButtons);


        Scene scene = new Scene(vBox, 260, 413);
        stage.setTitle("Currency Converter");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}