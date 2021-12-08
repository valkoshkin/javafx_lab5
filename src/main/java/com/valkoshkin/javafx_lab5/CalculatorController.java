package com.valkoshkin.javafx_lab5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private Label calculationLabel;

    @FXML
    protected void onCeButtonClick() {
        calculationLabel.setText("1337");
    }
}