package xyz.uniclip.ucd.ui

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class UniclipApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(UniclipApplication::class.java.getResource("/xyz/uniclip/ucd/views/home.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Uniclip Desktop UI"
        stage.scene = scene
        stage.show()
    }
}

//fun main() {
//    Application.launch(HelloApplication::class.java)
//}