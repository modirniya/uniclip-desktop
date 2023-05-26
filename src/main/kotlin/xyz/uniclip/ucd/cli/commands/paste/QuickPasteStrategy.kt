package xyz.uniclip.ucd.cli.commands.paste

import xyz.uniclip.ucd.SQLiteHelper
import xyz.uniclip.ucd.util.ClipboardHelper

class QuickPasteStrategy : PasteStrategy {
    override fun paste(args: List<String>) {
        val retrievedText = ClipboardHelper.getValue()
        if (retrievedText.isNotEmpty()) {
            SQLiteHelper.addRecord(args[0], retrievedText)
        }
    }
}