package xyz.uniclip.ucd.ui.controller

import javafx.fxml.FXML
import javafx.scene.control.Label

class HomeController {
    @FXML
    private lateinit var welcomeText: Label

    @FXML
    private fun onHelloButtonClick() {
        welcomeText.text = "Welcome to JavaFX Application!"
    }
}