package xyz.uniclip.ucd.repository

import javafx.collections.FXCollections
import xyz.uniclip.ucd.model.Record

object RecordsRepository {
    private val dataSet = FXCollections.observableHashMap<String, Record>()

    fun addRecord(key: String, value: String) {
        dataSet[key] = Record(key,value)
    }

    fun getRecord(key: String): Record? {
        return dataSet[key]
    }

    fun getAllRecords(): MutableCollection<Record> {
        return dataSet.values
    }
}