package sample;

import com.jfoenix.controls.JFXToggleButton;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import java.time.LocalTime;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    private Button decimalBinary;
    @FXML
    private TextField inputFiled1;
    @FXML
    private TextField inputFiled2;
    @FXML
    private TitledPane help;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button point;
    @FXML
    private JFXToggleButton total;
    @FXML
    private JFXToggleButton division;
    @FXML
    private JFXToggleButton multiplication;
    @FXML
    private JFXToggleButton submission;
    @FXML
    private JFXToggleButton sin;
    @FXML
    private JFXToggleButton cos;
    @FXML
    private JFXToggleButton tan;
    @FXML
    private JFXToggleButton cot;

    @FXML
    private Button equal;
    @FXML
    private Button deleteMemory;
    @FXML
    private JFXToggleButton ToggleButton1;
    @FXML
    private JFXToggleButton ToggleButton2;
    @FXML
    private TextField result;

    @FXML
    private Button music;

    @FXML
    private Button timer;

    @FXML
    private JFXToggleButton Multiplication;

    @FXML
    private JFXToggleButton Submission;

    @FXML
    private Label time;

    private Boolean bol = true;


    @FXML
    public void Zero(ActionEvent e) throws IOException {
        //Value and display the number 0 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "0");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "0");
    }

    @FXML
    public void One(ActionEvent e) throws IOException{
        //Value and display the number 1 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "1");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "1");
    }

    @FXML
    public void Two(ActionEvent e) throws IOException{
        //Value and display the number 2 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "2");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "2");
    }

    @FXML
    public void Three(ActionEvent e) throws IOException{
        //Value and display the number 3 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "3");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "3");
    }

    @FXML
    public void Four(ActionEvent e) throws IOException{
        //Value and display the number 4 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "4");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "4");
    }

    @FXML
    public void Five(ActionEvent e) throws IOException{
        //Value and display the number 5 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "5");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "5");
    }

    @FXML
    public void Six(ActionEvent e) throws IOException{
        //Value and display the number 6 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "6");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "6");
    }

    @FXML
    public void Seven(ActionEvent e) throws IOException{
        //Value and display the number 7 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "7");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "7");
    }

    @FXML
    public void Eight(ActionEvent e) throws IOException{
        //Value and display the number 7 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "8");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "8");
    }

    @FXML
    public void Nine(ActionEvent e) throws IOException{
        //Value and display the number 9 if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + "9");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + "9");
    }

    @FXML
    public void Point(ActionEvent e) throws IOException{
        //Value and display the . if clicked by the user
        if(ToggleButton1.isSelected())
            inputFiled1.setText(inputFiled1.getText() + ".");
        else if(ToggleButton2.isSelected())
            inputFiled2.setText(inputFiled2.getText() + ".");
    }


    @FXML
    public void Equal(ActionEvent e) throws IOException{
        //According to user clicks, and select a math operation;
        // The result will be displayed
        if(total.isSelected())
        {
            double input1 = Integer.parseInt(inputFiled1.getText().toString());
            double input2 = Integer.parseInt(inputFiled2.getText().toString());
            double totalRes = input1 + input2;
            result.setText(totalRes + "");
        }
        else if(division.isSelected())
        {
            double input1 = Integer.parseInt(inputFiled1.getText().toString());
            double input2 = Integer.parseInt(inputFiled2.getText().toString());
            double divisionRes = input1 / input2;
            result.setText(divisionRes + "");
        }
        else if(multiplication.isSelected())
        {
            double input1 = Integer.parseInt(inputFiled1.getText().toString());
            double input2 = Integer.parseInt(inputFiled2.getText().toString());
            double MultiplicationRes = input1 * input2;
            result.setText(MultiplicationRes + "");
        }
        else if(submission.isSelected())
        {
            double input1 = Integer.parseInt(inputFiled1.getText().toString());
            double input2 = Integer.parseInt(inputFiled2.getText().toString());
            double SubmissionRes = input1 - input2;
            result.setText(SubmissionRes + "");
        }
        else if(sin.isSelected())
        {
            double input;
            if (ToggleButton1.isSelected())
            {
                input = Integer.parseInt(inputFiled1.getText().toString());
            }
            else
            {
                input = Integer.parseInt(inputFiled2.getText().toString());
            }
            double radians1 = Math.toRadians(input);
            double SinRes = Math.sin(radians1);
            result.setText(SinRes + "");
        }
        else if (cos.isSelected())
        {
            double input;
            if (ToggleButton1.isSelected())
            {
                input = Integer.parseInt(inputFiled1.getText().toString());
            }
            else
            {
                input = Integer.parseInt(inputFiled2.getText().toString());
            }
            double radians2 = Math.toRadians(input);
            double CosRes = Math.cos(radians2);
            result.setText(CosRes + "");
        }
        else if (tan.isSelected())
        {
            double input;
            if (ToggleButton1.isSelected())
            {
                input = Integer.parseInt(inputFiled1.getText().toString());
            }
            else
            {
                input = Integer.parseInt(inputFiled2.getText().toString());
            }
            double radians3 = Math.toRadians(input);
            double TanRes = Math.tan(radians3);
            result.setText(TanRes + "");
        }
        else if (cot.isSelected())
        {
            double input;
            if (ToggleButton1.isSelected())
            {
                input = Integer.parseInt(inputFiled1.getText().toString());
            }
            else
            {
                input = Integer.parseInt(inputFiled2.getText().toString());
            }
            double CotRes = 1.0 / Math.tan(input);;
            result.setText(CotRes + "");
        }
    }


    @FXML
    public void DecimalBinary(){
        //In this method, operations related to converting numbers in decimal to binary mode
        // and vice versa are performed
            int input = Integer.parseInt(inputFiled1.getText().toString());
            int decimalNumber;
            int i = 1;
            int binaryNumber[] = new int[100];

          //Get the decimal number
            decimalNumber = input;

            while(decimalNumber != 0)
            {
                binaryNumber[i++] = decimalNumber % 2;
                decimalNumber = decimalNumber / 2;
            }

          //Generate a binary number
            for(int j=i-1; j>0; j--)
            {
                String binaryStr = String.valueOf(binaryNumber[j]);
                result.setText(binaryStr);
            }
    }

    @FXML
    public void DeleteMemory(){
        //Clicking this button will clear the calculator memory
        inputFiled1.clear();
        inputFiled2.clear();
        result.clear();
    }

    @FXML
    void Timer(ActionEvent event) {
        time.setTextFill(Color.valueOf("#e6e5dc"));
    }

    @FXML
    void Music(ActionEvent event) {
        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            LocalTime currentTime = LocalTime.now();
            time.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }
}
