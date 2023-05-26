package xyz.uniclip.ucd.ui.controller

import javafx.collections.FXCollections
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TableView
import xyz.uniclip.ucd.SQLiteHelper
import xyz.uniclip.ucd.model.Record
import xyz.uniclip.ucd.util.ClipboardHelper
import java.net.URL
import java.util.*

class HomeController : Initializable{
    @FXML
    private lateinit var tvItems: TableView<Record>

    fun onPaste() {

    }

    fun onCopy() {
        val record = tvItems.selectionModel.selectedItem
        if (record!=null) ClipboardHelper.setValue(record.value)
    }

    fun onCut() {

    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        val items = SQLiteHelper.getAllRecords()
        val ol = FXCollections.observableArrayList<Record>()
        items.forEach { ol.add(Record(it.key, it.value)) }
        tvItems.items = ol
    }
}