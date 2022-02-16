package sample;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root.getChildren().add(strings);
        strings.setPadding(new Insets(10, 30, 10, 30));
        strings.setSpacing(20);
        Text text = new Text();

        strings.getChildren().add(lineOne);
        strings.getChildren().add(lineTwo);
        strings.getChildren().add(lineThree);
        strings.getChildren().add(lineFour);
        strings.getChildren().add(lineFive);

        lineOne.setSpacing(5);
        lineOne.getChildren().add(TextOne);
        lineOne.getChildren().add(boxOne);
        lineOne.getChildren().add(btnOneDown);

        lineTwo.setSpacing(5);
        lineTwo.getChildren().add(TextTwo);
        lineTwo.getChildren().add(boxTwo);
        lineTwo.getChildren().add(btnTwoUp);
        lineTwo.getChildren().add(btnTwoDown);

        lineThree.setSpacing(5);
        lineThree.getChildren().add(TextThree);
        lineThree.getChildren().add(boxThree);
        lineThree.getChildren().add(btnThreeUp);
        lineThree.getChildren().add(btnThreeDown);

        lineFour.setSpacing(5);
        lineFour.getChildren().add(TextFour);
        lineFour.getChildren().add(boxFour);
        lineFour.getChildren().add(btnFourUp);
        lineFour.getChildren().add(btnFourDown);

        lineFive.setSpacing(5);
        lineFive.getChildren().add(TextFive);
        lineFive.getChildren().add(boxFive);
        lineFive.getChildren().add(btnFiveUp);

        btnOneDown.setOnAction(e -> {
            if (!boxTwo.getText().equals("") & !boxOne.getText().equals("")){
                text.setText(boxOne.getText());
                boxOne.setText(boxTwo.getText());
                boxTwo.setText(text.getText());}
            else if(!boxThree.getText().equals("") & !boxOne.getText().equals("")){
                text.setText(boxOne.getText());
                boxOne.setText(boxThree.getText());
                boxThree.setText(text.getText());}
            else if(!boxFour.getText().equals("") & !boxOne.getText().equals("")){
                text.setText(boxOne.getText());
                boxOne.setText(boxFour.getText());
                boxFour.setText(text.getText());}
            else if(!boxFive.getText().equals("") & !boxOne.getText().equals("")){
                text.setText(boxOne.getText());
                boxOne.setText(boxFive.getText());
                boxFive.setText(text.getText());}});

        btnTwoUp.setOnAction(e -> {
            if (!boxTwo.getText().equals("") & !boxOne.getText().equals("")){
                text.setText(boxTwo.getText());
                boxTwo.setText(boxOne.getText());
                boxOne.setText(text.getText());}});

        btnTwoDown.setOnAction(e -> {
            if (!boxThree.getText().equals("") & !boxTwo.getText().equals("")){
                text.setText(boxTwo.getText());
                boxTwo.setText(boxThree.getText());
                boxThree.setText(text.getText());}
            else if(!boxFour.getText().equals("") & !boxTwo.getText().equals("")){
                text.setText(boxTwo.getText());
                boxTwo.setText(boxFour.getText());
                boxFour.setText(text.getText());}
            else if(!boxFive.getText().equals("") & !boxTwo.getText().equals("")){
                text.setText(boxTwo.getText());
                boxTwo.setText(boxFive.getText());
                boxFive.setText(text.getText());}});

        btnThreeUp.setOnAction(e -> {
            if (!boxThree.getText().equals("") & !boxTwo.getText().equals("")){
                text.setText(boxThree.getText());
                boxThree.setText(boxTwo.getText());
                boxTwo.setText(text.getText());}
            else if(!boxOne.getText().equals("") & !boxThree.getText().equals("")){
                text.setText(boxThree.getText());
                boxThree.setText(boxOne.getText());
                boxOne.setText(text.getText());}});

        btnThreeDown.setOnAction(e -> {
            if (!boxFour.getText().equals("") & !boxThree.getText().equals("")){
                text.setText(boxThree.getText());
                boxThree.setText(boxFour.getText());
                boxFour.setText(text.getText());}
            else if(!boxFive.getText().equals("") & !boxThree.getText().equals("")){
                text.setText(boxThree.getText());
                boxThree.setText(boxFive.getText());
                boxFive.setText(text.getText());}});

        btnFourUp.setOnAction(e -> {
            if (!boxFour.getText().equals("") & !boxThree.getText().equals("")){
                text.setText(boxFour.getText());
                boxFour.setText(boxThree.getText());
                boxThree.setText(text.getText());}
            else if(!boxTwo.getText().equals("") & !boxFour.getText().equals("")){
                text.setText(boxFour.getText());
                boxFour.setText(boxTwo.getText());
                boxTwo.setText(text.getText());}
            else if(!boxOne.getText().equals("") & !boxFour.getText().equals("")){
                text.setText(boxFour.getText());
                boxFour.setText(boxOne.getText());
                boxOne.setText(text.getText());}});

        btnFourDown.setOnAction(e -> {
            if (!boxFive.getText().equals("") & !boxFour.getText().equals("")){
                text.setText(boxFour.getText());
                boxFour.setText(boxFive.getText());
                boxFive.setText(text.getText());}});

        btnFiveUp.setOnAction(e -> {
            if (!boxFive.getText().equals("") & !boxFour.getText().equals("")){
                text.setText(boxFive.getText());
                boxFive.setText(boxFour.getText());
                boxFour.setText(text.getText());}
            else if(!boxThree.getText().equals("") & !boxFive.getText().equals("")){
                text.setText(boxFive.getText());
                boxFive.setText(boxThree.getText());
                boxThree.setText(text.getText());}
            else if(!boxTwo.getText().equals("") & !boxFive.getText().equals("")){
                text.setText(boxFive.getText());
                boxFive.setText(boxTwo.getText());
                boxTwo.setText(text.getText());}
            else if(!boxOne.getText().equals("") & !boxFive.getText().equals("")){
                text.setText(boxFive.getText());
                boxFive.setText(boxOne.getText());
                boxOne.setText(text.getText());}});

        boxTwo.setEditable(false);
        boxThree.setEditable(false);
        boxFour.setEditable(false);
        boxFive.setEditable(false);

        boxOne.textProperty().addListener((observableValue, s, t1)-> {
            boxTwo.setEditable(true);
            if(boxOne.getLength() > 20){
                TextOne.setText("err");} else {TextOne.setText("    ");}});

        boxTwo.textProperty().addListener((observableValue, s, t1)-> {
            boxThree.setEditable(true);
            if(boxTwo.getLength() > 20){
                TextTwo.setText("err");} else {TextTwo.setText("    ");}});

        boxThree.textProperty().addListener((observableValue, s, t1)-> {
            boxFour.setEditable(true);
            if(boxThree.getLength() > 20){
                TextThree.setText("err");} else {TextThree.setText("    ");}});

        boxFour.textProperty().addListener((observableValue, s, t1)-> {
            boxFive.setEditable(true);
            if(boxFour.getLength() > 20){
                TextFour.setText("err");} else {TextFour.setText("    ");}});

        boxFive.textProperty().addListener((observableValue, s, t1)-> {
            if(boxFive.getLength() > 20){
                TextFive.setText("err");} else {TextFive.setText("    ");}});

        int WIDTH = 300;
        int HEIGHT = 250;
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setTitle("Doubly Linked List");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    Group root = new Group();
    VBox strings = new VBox();

    HBox lineOne = new HBox();
    Text TextOne = new Text("    ");
    TextField boxOne = new TextField();
    Button btnOneDown = new Button("down");

    HBox lineTwo = new HBox();
    Text TextTwo = new Text("    ");
    TextField boxTwo = new TextField();
    Button btnTwoUp = new Button("up");
    Button btnTwoDown = new Button("down");

    HBox lineThree = new HBox();
    Text TextThree = new Text("    ");
    TextField boxThree = new TextField();
    Button btnThreeUp = new Button("up");
    Button btnThreeDown = new Button("down");

    HBox lineFour = new HBox();
    Text TextFour = new Text("    ");
    TextField boxFour = new TextField();
    Button btnFourUp = new Button("up");
    Button btnFourDown = new Button("down");

    HBox lineFive = new HBox();
    Text TextFive = new Text("    ");
    TextField boxFive = new TextField();
    Button btnFiveUp = new Button("up");
}