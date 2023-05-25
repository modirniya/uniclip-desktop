package xyz.uniclip.ucd.cli.commands.list

import xyz.uniclip.ucd.SQLiteHelper
import xyz.uniclip.ucd.cli.commands.Command

class ListCommand : Command {
    override fun execute(args: List<String>) {
        val records = SQLiteHelper.getAllRecords()
        for (record in records) {
            println("${record.key}\t${record.value}")
        }
    }
}