package xyz.uniclip.ucd.repository

import javafx.collections.FXCollections
import xyz.uniclip.ucd.model.Record

object RecordsRepository {
    private val dataSet = FXCollections.observableHashMap<String, Record>()

    fun addRecord(record: Record) {
        dataSet[record.key] = record
    }

    fun getRecord(key: String): Record? {
        return dataSet[key]
    }

    fun getAllRecords(): MutableCollection<Record> {
        return dataSet.values
    }
}