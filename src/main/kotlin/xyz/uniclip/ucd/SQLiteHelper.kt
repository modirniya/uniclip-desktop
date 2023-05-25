package xyz.uniclip.ucd

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

object SQLiteHelper {

    private var connection: Connection? = null

    init {
        try {
            Class.forName("org.sqlite.JDBC")
            connection = DriverManager.getConnection("jdbc:sqlite:mydb.db")
            val statement = connection!!.createStatement()
            statement.queryTimeout = 30  // set timeout to 30 sec.
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS records" +
                    " (key VARCHAR(50) PRIMARY KEY, value TEXT NOT NULL)")
        } catch (e: Exception) {
            println(e.message)
        }
    }

    fun addRecord(key: String, value: String) {
        try {
            val preparedStatement = connection!!.prepareStatement("INSERT INTO records VALUES(?, ?)")
            preparedStatement.setString(1, key)
            preparedStatement.setString(2, value)
            preparedStatement.executeUpdate()
        } catch (e: SQLException) {
            println(e.message)
        }

    }

    fun getRecord(key: String): String? {
        try {
            val preparedStatement = connection!!.prepareStatement("SELECT value FROM records WHERE key = ?")
            preparedStatement.setString(1, key)
            val rs = preparedStatement.executeQuery()
            if (rs.next()) {
                return rs.getString("value")
            }
        } catch (e: SQLException) {
            println(e.message)
        }
        return null
    }

    fun getAllRecords(): Map<String, String> {
        val records = mutableMapOf<String, String>()
        try {
            val statement = connection!!.createStatement()
            val rs = statement.executeQuery("SELECT * FROM records")
            while (rs.next()) {
                records[rs.getString("key")] = rs.getString("value")
            }
        } catch (e: SQLException) {
            println(e.message)
        }
        return records
    }

    fun removeRecord(key: String) {
        try {
            val preparedStatement = connection!!.prepareStatement("DELETE FROM records WHERE key = ?")
            preparedStatement.setString(1, key)
            preparedStatement.executeUpdate()
        } catch (e: SQLException) {
            println(e.message)
        }
    }
}
