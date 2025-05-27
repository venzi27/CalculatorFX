package com.example.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class NumberController {

    @FXML
    private Button Add;

    @FXML
    private Button Divide;

    @FXML
    private Button Equal;

    @FXML
    private GridPane Grid;

    @FXML
    private Button Minus;

    @FXML
    private Button Times;

    @FXML
    private Button clear;

    @FXML
    private Pane containerTextFIeld;

    @FXML
    private Button delete;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button percent;

    @FXML
    private Button point;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button squared;

    @FXML
    private TextField textField;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    // classNeeded
    private StringBuilder current = new StringBuilder();
    private StringBuilder secondAppend = new StringBuilder();
    private String operator = "";
    private int result;
    private int num1;
    private int num2;

    @FXML
    void add(ActionEvent event) {

        if (!textField.getText().isEmpty()) {
            secondAppend.setLength(0);
            secondAppend.append(textField.getText());
            operator = "+";
            textField.setText("");
            current.setLength(0);
        }

    }

    @FXML
    void clear(ActionEvent event) {
        if (textField.getText().length() != 0) {
            current.setLength(0);
            textField.setText(current.toString());
        } else {
            textField.setText("Nothing to Clear");
        }
    }

    @FXML
    void delete(ActionEvent event) {
        if (current.length() > 0) {
            current.deleteCharAt(current.length() - 1);
            textField.setText(current.toString());
        }
    }

    @FXML
    void division(ActionEvent event) {
        if (!textField.getText().isEmpty()) {
            secondAppend.setLength(0);
            secondAppend.append(textField.getText());
            operator = "/";
            textField.setText("");
            current.setLength(0);
        }

    }

    @FXML
    void squared(ActionEvent event) {
        if (current.length() > 0) {
            secondAppend.setLength(0);
            double s = Math.pow(Integer.parseInt(current.toString()), 2);
            textField.setText(String.valueOf((int) s));
            current.setLength(0);
            secondAppend.append(s);

        }
    }

    @FXML
    void eight(ActionEvent event) {
        current.append("8");
        textField.setText(current.toString());

    }

    @FXML
    void equal(ActionEvent event) {
        if (secondAppend.length() == 0 || current.length() == 0) {
            textField.setText("Invalid Input");
            return;
        }

        try {
            num1 = Integer.parseInt(secondAppend.toString());
            num2 = Integer.parseInt(current.toString());
        } catch (NumberFormatException e) {
            textField.setText("Invalid Number Format");
            return;
        }

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "x":
                result = num1 * num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = (num2 == 0) ? 0 : num1 / num2;
                break;
            default:
                break;
        }

        textField.setText(String.valueOf(result));
        secondAppend.setLength(0);

        if (secondAppend.length() == 0) {
            secondAppend.append(result);
        }
        current.setLength(0);

    }

    @FXML
    void five(ActionEvent event) {
        current.append("5");
        textField.setText(current.toString());
    }

    @FXML
    void four(ActionEvent event) {
        current.append("4");
        textField.setText(current.toString());
    }

    @FXML
    void minus(ActionEvent event) {
        if (!textField.getText().isEmpty()) {
            secondAppend.setLength(0);
            secondAppend.append(textField.getText());
            operator = "-";
            textField.setText("");
            current.setLength(0);
        }

    }

    @FXML
    void nine(ActionEvent event) {
        current.append("9");
        textField.setText(current.toString());
    }

    @FXML
    void one(ActionEvent event) {
        current.append("1");
        textField.setText(current.toString());
    }

    @FXML
    void point(ActionEvent event) {
        current.append(".");
        textField.setText(current.toString());
    }

    @FXML
    void seven(ActionEvent event) {
        current.append("7");
        textField.setText(current.toString());
    }

    @FXML
    void six(ActionEvent event) {
        current.append("6");
        textField.setText(current.toString());
    }

    @FXML
    void three(ActionEvent event) {
        current.append("3");
        textField.setText(current.toString());
    }

    @FXML
    void times(ActionEvent event) {
        if (!textField.getText().isEmpty()) {
            secondAppend.setLength(0);
            secondAppend.append(textField.getText());
            operator = "x";
            textField.setText("");
            current.setLength(0);
        }

    }

    @FXML
    void two(ActionEvent event) {
        current.append("2");
        textField.setText(current.toString());
    }

    @FXML
    void zero(ActionEvent event) {
        current.append("0");
        textField.setText(current.toString());
    }

}
