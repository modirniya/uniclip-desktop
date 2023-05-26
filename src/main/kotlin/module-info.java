module xyz.uniclip.ucd {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.desktop;
    requires java.sql;

    opens xyz.uniclip.ucd.ui.controller to javafx.fxml;
    exports xyz.uniclip.ucd.ui.controller;
    exports xyz.uniclip.ucd.model;
    exports xyz.uniclip.ucd.ui;
}