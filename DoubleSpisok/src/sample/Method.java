package sample;
import javafx.scene.text.Text;

public class Method {
    public String UpField(String one, String two){
        Text text = new Text();
        Text boxOne = new Text(one);
        Text boxTwo = new Text(two);
        text.setText(boxOne.getText());
        boxOne.setText(boxTwo.getText());
        boxTwo.setText(text.getText());
        return boxOne.getText();
    }}

